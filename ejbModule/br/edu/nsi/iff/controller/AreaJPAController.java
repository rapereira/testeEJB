package br.edu.nsi.iff.controller;

import br.edu.nsi.iff.Area;
import br.edu.nsi.iff.Planta;


public class AreaJPAController extends AbstractPersistence{

	public void insert(Planta planta, String uid, String descricao, String tag) {
		
		Area Area = new Area();
		
		Area.setPlanta(planta);
		Area.setIdarea(uid);
		Area.setDescricao(descricao);
		Area.setTagarea(tag);
		
		super.insert(Area);
	}
	

}
