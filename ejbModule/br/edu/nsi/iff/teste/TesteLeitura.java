package br.edu.nsi.iff.teste;

import java.sql.Timestamp;
import java.util.UUID;

import br.edu.nsi.iff.Leitura;
import br.edu.nsi.iff.controller.LeituraJPAController;
import br.edu.nsi.iff.controller.PontosmontagenJPAController;

public class TesteLeitura {

	public static void main(String[] args){
		
		TesteLeitura.list();
	}
	
	public static void insert(){
		UUID uuid = UUID.randomUUID();
		String uid = uuid.toString();
		
//		String uid = "1";
		Timestamp datahora = new Timestamp(System.currentTimeMillis());
		float deslocamento = 1;
		float rmspicos = 1;
		float rmsruido = 1;
		float rmstotal = 1;
		float rotacao = 1;
		
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		
		instanceLeitura.insert(instancePontosmontagen.find("1"), uid, datahora, deslocamento, rmspicos, rmsruido, rmstotal, rotacao);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		Timestamp datahora = new Timestamp(System.currentTimeMillis());
		float deslocamento = 2;
		float rmspicos = 2;
		float rmsruido = 2;
		float rmstotal = 2;
		float rotacao = 2;
		
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		
		instanceLeitura.update(instancePontosmontagen.find("2"), uid, datahora, deslocamento, rmspicos, rmsruido, rmstotal, rotacao);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		
		instanceLeitura.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		
		for (Leitura leitura : instanceLeitura.findAll()){
			System.out.println("\nID: " + leitura.getIdleitura());
			System.out.println("Datahora: " + leitura.getDatahora());
			System.out.println("Deslocamento: " + leitura.getDeslocamento() + "\n");
		}
	}
	
	public static String popularinsert(Timestamp datahora){
		UUID uuid = UUID.randomUUID();
		String uid = uuid.toString();
		
//		String uid = "1";
		float deslocamento = 1;
		float rmspicos = 1;
		float rmsruido = 1;
		float rmstotal = 1;
		float rotacao = 1;
		
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		
		instanceLeitura.insert(instancePontosmontagen.find("1"), uid, datahora, deslocamento, rmspicos, rmsruido, rmstotal, rotacao);
		System.out.println("insert leitura");
		
		return uid;
	}
}
