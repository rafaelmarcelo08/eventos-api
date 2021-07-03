package com.rocketdev.eventoapi.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe que representa os dados na persistencia de 'Evento'
 * 
 * @author Rafael Marcelo
 * 
 */
@Entity
@Table(name = "evento")
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** Atributos */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Integer idEvento;
	@Column(name = "nome_evento")
	private String nome;
	@Column(name = "local_evento")
	private String local;
	@Column(name = "valor_evento")
	private Double valor;
	@Column(name = "data_evento")
	private Date data;

	/** Construtores */
	public Evento() {
	}

	public Evento(Integer idEvento, String nome, String local, Double valor, Date data) {
		super();
		this.idEvento = idEvento;
		this.nome = nome;
		this.local = local;
		this.valor = valor;
		this.data = data;
	}

	/** Get e Sets */
	public Integer getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
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

	/** ToString */
	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", nome=" + nome + ", local=" + local + ", valor=" + valor + ", data="
				+ data + "]";
	}

	/** HashCode equals */
	@Override
	public int hashCode() {
		return Objects.hash(idEvento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(idEvento, other.idEvento);
	}

}
