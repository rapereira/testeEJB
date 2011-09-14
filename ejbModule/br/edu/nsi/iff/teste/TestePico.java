package br.edu.nsi.iff.teste;

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
		float amplitude = 1;
		float fase = 1;
		float frequencia = 1;
		
		PicoJPAController instancePico = new PicoJPAController();
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		
		instancePico.insert(instanceLeitura.find("1"), uid, amplitude, fase, frequencia);
		System.out.println("insert");
	}
	
	public static void update(){
		String uid = "2";
		float amplitude = 2;
		float fase = 2;
		float frequencia = 2;
		
		PicoJPAController instancePico = new PicoJPAController();
		LeituraJPAController instanceLeitura = new LeituraJPAController();
		
		instancePico.update(instanceLeitura.find("2"), uid, amplitude, fase, frequencia);
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
			System.out.println("Amplitude: " + pico.getAmplitude());
			System.out.println("Frequencia: " + pico.getFrequencia() + "\n");
		}
	}
}
