package rogger.guia.app.c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rogger.guia.app.c.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	
	Alumno findByCodAlumno(String username);
	
}
