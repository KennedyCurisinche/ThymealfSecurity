package rogger.guia.app.c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rogger.guia.app.c.emuns.NombreRol;
import rogger.guia.app.c.model.Rol;
import rogger.guia.app.c.repository.RolRepository;

@Service
@Transactional
public class RolServiceImpl {
	@Autowired
	private RolRepository repository;
	
	public Rol getByRol(NombreRol nombre) {
		return repository.findByRol(nombre);
	}
}
