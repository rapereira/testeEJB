package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Leitura;
import br.edu.nsi.iff.Pico;

public class PicoJPAController extends AbstractPersistence{

	public void insert(Leitura leitura, String uid, float amplitude, float fase, float frequencia){
		
		br.edu.nsi.iff.Pico Pico = new Pico();
		
		Pico.setLeitura(leitura);
		Pico.setIdpico(uid);
		Pico.setAmplitude(amplitude);
		Pico.setFase(fase);
		Pico.setFrequencia(frequencia);
		
		super.insert(Pico);
	}
	
	public void insert(Pico Pico){
		super.insert(Pico);
	}
	
	public void delete(String codigo){
		super.delete(Pico.class, codigo);
	}
	
	public void update(Leitura leitura, String uid, float amplitude, float fase, float frequencia){
		
		Pico Pico = find(uid);
		
		Pico.setLeitura(leitura);
		Pico.setIdpico(uid);
		Pico.setAmplitude(amplitude);
		Pico.setFase(fase);
		Pico.setFrequencia(frequencia);
		
		super.update(Pico);
	}
	
	public void update(Pico Pico){
		super.update(Pico);
	}
	
	public List<Pico> getLista(){
		return super.findAll(Pico.class);
	}
	
	public Pico find(String uid){
		return super.find(Pico.class, uid);
	}
	
	public List<Pico> findAll(){
		return super.findAll(Pico.class);
	}
}
