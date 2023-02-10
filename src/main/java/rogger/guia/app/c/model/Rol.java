package rogger.guia.app.c.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rogger.guia.app.c.emuns.NombreRol;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity	
@Table(name = "rol")
public class Rol implements Serializable {
	
	private static final long serialVersionUID = -2485898877390183389L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idRol;
	@Enumerated(EnumType.STRING)
	private NombreRol rol;
	
	@ManyToMany(mappedBy = "roles", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Alumno> alumnos = new ArrayList<>();
	
}
