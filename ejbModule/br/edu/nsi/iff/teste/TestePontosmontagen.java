package br.edu.nsi.iff.teste;

import br.edu.nsi.iff.Pontosmontagen;
import br.edu.nsi.iff.controller.MontagemJPAController;
import br.edu.nsi.iff.controller.PontoJPAController;
import br.edu.nsi.iff.controller.PontosmontagenJPAController;

public class TestePontosmontagen {

	public static void main(String[] args){
		
		TestePontosmontagen.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
	
		String uid = "3";
		Integer sequencial = 1;
		
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		PontoJPAController instancePonto = new PontoJPAController();
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		
		instancePontosmontagen.insert(instancePonto.find("2"), instanceMontagem.find("2"), uid, sequencial);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		Integer sequencial = 2;
		
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		PontoJPAController instancePonto = new PontoJPAController();
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		
		instancePontosmontagen.update(instancePonto.find("2"), instanceMontagem.find("2"), uid, sequencial);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		
		instancePontosmontagen.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		PontosmontagenJPAController instancePontosmontagen = new PontosmontagenJPAController();
		
		for(Pontosmontagen pontosmontagen : instancePontosmontagen.findAll()){
			System.out.println("\nID: " + pontosmontagen.getIdpontosmontagens());
			System.out.println("Sequencial: " + pontosmontagen.getSequencialmontagemponto() + "\n");
		}
	}
}
