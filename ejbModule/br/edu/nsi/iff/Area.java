package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the area database table.
 * 
 */
@Entity
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idarea;

	private String descricao;

	private String tagarea;

	//bi-directional many-to-one association to Planta
    @ManyToOne
	@JoinColumn(name="idplanta")
	private Planta planta;

	//bi-directional many-to-one association to Equipamento
	@OneToMany(mappedBy="area")
	private List<Equipamento> equipamentos;

    public Area() {
    }

	public String getIdarea() {
		return this.idarea;
	}

	public void setIdarea(String idarea) {
		this.idarea = idarea;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTagarea() {
		return this.tagarea;
	}

	public void setTagarea(String tagarea) {
		this.tagarea = tagarea;
	}

	public Planta getPlanta() {
		return this.planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}
	
	public List<Equipamento> getEquipamentos() {
		return this.equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
}