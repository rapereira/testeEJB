package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the equipamento database table.
 * 
 */
@Entity
public class Equipamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idequipamento;

	private String descricao;

	private String fabricante;

	private String tagequipamento;

	private String tipo;

	//bi-directional many-to-one association to Componente
	@OneToMany(mappedBy="equipamento")
	private List<Componente> componentes;

	//bi-directional many-to-one association to Area
    @ManyToOne
	@JoinColumn(name="idarea")
	private Area area;

    public Equipamento() {
    }

	public String getIdequipamento() {
		return this.idequipamento;
	}

	public void setIdequipamento(String idequipamento) {
		this.idequipamento = idequipamento;
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

	public String getTagequipamento() {
		return this.tagequipamento;
	}

	public void setTagequipamento(String tagequipamento) {
		this.tagequipamento = tagequipamento;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Componente> getComponentes() {
		return this.componentes;
	}

	public void setComponentes(List<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
}