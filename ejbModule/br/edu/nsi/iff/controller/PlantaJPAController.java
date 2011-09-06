package br.edu.nsi.iff.controller;

import java.util.List;



import br.edu.nsi.iff.Planta;

public class PlantaJPAController extends AbstractPersistence {

	public void insert(String uid, String tag, String descricao) {

		Planta Planta = new Planta();

		Planta.setIdplanta(uid);
		Planta.setTagplanta(tag);
		Planta.setDescricao(descricao);
		super.insert(Planta);
	}

	public void insert(Planta Planta) {
		super.insert(Planta);
	}

	public void delete(String codigo) {
		super.delete(Planta.class, codigo);
	}

	public void update(String uid, String tag, String descricao) {
		Planta Planta = find(uid);

		Planta.setIdplanta(uid);
		Planta.setTagplanta(tag);
		Planta.setDescricao(descricao);
		super.update(Planta);
	}

	public void update(Planta Planta) {
		super.update(Planta);
	}

	public List<Planta> getLista() {
		return super.findAll(Planta.class);
	}

	public Planta find(String uid) {
		return super.find(Planta.class, uid);
	}

	public List<Planta> findAll() {
		return super.findAll(Planta.class);
	}
}
