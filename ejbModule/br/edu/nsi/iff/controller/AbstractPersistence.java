package br.edu.nsi.iff.controller;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AbstractPersistence {

	EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("testeEJB");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction transaction = entityManager.getTransaction();

	public void insert(Object object) {
		transaction.begin();

		entityManager.persist(object);
		transaction.commit();
	}

	public void update(Object object) {
		transaction.begin();

		entityManager.merge(object);
		transaction.commit();
	}

	public void delete(Class<?> classe, String codigo) {
		Object object = find(classe, codigo);
		transaction.begin();

		entityManager.remove(object);
		transaction.commit();
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> classe) {
		return entityManager.createQuery(
				"select e from " + classe.getName() + " e").getResultList();
	}

	public <T> T find(Class<T> classe, String codigo) {
		return entityManager.find(classe, codigo);
	}
}
