package rogger.guia.app.c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import rogger.guia.app.c.service.AlumnoService;
import rogger.guia.app.c.service.RolService;
import rogger.guia.app.s.dto.NuevoUsuarioDTO;

@Controller
public class NuevoController {

	@Autowired
	private AlumnoService alumnoService;

	@Autowired
	private RolService rolService;

	@Autowired
	private PasswordEncoder encriptar;

	@GetMapping("/nuevo")
	public String formNuevo(Model model) {
		model.addAttribute("nuevo", new NuevoUsuarioDTO());
		return "nuevo";
	}

//	@PostMapping("/nuevo")
//	public String nuevo(@ModelAttribute("nuevo") NuevoUsuarioDTO u) {
//		Alumno alumno = new Alumno(u.getCodigo(), u.getAlumno(), encriptar.encode(u.getConstrasenia()), true);
//		
//		HashSet<Rol> roles = new HashSet<>();
//		if(u.getRol().trim().equals("user")) {
//			Rol rol = rolService.getByRol(NombreRol.ROLE_USER);
//			roles.add(rol);
//		} else if(u.getRol().trim().equals("admin")) {
//			Rol rol = rolService.getByRol(NombreRol.ROLE_ADMIN);
//			roles.add(rol);
//		}
//		
//		alumno.setRoles(roles);
//		
//		alumnoService.guardar(alumno);
//		
//		return "redirect:/login";
//	}

}
