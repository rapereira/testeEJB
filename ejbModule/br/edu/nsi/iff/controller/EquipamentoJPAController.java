package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Area;
import br.edu.nsi.iff.Equipamento;

public class EquipamentoJPAController extends AbstractPersistence{

	public void insert(Area area, String uid, String descricao, String fabricante, String tag, String tipo){
		
		Equipamento Equipamento = new Equipamento();
		
		Equipamento.setArea(area);
		Equipamento.setIdequipamento(uid);
		Equipamento.setDescricao(descricao);
		Equipamento.setFabricante(fabricante);
		Equipamento.setTagequipamento(tag);
		Equipamento.setTipo(tipo);
		
		super.insert(Equipamento);
	}
	
	public void insert(Equipamento Equipamento){
		super.insert(Equipamento);
	}
	
	public void delete(String codigo){
		super.delete(Equipamento.class, codigo);
	}
	
	public void update(Area area, String uid, String descricao, String fabricante, String tag, String tipo){
		Equipamento Equipamento = find(uid);
		
		Equipamento.setArea(area);
		Equipamento.setIdequipamento(uid);
		Equipamento.setDescricao(descricao);
		Equipamento.setFabricante(fabricante);
		Equipamento.setTagequipamento(tag);
		Equipamento.setTipo(tipo);
		
		super.update(Equipamento);
	}
	
	public void update(Equipamento Equipamento){
		super.update(Equipamento);
	}
	
	public List<Equipamento> getLista(){
		return super.findAll(Equipamento.class);
	}
	
	public Equipamento find(String uid){
		return super.find(Equipamento.class, uid);
	}
	
	public List<Equipamento> findAll(){
		return super.findAll(Equipamento.class);
	}
}
