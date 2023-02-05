package rogger.guia.app.c.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rogger.guia.app.c.model.Alumno;
import rogger.guia.app.c.repository.AlumnoRepository;
import rogger.guia.app.c.service.AlumnoService;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public void guardar(Alumno alumno) {
		alumno.setIdAlumno(0L);
		repository.save(alumno);
	}

	@Override
	public void actualizar(Long id, Alumno alumno) {
		alumno.setIdAlumno(id);
		repository.save(alumno);
	}

	@Override
	public void eliminar(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Alumno> listar() {
		return repository.findAll();
	}

	@Override
	public Alumno porId(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public Boolean exitePorId(Long id) {
		return repository.existsById(id);
	}

}
