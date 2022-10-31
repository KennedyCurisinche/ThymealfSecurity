package rogger.guia.app.s.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rogger.guia.app.c.model.Alumno;
import rogger.guia.app.c.repository.AlumnoRepository;
import rogger.guia.app.s.model.AlumnoPrincipal;

@Service
@Transactional
public class AlumnoDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Alumno alumno = repository.findByCodAlumno(username);
		return AlumnoPrincipal.build(alumno);
	}

}
