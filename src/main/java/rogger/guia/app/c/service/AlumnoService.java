package rogger.guia.app.c.service;

import java.util.List;

import rogger.guia.app.c.model.Alumno;

public interface AlumnoService {
	void guardar(Alumno alumno);
	void actualizar(Long id, Alumno alumno);
	void eliminar(Long id);
	List<Alumno> listar();
	Alumno porId(Long id);
	Boolean exitePorId(Long id);
}
