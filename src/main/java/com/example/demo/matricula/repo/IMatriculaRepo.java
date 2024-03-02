package com.example.demo.matricula.repo;

import java.util.List;

import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.repo.modelo.dto.MatriculaDto;

public interface IMatriculaRepo {

	public void insertar(Matricula matricula);

	public List<MatriculaDto> seleccionarDto();

}
