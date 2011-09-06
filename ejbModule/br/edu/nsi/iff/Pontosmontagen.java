package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the pontosmontagens database table.
 * 
 */
@Entity
@Table(name="pontosmontagens")
public class Pontosmontagen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idpontosmontagens;

	private Integer sequencialmontagemponto;

	//bi-directional many-to-one association to Leitura
	@OneToMany(mappedBy="pontosmontagen")
	private List<Leitura> leituras;

	//bi-directional many-to-one association to Montagem
    @ManyToOne
	@JoinColumn(name="idmontagem")
	private Montagem montagem;

	//bi-directional many-to-one association to Ponto
    @ManyToOne
	@JoinColumn(name="idponto")
	private Ponto ponto;

    public Pontosmontagen() {
    }

	public String getIdpontosmontagens() {
		return this.idpontosmontagens;
	}

	public void setIdpontosmontagens(String idpontosmontagens) {
		this.idpontosmontagens = idpontosmontagens;
	}

	public Integer getSequencialmontagemponto() {
		return this.sequencialmontagemponto;
	}

	public void setSequencialmontagemponto(Integer sequencialmontagemponto) {
		this.sequencialmontagemponto = sequencialmontagemponto;
	}

	public List<Leitura> getLeituras() {
		return this.leituras;
	}

	public void setLeituras(List<Leitura> leituras) {
		this.leituras = leituras;
	}
	
	public Montagem getMontagem() {
		return this.montagem;
	}

	public void setMontagem(Montagem montagem) {
		this.montagem = montagem;
	}
	
	public Ponto getPonto() {
		return this.ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}
	
}