package com.example.demo.matricula.repo.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula {

	@SequenceGenerator(name = "seq_matri", sequenceName = "seq_matri", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_matri")
	@Id
	@Column(name = "matri_id")
	private Integer id;
	@Column(name = "matri_fecha")
	private LocalDate fecha;
	@Column(name = "matri_hilo")
	private String hilo;

	@ManyToOne
	@JoinColumn(name = "matr_id_materia")
	private Materia materia;
	@ManyToOne
	@JoinColumn(name = "matr_id_estu")
	private Estudiante estudiante;

	// get y set

	public Integer getId() {
		return id;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getHilo() {
		return hilo;
	}

	public void setHilo(String hilo) {
		this.hilo = hilo;
	}

}
