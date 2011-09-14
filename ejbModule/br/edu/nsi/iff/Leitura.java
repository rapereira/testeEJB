package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the leitura database table.
 * 
 */
@Entity
public class Leitura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idleitura;

	private Timestamp datahora;

	private float deslocamento;

	private float rmspicos;

	private float rmsruido;

	private float rmstotal;

	private float rotacao;

	//bi-directional many-to-one association to Pontosmontagen
    @ManyToOne
	@JoinColumn(name="idpontosmontagens")
	private Pontosmontagen pontosmontagen;

	//bi-directional many-to-one association to Pico
	@OneToMany(mappedBy="leitura")
	private List<Pico> picos;

    public Leitura() {
    }

	public String getIdleitura() {
		return this.idleitura;
	}

	public void setIdleitura(String idleitura) {
		this.idleitura = idleitura;
	}

	public Timestamp getDatahora() {
		return this.datahora;
	}

	public void setDatahora(Timestamp datahora) {
		this.datahora = datahora;
	}

	public float getDeslocamento() {
		return this.deslocamento;
	}

	public void setDeslocamento(float deslocamento) {
		this.deslocamento = deslocamento;
	}

	public float getRmspicos() {
		return this.rmspicos;
	}

	public void setRmspicos(float rmspicos) {
		this.rmspicos = rmspicos;
	}

	public float getRmsruido() {
		return this.rmsruido;
	}

	public void setRmsruido(float rmsruido) {
		this.rmsruido = rmsruido;
	}

	public float getRmstotal() {
		return this.rmstotal;
	}

	public void setRmstotal(float rmstotal) {
		this.rmstotal = rmstotal;
	}

	public float getRotacao() {
		return this.rotacao;
	}

	public void setRotacao(float rotacao) {
		this.rotacao = rotacao;
	}

	public Pontosmontagen getPontosmontagen() {
		return this.pontosmontagen;
	}

	public void setPontosmontagen(Pontosmontagen pontosmontagen) {
		this.pontosmontagen = pontosmontagen;
	}
	
	public List<Pico> getPicos() {
		return this.picos;
	}

	public void setPicos(List<Pico> picos) {
		this.picos = picos;
	}
	
}