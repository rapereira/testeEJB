package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Area;
import br.edu.nsi.iff.Planta;


public class AreaJPAController extends AbstractPersistence{

	public void insert(Planta planta, String uid, String descricao, String tag) {
		
		Area Area = new Area();
		
		Area.setPlanta(planta);
		Area.setIdarea(uid);
		Area.setDescricao(descricao);
		Area.setTagarea(tag);
		
		super.insert(Area);
	}
	
	public void insert(Area Area){
		super.insert(Area);
	}
	
	public void delete(String codigo){
		super.delete(Area.class, codigo);
	}
	
	public void update(Planta planta, String uid, String tag, String descricao){
		Area Area = find(uid);
		
		Area.setPlanta(planta);
		Area.setIdarea(uid);
		Area.setTagarea(tag);
		Area.setDescricao(descricao);
		super.update(Area);
	}
	
	public void update(Area Area){
		super.update(Area);
	}
	
	public List<Area> getLista(){
		return super.findAll(Area.class);
	}
	
	public Area find(String uid){
		return super.find(Area.class, uid);
	}
	
	public List<Area> findAll(){
		return super.findAll(Area.class);
	}

}
