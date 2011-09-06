package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sensor database table.
 * 
 */
@Entity
public class Sensor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idsensor;

	private String descricao;

	private String fabricante;

	private String identificacao;

	private String modelo;

	private String range;

	private String sensibilidade;

	private String tipo;

	//bi-directional many-to-one association to Ponto
	@OneToMany(mappedBy="sensor")
	private List<Ponto> pontos;

    public Sensor() {
    }

	public String getIdsensor() {
		return this.idsensor;
	}

	public void setIdsensor(String idsensor) {
		this.idsensor = idsensor;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getIdentificacao() {
		return this.identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getRange() {
		return this.range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getSensibilidade() {
		return this.sensibilidade;
	}

	public void setSensibilidade(String sensibilidade) {
		this.sensibilidade = sensibilidade;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Ponto> getPontos() {
		return this.pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}
	
}