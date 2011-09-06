package br.edu.nsi.iff.teste;

import java.util.UUID;

import br.edu.nsi.iff.controller.AreaJPAController;
import br.edu.nsi.iff.controller.PlantaJPAController;

public class TesteArea {

	public static void main(String[] args){
		
		UUID uuid = UUID.randomUUID();
		String uid = uuid.toString();
        String tag = "testeinsert";
        String descricao = "testeinsert";
        PlantaJPAController instancePlanta = new PlantaJPAController();
        
        
        instancePlanta.insert(uid, tag, descricao);
        System.out.println("insert");
        
        
        AreaJPAController instanceArea = new AreaJPAController();
        instanceArea.insert(instancePlanta.find(uid), uid, descricao, tag);
	}
}
