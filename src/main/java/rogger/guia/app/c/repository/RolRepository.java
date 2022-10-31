package rogger.guia.app.c.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rogger.guia.app.c.emuns.NombreRol;
import rogger.guia.app.c.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
	public Rol findByRol(NombreRol nombre);
}
