package com.example.demo.matricula.repo.modelo.dto;

import java.time.LocalDate;

public class MatriculaDto {

	private String cedEstudiante;
	private String codMateria;
	private LocalDate fecha;
	private String nomHilo;

	public MatriculaDto() {

	}

	public MatriculaDto(String cedEstudiante, String codMateria, LocalDate fecha, String nomHilo) {
		this.cedEstudiante = cedEstudiante;
		this.codMateria = codMateria;
		this.fecha = fecha;
		this.nomHilo = nomHilo;
	}

	public String getCedEstudiante() {
		return cedEstudiante;
	}

	public void setCedEstudiante(String cedEstudiante) {
		this.cedEstudiante = cedEstudiante;
	}

	public String getCodMateria() {
		return codMateria;
	}

	public void setCodMateria(String codMateria) {
		this.codMateria = codMateria;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getNomHilo() {
		return nomHilo;
	}

	public void setNomHilo(String nomHilo) {
		this.nomHilo = nomHilo;
	}

	@Override
	public String toString() {
		return "MatriculaDto [cedEstudiante=" + cedEstudiante + ", codMateria=" + codMateria + ", fecha=" + fecha
				+ ", nomHilo=" + nomHilo + "]";
	}

}
