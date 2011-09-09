package br.edu.nsi.iff.controller;

import java.sql.Timestamp;
import java.util.List;

import br.edu.nsi.iff.Montagem;

public class MontagemJPAController extends AbstractPersistence {

	public void insert(String uid, Timestamp dhinicio, String observacao){
		
		Montagem Montagem = new Montagem();
		
		Montagem.setIdmontagem(uid);
		Montagem.setDhiniciomontagem(dhinicio);
		Montagem.setObservacao(observacao);
		
		super.insert(Montagem);
	}
	
	public void insert(Montagem Montagem){
		super.insert(Montagem);
	}
	
	public void delete(String codigo){
		super.delete(Montagem.class, codigo);
	}
	
	public void update(String uid, Timestamp dhinicio, String observacao){
		
		Montagem Montagem = find(uid);
		
		Montagem.setIdmontagem(uid);
		Montagem.setDhiniciomontagem(dhinicio);
		Montagem.setObservacao(observacao);
		
		super.update(Montagem);
	}
	
	public void update(Montagem Montagem){
		super.update(Montagem);
	}
	
	public List<Montagem> getLista(){
		return super.findAll(Montagem.class);
	}
	
	public Montagem find(String uid){
		return super.find(Montagem.class, uid);
	}
	
	public List<Montagem> findAll(){
		return super.findAll(Montagem.class);
	}
}
