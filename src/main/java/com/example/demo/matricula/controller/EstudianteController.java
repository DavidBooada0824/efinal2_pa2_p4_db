package com.example.demo.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.matricula.repo.modelo.Estudiante;
import com.example.demo.matricula.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {

	@Autowired
	private IEstudianteService iEstudianteService;

	@PostMapping("/insertar")
	public String insertar(Estudiante estudiante) {
		this.iEstudianteService.guardar(estudiante);
		return "redirect:/estudiantes/nuevoEstudiante";

	}

	@GetMapping("/nuevoEstudiante")
	public String mostrarNuevaPersona(Estudiante estudiante, Model modelo) {
		modelo.addAttribute("estudiante", estudiante);
		return "vistaNuevoEstudiante";
	}

}
