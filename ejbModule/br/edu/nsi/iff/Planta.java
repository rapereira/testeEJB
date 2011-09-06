package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the planta database table.
 * 
 */
@Entity
public class Planta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idplanta;

	private String descricao;

	private String tagplanta;

	//bi-directional many-to-one association to Area
	@OneToMany(mappedBy="planta")
	private List<Area> areas;

    public Planta() {
    }

	public String getIdplanta() {
		return this.idplanta;
	}

	public void setIdplanta(String idplanta) {
		this.idplanta = idplanta;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTagplanta() {
		return this.tagplanta;
	}

	public void setTagplanta(String tagplanta) {
		this.tagplanta = tagplanta;
	}

	public List<Area> getAreas() {
		return this.areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	
}