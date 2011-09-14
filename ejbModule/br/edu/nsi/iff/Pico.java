package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the pico database table.
 * 
 */
@Entity
public class Pico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idpico;

	private Timestamp datahora;

	private float valorpico;

	//bi-directional many-to-one association to Leitura
    @ManyToOne
	@JoinColumn(name="idleitura")
	private Leitura leitura;

    public Pico() {
    }

	public String getIdpico() {
		return this.idpico;
	}

	public void setIdpico(String idpico) {
		this.idpico = idpico;
	}

	public Timestamp getDatahora() {
		return this.datahora;
	}

	public void setDatahora(Timestamp datahora) {
		this.datahora = datahora;
	}

	public float getValorpico() {
		return this.valorpico;
	}

	public void setValorpico(float valorpico) {
		this.valorpico = valorpico;
	}

	public Leitura getLeitura() {
		return this.leitura;
	}

	public void setLeitura(Leitura leitura) {
		this.leitura = leitura;
	}
	
}