package br.edu.nsi.iff.teste;

import br.edu.nsi.iff.Componente;
import br.edu.nsi.iff.controller.ComponenteJPAController;
import br.edu.nsi.iff.controller.EquipamentoJPAController;

public class TesteComponente {

	public static void main(String[] args){
		
		TesteComponente.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
		String uid = "1";
		String tag = "testeinsert";
        String descricao = "testeinsert";
        
        EquipamentoJPAController instanceEquipamento = new EquipamentoJPAController();
        ComponenteJPAController instanceComponente = new ComponenteJPAController();
        
        instanceComponente.insert(instanceEquipamento.find("1"), uid, descricao, tag);
        System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		String tag = "testeupdate";
		String descricao = "testeupdate";
		
		EquipamentoJPAController instanceEquipamento = new EquipamentoJPAController();
		ComponenteJPAController instanceComponente = new ComponenteJPAController();
		
		instanceComponente.update(instanceEquipamento.find("2"), uid, descricao, tag);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		ComponenteJPAController instanceComponente = new ComponenteJPAController();
		
		instanceComponente.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		ComponenteJPAController instanceComponente = new ComponenteJPAController();
		
		for (Componente componente : instanceComponente.findAll()){
			
			System.out.println("\nComponente: " + componente.getIdcomponente());
			System.out.println("TAG: " + componente.getTagcomponente() + "\n");
		}
	}
}
