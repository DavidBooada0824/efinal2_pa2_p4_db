package com.example.demo.matricula.repo;

import com.example.demo.matricula.repo.modelo.Materia;

public interface IMateriaRepo {

	public void insertar(Materia materia);

	public Materia seleccionarPorCodigo(String codigo);
}
