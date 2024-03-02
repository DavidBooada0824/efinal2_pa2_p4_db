package com.example.demo.matricula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.service.IMatriculaService;

@Controller
@RequestMapping("/matriculaciones")
public class MatriculacionHomeController {
	@Autowired
	private IMatriculaService iMatriculaService;

	@GetMapping("/home")
	public String paginaHome(Matricula matricula) {
		return "home";

	}

}
