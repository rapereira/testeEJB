package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Montagem;
import br.edu.nsi.iff.Ponto;
import br.edu.nsi.iff.Pontosmontagen;

public class PontosmontagenJPAController extends AbstractPersistence {

	public void insert(Ponto ponto, Montagem montagem, String uid, Integer sequencial){
		
		Pontosmontagen Pontosmontagen = new Pontosmontagen();
		
		Pontosmontagen.setIdpontosmontagens(uid);
		Pontosmontagen.setSequencialmontagemponto(sequencial);
		Pontosmontagen.setPonto(ponto);
		Pontosmontagen.setMontagem(montagem);
		
		super.insert(Pontosmontagen);
	}
	
	public void insert(Pontosmontagen Pontosmontagen){
		super.insert(Pontosmontagen);
	}
	
	public void delete(String codigo){
		super.delete(Pontosmontagen.class, codigo);
	}
	
	public void update(Ponto ponto, Montagem montagem, String uid, Integer sequencial){
		
		Pontosmontagen Pontosmontagen = find(uid);
		
		Pontosmontagen.setIdpontosmontagens(uid);
		Pontosmontagen.setSequencialmontagemponto(sequencial);
		Pontosmontagen.setPonto(ponto);
		Pontosmontagen.setMontagem(montagem);
		
		super.update(Pontosmontagen);
	}
	
	public void update(Pontosmontagen Pontosmontagen){
		super.insert(Pontosmontagen);
	}
	
	public List<Pontosmontagen> getLista(){
		return super.findAll(Pontosmontagen.class);
	}
	
	public Pontosmontagen find(String uid){
		return super.find(Pontosmontagen.class, uid);
	}
	
	public List<Pontosmontagen> findAll(){
		return super.findAll(Pontosmontagen.class);
	}
}
