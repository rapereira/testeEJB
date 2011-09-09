package br.edu.nsi.iff.controller;

import java.util.List;

import br.edu.nsi.iff.Sensor;

public class SensorJPAController extends AbstractPersistence{

	public void insert(String uid, String descricao, String fabricante, String identificacao, String modelo, String range, String sensibilidade, String tipo){

		Sensor Sensor = new Sensor();

		Sensor.setIdsensor(uid);
		Sensor.setDescricao(descricao);
		Sensor.setFabricante(fabricante);
		Sensor.setIdentificacao(identificacao);
		Sensor.setModelo(modelo);
		Sensor.setRange(range);
		Sensor.setSensibilidade(sensibilidade);
		Sensor.setTipo(tipo);

		super.insert(Sensor);
	}

	public void insert(Sensor Sensor){
		super.insert(Sensor);
	}

	public void delete(String codigo){
		super.delete(Sensor.class, codigo);
	}

	public void update(String uid, String descricao, String fabricante, String identificacao, String modelo, String range, String sensibilidade, String tipo){

		Sensor Sensor = find(uid);

		Sensor.setIdsensor(uid);
		Sensor.setDescricao(descricao);
		Sensor.setFabricante(fabricante);
		Sensor.setIdentificacao(identificacao);
		Sensor.setModelo(modelo);
		Sensor.setRange(range);
		Sensor.setSensibilidade(sensibilidade);
		Sensor.setTipo(tipo);

		super.update(Sensor);
	}
	
	public void update(Sensor Sensor){
		super.update(Sensor);
	}
	
	public List<Sensor> getLista(){
		return super.findAll(Sensor.class);
	}
	
	public Sensor find(String uid){
		return super.find(Sensor.class, uid);
	}
	
	public List<Sensor> findAll(){
		return super.findAll(Sensor.class);
	}
}

