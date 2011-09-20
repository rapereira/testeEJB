package br.edu.nsi.iff.teste;

import java.sql.Timestamp;
import java.util.Random;

import br.edu.nsi.iff.Leitura;
import br.edu.nsi.iff.controller.LeituraJPAController;

public class TestePopular {

	public static void main(String[] args){

		TestePopular.leiturainstance();
	}

	public static void firstinstance(){
		TestePlanta.insert();
		TesteArea.insert();
		TesteEquipamento.insert();
		TesteComponente.insert();
		TesteSensor.insert();
		TestePonto.insert();
		TesteMontagem.insert();
		TestePontosmontagen.insert();
		TesteLeitura.insert();
		TestePico.insert();
	}

	public static void leiturainstance(){

		long fourminutes = 4 * 60 * 1000;
		Timestamp datahora = new Timestamp(System.currentTimeMillis());

		for(int numberleitura = 1; numberleitura <= 5; numberleitura++){
			datahora.setTime(datahora.getTime() + fourminutes);

			String codigo = TesteLeitura.popularinsert(datahora);
			System.out.println("insert LEITURA" + numberleitura);

			
			LeituraJPAController instanceLeitura = new LeituraJPAController();
			
			Leitura leitura = instanceLeitura.find(codigo);
			
			Random generator = new Random();
			int random = generator.nextInt(10) + 5;
			for (int numberpico = 1 ; numberpico <= random; numberpico++){
				TestePico.popularinsert(leitura);
				System.out.println("insert PICO" + numberpico);
			}

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
