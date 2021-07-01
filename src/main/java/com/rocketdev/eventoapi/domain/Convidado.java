package com.rocketdev.eventoapi.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que representa os dados na persistencia de 'Convidado'
 * 
 * @author Rafael Marcelo
 * 
 */
@Entity
@Table(name = "convidado")
public class Convidado {

	/** Atributos */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nome_convidado")
	private String nome;
	@Column(name = "idade_convidado")
	private Integer idade;

	/** Construtores */
	public Convidado() {
	}

	public Convidado(Integer id, String nome, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	/** Get e Sets */
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/** ToString */
	@Override
	public String toString() {
		return "Convidado [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

	/** hashCode equals */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(id, other.id);
	}
}
