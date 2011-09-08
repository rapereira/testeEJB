package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Componente;
import br.edu.nsi.iff.Equipamento;

public class ComponenteJPAController extends AbstractPersistence{

	public void insert(Equipamento equipamento, String uid, String descricao, String tag){
		
		Componente Componente = new Componente();
		
		Componente.setEquipamento(equipamento);
		Componente.setIdcomponente(uid);
		Componente.setDescricao(descricao);
		Componente.setTagcomponente(tag);
		
		super.insert(Componente);
	}
	
	public void insert(Componente Componente){
		super.insert(Componente);
	}
	
	public void delete(String codigo){
		super.delete(Componente.class, codigo);
	}
	
	public void update(Equipamento equipamento, String uid, String descricao, String tag){

		Componente Componente = find(uid);

		Componente.setEquipamento(equipamento);
		Componente.setIdcomponente(uid);
		Componente.setTagcomponente(tag);
		Componente.setDescricao(descricao);
		super.update(Componente);
	}
	
	public void update(Componente Componente){
		super.update(Componente);
	}
	
	public List<Componente> getLista(){
		return super.findAll(Componente.class);
	}
	
	public Componente find(String uid){
		return super.find(Componente.class, uid);
	}
	
	public List<Componente> findAll(){
		return super.findAll(Componente.class);
	}
}

