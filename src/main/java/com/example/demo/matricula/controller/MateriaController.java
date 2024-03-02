package com.example.demo.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.matricula.repo.modelo.Materia;
import com.example.demo.matricula.service.IMateriaService;

@Controller
@RequestMapping("materias")
public class MateriaController {

	@Autowired
	private IMateriaService iMateriaService;

	@PostMapping("/insertar")
	public String insertar(Materia materia) {
		this.iMateriaService.guardar(materia);
		return "redirect:/materias/nuevaMateria";

	}

	@GetMapping("/nuevaMateria")
	public String mostrarNuevaPersona(Materia materia, Model modelo) {
		modelo.addAttribute("materia", materia);
		return "vistaNuevaMateria";
	}
}
