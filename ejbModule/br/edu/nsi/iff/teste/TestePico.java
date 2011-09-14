package br.edu.nsi.iff.teste;

import java.sql.Timestamp;

import br.edu.nsi.iff.Pico;
import br.edu.nsi.iff.controller.LeituraJPAController;
import br.edu.nsi.iff.controller.PicoJPAController;

public class TestePico {

	public static void main(String[] args){
		
		TestePico.insert();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
		
		String uid = "1";
		Timestamp datahora = new Timestamp(System.currentTimeMillis());
		float picos = 1;
		
		PicoJPAController instancePico = new PicoJPAController();
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		
		instancePico.insert(instanceLeitura.find("2"), uid, datahora, picos);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		Timestamp datahora = new Timestamp(System.currentTimeMillis());
		float picos = 2;
		
		PicoJPAController instancePico = new PicoJPAController();
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		
		instancePico.update(instanceLeitura.find("2"), uid, datahora, picos);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";

		PicoJPAController instancePico = new PicoJPAController();
		
		instancePico.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		PicoJPAController instancePico = new PicoJPAController();
		
		for(Pico pico : instancePico.findAll()){
			System.out.println("\nID: " + pico.getIdpico());
			System.out.println("Datahora: " + pico.getDatahora());
			System.out.println("Valor do pico: " + pico.getValorpico() + "\n");
		}
	}
}
