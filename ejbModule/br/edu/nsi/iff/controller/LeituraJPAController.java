package br.edu.nsi.iff.controller;

import java.sql.Timestamp;
import java.util.List;

import br.edu.nsi.iff.Leitura;
import br.edu.nsi.iff.Pontosmontagen;

public class LeituraJPAController extends AbstractPersistence {

	public void insert(Pontosmontagen pontosmontagen, String uid, Timestamp datahora, float deslocamento, float rmspicos, float rmsruido, float rmstotal, float rotacao){
		
		Leitura Leitura = new Leitura();
		
		Leitura.setPontosmontagen(pontosmontagen);
		Leitura.setIdleitura(uid);
		Leitura.setDatahora(datahora);
		Leitura.setDeslocamento(deslocamento);
		Leitura.setRmspicos(rmspicos);
		Leitura.setRmsruido(rmsruido);
		Leitura.setRmstotal(rmstotal);
		Leitura.setRotacao(rotacao);
		
		super.insert(Leitura);
	}
	
	public void insert(Leitura Leitura){
		super.insert(Leitura);
	}
	
	public void delete(String codigo){
		super.delete(Leitura.class, codigo);
	}
	
	public void update(Pontosmontagen pontosmontagen, String uid, Timestamp datahora, float deslocamento, float rmspicos, float rmsruido, float rmstotal, float rotacao){
		
		Leitura Leitura = find(uid);
		
		Leitura.setPontosmontagen(pontosmontagen);
		Leitura.setIdleitura(uid);
		Leitura.setDatahora(datahora);
		Leitura.setDeslocamento(deslocamento);
		Leitura.setRmspicos(rmspicos);
		Leitura.setRmsruido(rmsruido);
		Leitura.setRmstotal(rmstotal);
		Leitura.setRotacao(rotacao);
		
		super.update(Leitura);
	}
	
	public void update(Leitura Leitura){
		super.update(Leitura);
	}
	
	public List<Leitura> getLista(){
		return super.findAll(Leitura.class);
	}
	
	public Leitura find(String uid){
		return super.find(Leitura.class, uid);
	}
	
	public List<Leitura> findAll(){
		return super.findAll(Leitura.class);
	}
}
