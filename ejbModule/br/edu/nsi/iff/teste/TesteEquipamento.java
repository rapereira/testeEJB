package br.edu.nsi.iff.teste;

import br.edu.nsi.iff.Equipamento;
import br.edu.nsi.iff.controller.AreaJPAController;
import br.edu.nsi.iff.controller.EquipamentoJPAController;

public class TesteEquipamento {

	public static void main(String[] args){
		
		TesteEquipamento.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
		
		String uid = "1";
		String descricao = "testeinsert";
		String fabricante = "testeinsert";
		String tag = "testeinsert";
		String tipo = "testeinsert";
		
		AreaJPAController instanceArea = new AreaJPAController();
		EquipamentoJPAController instanceEquipamento = new EquipamentoJPAController();

		instanceEquipamento.insert(instanceArea.find("1"), uid, descricao, fabricante, tag, tipo);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		String descricao = "testeupdate";
		String fabricante = "testeupdate";
		String tag = "testeupdate";
		String tipo = "testeupdate";
		
		AreaJPAController instanceArea = new AreaJPAController();
		EquipamentoJPAController instanceEquipamento = new EquipamentoJPAController();
		
		instanceEquipamento.update(instanceArea.find("2"), uid, descricao, fabricante, tag, tipo);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		EquipamentoJPAController instanceEquipamento = new EquipamentoJPAController();
		
		instanceEquipamento.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		EquipamentoJPAController instanceEquipamento = new EquipamentoJPAController();
		
		for (Equipamento equipamento : instanceEquipamento.findAll()){
			
			System.out.println("\nEquipamento: " + equipamento.getIdequipamento());
			System.out.println("TAG: " + equipamento.getTagequipamento() + "\n");
		}
	}
}
