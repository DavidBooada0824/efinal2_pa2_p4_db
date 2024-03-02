package com.example.demo.matricula.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MateriaRepoImpl implements IMateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override

	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	public Materia seleccionarPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Materia> myQuery = this.entityManager.
				createQuery("SELECT m FROM Materia m WHERE m.codigo=:DatoCodigo",
				Materia.class);
		myQuery.setParameter("DatoCodigo", codigo);
		return myQuery.getSingleResult();
	}

}
