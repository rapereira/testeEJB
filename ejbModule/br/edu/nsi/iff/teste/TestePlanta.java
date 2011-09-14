package br.edu.nsi.iff.teste;

import java.util.UUID;

import br.edu.nsi.iff.Planta;
import br.edu.nsi.iff.controller.PlantaJPAController;

@SuppressWarnings("unused")
public class TestePlanta {

	public static void main(String[] args) {

		TestePlanta.update();
	}

	public static void insert(){
			//	UUID uuid = UUID.randomUUID();
			//	String uid = uuid.toString();

		String uid = "1";

		String tag = "testeinsert";
		String descricao = "testeinsert";

		PlantaJPAController instancePlanta = new PlantaJPAController();

		instancePlanta.insert(uid, tag, descricao);
		System.out.println("insert");
	}

	public static void update(){
		String uid = "3";
		String tag = "testeupdate";
		String descricao = "testeupdate";

		PlantaJPAController instancePlanta = new PlantaJPAController();

		instancePlanta.update(uid, tag, descricao);
		System.out.println("update");
	}

	public static void delete(){
		String uid = "3";

		PlantaJPAController instancePlanta = new PlantaJPAController();

		instancePlanta.delete(uid);
		System.out.println("delete");
	}

	public static void list(){
		PlantaJPAController instancePlanta = new PlantaJPAController();

		for (Planta planta : instancePlanta.findAll()){
			System.out.println("\nPlanta: " + planta.getIdplanta());
			System.out.println("TAG: " + planta.getTagplanta() + "\n");
		}
	}
}
