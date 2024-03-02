package com.example.demo.matricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.repo.modelo.dto.MatriculaDto;
import com.example.demo.matricula.service.IMatriculaService;

@Controller
@RequestMapping("matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService iMatriculaService;

	@PostMapping("/insertar")
	public String insertar(@RequestParam("cedula") String cedula, 
			@RequestParam("cod1") String codigo1,
			@RequestParam("cod2") String codigo2, 
			@RequestParam("cod3") String codigo3, 
			@RequestParam("cod4") String codigo4) {
		this.iMatriculaService.guardar(cedula, codigo1, codigo2, codigo3, codigo4);
		return "redirect:/matriculas/nuevaMatricula";

	}

	@GetMapping("/nuevaMatricula")
	public String mostrarNuevaPersona(Matricula matricula) {
		return "vistaNuevaMatricula";
	}

	@GetMapping("/buscarTodos")
	public String buscarTodos(Model modelo) {
		List<MatriculaDto> lista = this.iMatriculaService.buscarDto();
		modelo.addAttribute("matriculas", lista);
		return "vistaListaMatriculas";
	}
}
