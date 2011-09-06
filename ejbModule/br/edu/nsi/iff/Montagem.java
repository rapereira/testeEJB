package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the montagem database table.
 * 
 */
@Entity
public class Montagem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idmontagem;

	private Timestamp dhfimmontagem;

	private Timestamp dhiniciomontagem;

	private String observacao;

	//bi-directional many-to-one association to Pontosmontagen
	@OneToMany(mappedBy="montagem")
	private List<Pontosmontagen> pontosmontagens;

    public Montagem() {
    }

	public String getIdmontagem() {
		return this.idmontagem;
	}

	public void setIdmontagem(String idmontagem) {
		this.idmontagem = idmontagem;
	}

	public Timestamp getDhfimmontagem() {
		return this.dhfimmontagem;
	}

	public void setDhfimmontagem(Timestamp dhfimmontagem) {
		this.dhfimmontagem = dhfimmontagem;
	}

	public Timestamp getDhiniciomontagem() {
		return this.dhiniciomontagem;
	}

	public void setDhiniciomontagem(Timestamp dhiniciomontagem) {
		this.dhiniciomontagem = dhiniciomontagem;
	}

	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public List<Pontosmontagen> getPontosmontagens() {
		return this.pontosmontagens;
	}

	public void setPontosmontagens(List<Pontosmontagen> pontosmontagens) {
		this.pontosmontagens = pontosmontagens;
	}
	
}