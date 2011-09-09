package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Componente;
import br.edu.nsi.iff.Ponto;
import br.edu.nsi.iff.Sensor;

public class PontoJPAController extends AbstractPersistence{

	public void insert(Componente componente, Sensor sensor, String uid, String descricao, String posicao, String tag, String tipomedicao, float valoralerta, float valorshutdown){
		
		Ponto Ponto = new Ponto();
		
		Ponto.setComponente(componente);
		Ponto.setSensor(sensor);
		Ponto.setIdponto(uid);
		Ponto.setDescricao(descricao);
		Ponto.setPosicao(posicao);
		Ponto.setTagponto(tag);
		Ponto.setTipomedicao(tipomedicao);
		Ponto.setValoralerta(valoralerta);
		Ponto.setValorshutdown(valorshutdown);
		
		super.insert(Ponto);
	}
	
	public void insert(Ponto Ponto){
		super.insert(Ponto);
	}
	
	public void delete(String codigo){
		super.delete(Ponto.class, codigo);
	}
	
	public void update(Componente componente, Sensor sensor, String uid, String descricao, String posicao, String tag, String tipomedicao, float valoralerta, float valorshutdown){
		
		Ponto Ponto = find(uid);
		
		Ponto.setComponente(componente);
		Ponto.setSensor(sensor);
		Ponto.setIdponto(uid);
		Ponto.setDescricao(descricao);
		Ponto.setPosicao(posicao);
		Ponto.setTagponto(tag);
		Ponto.setTipomedicao(tipomedicao);
		Ponto.setValoralerta(valoralerta);
		Ponto.setValorshutdown(valorshutdown);
		
		super.update(Ponto);
	}
	
	public void update(Ponto Ponto){
		super.update(Ponto);
	}
	
	public List<Ponto> getLista(){
		return super.findAll(Ponto.class);
	}
	
	public Ponto find(String uid){
		return super.find(Ponto.class, uid);
	}
	
	public List<Ponto> findAll(){
		return super.findAll(Ponto.class);
	}
}
