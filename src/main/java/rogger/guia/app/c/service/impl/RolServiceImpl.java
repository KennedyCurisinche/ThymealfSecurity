package rogger.guia.app.c.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rogger.guia.app.c.emuns.NombreRol;
import rogger.guia.app.c.model.Rol;
import rogger.guia.app.c.repository.RolRepository;
import rogger.guia.app.c.service.RolService;

@Service
@Transactional
public class RolServiceImpl implements RolService {
	
	@Autowired
	private RolRepository repository;
	
	@Override
	public Rol getByRol(NombreRol nombre) {
		return repository.findByRol(nombre);
	}
	
}
