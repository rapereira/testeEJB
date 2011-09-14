package br.edu.nsi.iff.teste;

import br.edu.nsi.iff.Sensor;
import br.edu.nsi.iff.controller.SensorJPAController;

public class TesteSensor {

	public static void main(String[] args){
		TesteSensor.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
	
		String uid = "1";
		String descricao = "testeinsert";
		String fabricante = "testeinsert";
		String identificacao = "testeinsert";
		String modelo = "testeinsert";
		String range = "testeinsert";
		String sensibilidade = "testeinsert";
		String tipo = "testeinsert";
		
		SensorJPAController instanceSensor = new SensorJPAController();
		
		instanceSensor.insert(uid, descricao, fabricante, identificacao, modelo, range, sensibilidade, tipo);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		String descricao = "testeupdate";
		String fabricante = "testeupdate";
		String identificacao = "testeupdate";
		String modelo = "testeupdate";
		String range = "testeupdate";
		String sensibilidade = "testeupdate";
		String tipo = "testeupdate";
		
		SensorJPAController instanceSensor = new SensorJPAController();
		
		instanceSensor.update(uid, descricao, fabricante, identificacao, modelo, range, sensibilidade, tipo);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		SensorJPAController instanceSensor = new SensorJPAController();
		
		instanceSensor.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		SensorJPAController instanceSensor = new SensorJPAController();
		
		for (Sensor sensor : instanceSensor.findAll()){
			
			System.out.println("\nSensor: " + sensor.getIdsensor());
			System.out.println("Tipo: " + sensor.getTipo());
			System.out.println("Identificação: " + sensor.getIdentificacao() + "\n");
		}
	}
}
