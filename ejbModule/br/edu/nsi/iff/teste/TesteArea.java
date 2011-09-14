package br.edu.nsi.iff.teste;

import java.util.UUID;

import br.edu.nsi.iff.Area;
import br.edu.nsi.iff.controller.AreaJPAController;
import br.edu.nsi.iff.controller.PlantaJPAController;

@SuppressWarnings("unused")
public class TesteArea {

	public static void main(String[] args){

		TesteArea.list();
	}
	
	public static void insert(){
//		UUID uuid = UUID.randomUUID();
//		String uid = uuid.toString();
		String uid = "1";
		String tag = "testeinsert";
        String descricao = "testeinsert";
        
        PlantaJPAController instancePlanta = new PlantaJPAController();
        AreaJPAController instanceArea = new AreaJPAController();
        
        instanceArea.insert(instancePlanta.find("1"), uid, descricao, tag);
        System.out.println("insert");
	}
	
	public static void update(){
		String uid = "3";
		String tag = "testeupdate";
		String descricao = "testeupdate";
		
		PlantaJPAController instancePlanta = new PlantaJPAController();
		AreaJPAController instanceArea = new AreaJPAController();
		
		instanceArea.update(instancePlanta.find("2"), uid, descricao, tag);
		System.out.println("update");
	}
	
	public static void delete(){
		String uid = "3";
		
		AreaJPAController instanceArea = new AreaJPAController();
		
		instanceArea.delete(uid);
		System.out.println("delete");
	}
	
	public static void list(){
		AreaJPAController instanceArea = new AreaJPAController();
		
		for (Area area : instanceArea.findAll()){
			
			System.out.println("\nArea: " + area.getIdarea());
			System.out.println("TAG: " + area.getTagarea() + "\n");
		}
	}
	
}
