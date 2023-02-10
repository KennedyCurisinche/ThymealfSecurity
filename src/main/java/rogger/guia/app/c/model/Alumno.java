package rogger.guia.app.c.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {
	
	private static final long serialVersionUID = -897780274291164734L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idAlumno;
	private String codAlumno;
	private String alumno;
	private String contrasenia;
	private Boolean activo;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "rol_alu", joinColumns = @JoinColumn(name = "idalu", foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_alumno) references alumno(id_alumno)")), inverseJoinColumns = @JoinColumn(name = "idrol", foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_rol) references rol(id_rol)")))
	private List<Rol> roles = new ArrayList<>();

	public Alumno(String codAlumno, String alumno, String contrasenia, Boolean activo) {
		this.codAlumno = codAlumno;
		this.alumno = alumno;
		this.contrasenia = contrasenia;
		this.activo = activo;
	}
	
}
