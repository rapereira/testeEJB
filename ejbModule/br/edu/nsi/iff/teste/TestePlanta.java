package br.edu.nsi.iff.teste;

import java.util.UUID;

import br.edu.nsi.iff.Planta;
import br.edu.nsi.iff.controller.PlantaJPAController;

public class TestePlanta {

	public static void main(String[] args) {
	     
			UUID uuid = UUID.randomUUID();
			String uid = uuid.toString();
	        String tag = "testeinsert";
	        String descricao = "testeinsert";
	        PlantaJPAController instance = new PlantaJPAController();
	        instance.insert(uid, tag, descricao);
	        System.out.println("insert");
	        
	        for (Planta planta : instance.findAll()) {
	        	
	        	System.out.println("Planta: "+planta.getIdplanta());
				
			}
	    }
}
