package rogger.guia.app.c.service;

import rogger.guia.app.c.emuns.NombreRol;
import rogger.guia.app.c.model.Rol;

public interface RolService {
	public Rol getByRol(NombreRol nombre);
}
