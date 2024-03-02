package com.example.demo.matricula.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repo.IEstudianteRepo;
import com.example.demo.matricula.repo.IMateriaRepo;
import com.example.demo.matricula.repo.IMatriculaRepo;
import com.example.demo.matricula.repo.modelo.Materia;
import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.repo.modelo.dto.MatriculaDto;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	@Autowired
	private IMateriaRepo iMateriaRepo;
	@Autowired
	private IMatriculaRepo iMatriculaRepo;

	@Override
	public void guardar(String cedulaEstudiante, String materia1, String materia2, String materia3, String materia4) {
		// TODO Auto-generated method stub
		Thread hilo = Thread.currentThread();
		String nombreHilo = hilo.getName();
		Matricula matr = new Matricula();
		matr.setEstudiante(this.iEstudianteRepo.seleccionarPorCedula(cedulaEstudiante));
		List<Materia> materias = new ArrayList<>();
		Materia mat01 = this.iMateriaRepo.seleccionarPorCodigo(materia1);
		materias.add(mat01);
		Materia mat02 = this.iMateriaRepo.seleccionarPorCodigo(materia2);
		materias.add(mat02);
		Materia mat03 = this.iMateriaRepo.seleccionarPorCodigo(materia3);
		materias.add(mat03);
		Materia mat04 = this.iMateriaRepo.seleccionarPorCodigo(materia4);
		materias.add(mat04);
		matr.setHilo(nombreHilo);
		matr.setFecha(LocalDate.now());

		for (Materia m : materias) {
			matr.setMateria(m);
		}
		this.iMatriculaRepo.insertar(matr);
	}

	@Override
	public List<MatriculaDto> buscarDto() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.seleccionarDto();
	}

}
