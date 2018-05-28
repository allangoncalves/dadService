package com.ufrn.dad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Turma {

	@Id
	@Column(name = "id_turma")
	public Integer id;
	
	public String ano;
	
	public String nivel;
	
	public String periodo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_componente_curricular", referencedColumnName = "id_componente_curricular")
	public ComponenteCurricular componenteCurricular;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public ComponenteCurricular getComponente_curricular() {
		return componenteCurricular;
	}

	public void setComponente_curricular(ComponenteCurricular componente_curricular) {
		this.componenteCurricular = componente_curricular;
	}
	

	
	
}