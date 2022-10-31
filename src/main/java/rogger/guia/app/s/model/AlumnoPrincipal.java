package rogger.guia.app.s.model;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rogger.guia.app.c.model.Alumno;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoPrincipal implements UserDetails {
	private static final long serialVersionUID = 1L;
	
	private Alumno alumno;
	private Collection<? extends GrantedAuthority> auth;
	
	public static AlumnoPrincipal build(Alumno alumno) {
		List<GrantedAuthority> roles = alumno.getRoles()
				.stream()
				.map(r -> new SimpleGrantedAuthority(r.getRol().name()))
				.collect(Collectors.toList());
		return new AlumnoPrincipal(alumno, roles);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return auth;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return alumno.getContrasenia();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return alumno.getCodAlumno();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return alumno.getActivo();
	}
	
}
