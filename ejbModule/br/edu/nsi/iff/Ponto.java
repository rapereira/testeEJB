package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ponto database table.
 * 
 */
@Entity
public class Ponto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idponto;

	private String descricao;

	private String posicao;

	private String tagponto;

	private String tipomedicao;

	private float valoralerta;

	private float valorshutdown;

	//bi-directional many-to-one association to Componente
    @ManyToOne
	@JoinColumn(name="idcomponente")
	private Componente componente;

	//bi-directional many-to-one association to Sensor
    @ManyToOne
	@JoinColumn(name="idsensor")
	private Sensor sensor;

	//bi-directional many-to-one association to Pontosmontagen
	@OneToMany(mappedBy="ponto")
	private List<Pontosmontagen> pontosmontagens;

    public Ponto() {
    }

	public String getIdponto() {
		return this.idponto;
	}

	public void setIdponto(String idponto) {
		this.idponto = idponto;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPosicao() {
		return this.posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getTagponto() {
		return this.tagponto;
	}

	public void setTagponto(String tagponto) {
		this.tagponto = tagponto;
	}

	public String getTipomedicao() {
		return this.tipomedicao;
	}

	public void setTipomedicao(String tipomedicao) {
		this.tipomedicao = tipomedicao;
	}

	public float getValoralerta() {
		return this.valoralerta;
	}

	public void setValoralerta(float valoralerta) {
		this.valoralerta = valoralerta;
	}

	public float getValorshutdown() {
		return this.valorshutdown;
	}

	public void setValorshutdown(float valorshutdown) {
		this.valorshutdown = valorshutdown;
	}

	public Componente getComponente() {
		return this.componente;
	}

	public void setComponente(Componente componente) {
		this.componente = componente;
	}
	
	public Sensor getSensor() {
		return this.sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	public List<Pontosmontagen> getPontosmontagens() {
		return this.pontosmontagens;
	}

	public void setPontosmontagens(List<Pontosmontagen> pontosmontagens) {
		this.pontosmontagens = pontosmontagens;
	}
	
}