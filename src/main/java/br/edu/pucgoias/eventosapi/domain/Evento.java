package br.edu.pucgoias.eventosapi.domain;

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
public class Evento {

	/** Atributos */
	/** Atributos */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
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

	public Evento(Integer id, String nome, String local, Double valor, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.local = local;
		this.valor = valor;
		this.data = data;
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
		return "Evento [id=" + id + ", nome=" + nome + ", local=" + local + ", valor=" + valor + ", data=" + data + "]";
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
		Evento other = (Evento) obj;
		return Objects.equals(id, other.id);
	}
}
