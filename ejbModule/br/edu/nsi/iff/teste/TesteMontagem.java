package br.edu.nsi.iff.teste;

import java.sql.Timestamp;

import br.edu.nsi.iff.Montagem;
import br.edu.nsi.iff.controller.MontagemJPAController;

public class TesteMontagem {

	public static void main(String[] args){
		
		TesteMontagem.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
	
		String uid = "1";
		Timestamp dhinicio = new Timestamp(System.currentTimeMillis());  
		String observacao = "testeinsert";
		
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		
		instanceMontagem.insert(uid, dhinicio, observacao);
		System.out.println("insert");
	}
	
	public static void update(){
	
		String uid = "2";
		Timestamp dhinicio = new Timestamp(System.currentTimeMillis());
		String observacao = "testeupdate";
		
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		
		instanceMontagem.update(uid, dhinicio, observacao);
		System.out.println("update");
	}
	
	public static void fim(){
		Montagem Montagem = new Montagem();
		
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		Montagem = instanceMontagem.find("2");
		
		Timestamp dhfim = new Timestamp(System.currentTimeMillis());
		String observacao = "fim";
		
		Montagem.setDhfimmontagem(dhfim);
		Montagem.setObservacao(observacao);
		
		instanceMontagem.update(Montagem);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		
		instanceMontagem.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		MontagemJPAController instanceMontagem = new MontagemJPAController();
		
		for (Montagem montagem : instanceMontagem.findAll()){
			
			System.out.println("\nMontagem: " + montagem.getIdmontagem());
			System.out.println("Inicio: " + montagem.getDhiniciomontagem());
			System.out.println("Fim: " + montagem.getDhfimmontagem());
			System.out.println("Observacao: " + montagem.getObservacao() + "\n");
		}
	}
}
