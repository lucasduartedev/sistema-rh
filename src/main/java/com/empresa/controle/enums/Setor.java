package com.empresa.controle.enums;

public enum Setor {
	
	DESENVOLVIMENTO(1, "Desenvolvimento"),
	RECURSOS_HUMANOS(2, "Recursos Humanos"),
	FINANCEIRO(3, "Financeiro");

	private final int id;
	private final String nomeSetor;

	Setor(int id, String nomeSetor) {
		this.id = id;
		this.nomeSetor = nomeSetor;
	}

	public int getId() {
		return id;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}
	
}
