package br.edu.nsi.iff.teste;

import br.edu.nsi.iff.Ponto;
import br.edu.nsi.iff.controller.ComponenteJPAController;
import br.edu.nsi.iff.controller.PontoJPAController;
import br.edu.nsi.iff.controller.SensorJPAController;

public class TestePonto {

	public static void main(String[] args){
		
		TestePonto.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
	
		String uid = "3";
		String descricao = "testeinsert";
		String posicao = "testeinsert";
		String tag = "testeinsert";
		String tipomedicao = "testeinsert";
		float valoralerta = 1;
		float valorshutdown = 1;
		
		PontoJPAController instancePonto = new PontoJPAController();
		ComponenteJPAController instanceComponente = new ComponenteJPAController();
		SensorJPAController instanceSensor = new SensorJPAController();
		
		instancePonto.insert(instanceComponente.find("2"), instanceSensor.find("2"), uid, descricao, posicao, tag, tipomedicao, valoralerta, valorshutdown);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		String descricao = "testeupdate";
		String posicao = "testeupdate";
		String tag = "testeupdate";
		String tipomedicao = "testeupdate";
		float valoralerta = 1;
		float valorshutdown = 1;
		
		PontoJPAController instancePonto = new PontoJPAController();
		ComponenteJPAController instanceComponente = new ComponenteJPAController();
		SensorJPAController instanceSensor = new SensorJPAController();
		
		instancePonto.update(instanceComponente.find("2"), instanceSensor.find("2"), uid, descricao, posicao, tag, tipomedicao, valoralerta, valorshutdown);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		PontoJPAController instancePonto = new PontoJPAController();
		
		instancePonto.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		PontoJPAController instancePonto = new PontoJPAController();
		
		for (Ponto ponto : instancePonto.findAll()){
			
			System.out.println("\nPonto: " + ponto.getIdponto());
			System.out.println("TAG: " + ponto.getTagponto());
			System.out.println("Valor de alerta: " + ponto.getValoralerta() + "\n");
		}
	}
}
