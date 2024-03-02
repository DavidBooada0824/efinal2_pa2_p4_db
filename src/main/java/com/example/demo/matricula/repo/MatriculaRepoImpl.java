package com.example.demo.matricula.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Matricula;
import com.example.demo.matricula.repo.modelo.dto.MatriculaDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {

		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDto> seleccionarDto() {

		TypedQuery<MatriculaDto> query = this.entityManager.createQuery(

				"Select New com.example.demo.matricula.repo.modelo.dto.MatriculaDto"
						+ "(e.cedula,ma.codigo,m.fecha,m.hilo)" + "   From Matricula m "
						+ "  JOIN m.estudiante e " + "  JOIN m.materia ma",
				MatriculaDto.class);
		return query.getResultList();
	}

}
