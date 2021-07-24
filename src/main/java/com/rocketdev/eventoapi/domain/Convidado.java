package com.rocketdev.eventoapi.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Classe que representa os dados na persistencia de 'Convidado'
 * 
 * @author Rafael Marcelo
 * 
 */
@Entity
@Table(name = "convidado")
public class Convidado implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Atributos */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_convidado")
	private Integer idConvidado;
	@Column(name = "nome_convidado")
	private String nome;
	@Column(name = "idade_convidado")
	private Integer idade;

	@ManyToOne()
	@JoinColumn(name = "evento_id")
	private Evento evento;

	/** Construtores */
	public Convidado() {
	}

	public Convidado(Integer idConvidado, String nome, Integer idade, Evento evento) {
		super();
		this.idConvidado = idConvidado;
		this.nome = nome;
		this.idade = idade;
		this.evento = evento;
	}

	/** Get e Sets */
	public Integer getIdConvidado() {
		return idConvidado;
	}

	public void setIdConvidado(Integer idConvidado) {
		this.idConvidado = idConvidado;
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

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	/** ToString */
	@Override
	public String toString() {
		return "Convidado [idConvidado=" + idConvidado + ", nome=" + nome + ", idade=" + idade + "]";
	}

	/** HashCode equals */
	@Override
	public int hashCode() {
		return Objects.hash(idConvidado);
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
		return Objects.equals(idConvidado, other.idConvidado);
	}
}
