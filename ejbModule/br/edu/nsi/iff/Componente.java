package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the componente database table.
 * 
 */
@Entity
public class Componente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idcomponente;

	private String descricao;

	private String tagcomponente;

	//bi-directional many-to-one association to Equipamento
    @ManyToOne
	@JoinColumn(name="idequipamento")
	private Equipamento equipamento;

	//bi-directional many-to-one association to Ponto
	@OneToMany(mappedBy="componente")
	private List<Ponto> pontos;

    public Componente() {
    }

	public String getIdcomponente() {
		return this.idcomponente;
	}

	public void setIdcomponente(String idcomponente) {
		this.idcomponente = idcomponente;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTagcomponente() {
		return this.tagcomponente;
	}

	public void setTagcomponente(String tagcomponente) {
		this.tagcomponente = tagcomponente;
	}

	public Equipamento getEquipamento() {
		return this.equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	public List<Ponto> getPontos() {
		return this.pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}
	
}