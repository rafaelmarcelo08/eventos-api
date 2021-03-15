package br.edu.pucgoias.eventosapi.domain;

import java.util.Date;

public class Evento {

	private Integer id;
	private String nome;
	private String local;
	private Double valor;
	private Date data;

	Evento() {
	}

	public Evento(Integer id, String nome, String local, Double valor, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.local = local;
		this.valor = valor;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}