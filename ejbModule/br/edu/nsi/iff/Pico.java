package br.edu.nsi.iff;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pico database table.
 * 
 */
@Entity
public class Pico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idpico;

	private float amplitude;

	private float fase;

	private float frequencia;

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

	public float getAmplitude() {
		return this.amplitude;
	}

	public void setAmplitude(float amplitude) {
		this.amplitude = amplitude;
	}

	public float getFase() {
		return this.fase;
	}

	public void setFase(float fase) {
		this.fase = fase;
	}

	public float getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(float frequencia) {
		this.frequencia = frequencia;
	}

	public Leitura getLeitura() {
		return this.leitura;
	}

	public void setLeitura(Leitura leitura) {
		this.leitura = leitura;
	}
	
}