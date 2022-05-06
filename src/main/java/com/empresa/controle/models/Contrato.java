package com.empresa.controle.models;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.empresa.controle.enums.Setor;

@Entity
@Table(name = "contratos")
public class Contrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@OneToOne
	@JoinColumn(name = "funcionario_id", referencedColumnName = "id")
	private Funcionario funcionario;

	@Enumerated(EnumType.STRING)
	@Column(name = "setor")
	private Setor setor;

	@Column(name = "salario")
	private BigDecimal salario;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_contratacao")
	private Calendar dataContratacao;
	
	// Contrutores
	public Contrato() {
	}

	public Contrato(Funcionario funcionario, Setor setor, BigDecimal salario, Calendar dataContratacao) {
		super();
		this.funcionario = funcionario;
		this.setor = setor;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
	}

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

}
