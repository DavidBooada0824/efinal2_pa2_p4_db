package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repo.modelo.dto.MatriculaDto;

public interface IMatriculaService {

	public void guardar(String cedulaEstudiante, String mat1, String mat2, String mat3, String mat4);

	public List<MatriculaDto> buscarDto();

}
