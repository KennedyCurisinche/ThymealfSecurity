package rogger.guia.app.c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import rogger.guia.app.c.service.AlumnoService;

@Controller
@RequestMapping("/inicio")
public class InicioController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping("/lista-alumno")
	public String inicio(Model model) {
		model.addAttribute("listAlumno", service.listar());
		return "inicio";
	}
	
}
