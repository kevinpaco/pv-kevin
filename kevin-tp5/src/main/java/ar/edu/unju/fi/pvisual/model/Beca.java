package ar.edu.unju.fi.pvisual.model;

import java.time.LocalDate;

public class Beca {
	private int codigo;
	private String curso;
	private LocalDate fecha_inicio;
	private LocalDate fecha_fin;
	private String estado;
	
	public Beca() {
		super();
	}

	public Beca(int codigo, String curso, LocalDate fecha_inicio, LocalDate fecha_fin, String estado) {
		super();
		this.codigo = codigo;
		this.curso = curso;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public LocalDate getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(LocalDate fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public LocalDate getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(LocalDate fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
