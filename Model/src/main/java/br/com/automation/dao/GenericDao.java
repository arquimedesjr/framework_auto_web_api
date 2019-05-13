package br.com.automation.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;

public class GenericDao<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger LOG = Logger.getLogger(GenericDao.class);
	private T entity;

	public void save(T entity) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {

			factory = Persistence.createEntityManagerFactory("persistence");
			manager = factory.createEntityManager();

			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			LOG.info("Saved successfully");

		} catch (Exception e) {
			manager.getTransaction().rollback();
			LOG.error(e.getMessage());

		} finally {
			manager.close();
			factory.close();

		}

	}

	public void edit(T entity) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {

			factory = Persistence.createEntityManagerFactory("persistence");
			manager = factory.createEntityManager();

			manager.getTransaction().begin();
			manager.merge(entity);
			manager.getTransaction().commit();
			LOG.info("Successfully edited");

		} catch (Exception e) {
			manager.getTransaction().rollback();
			LOG.error(e.getMessage());
		} finally {
			manager.close();
			factory.close();

		}
	}

	public void remove(Class<T> persistClass, long id) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			T entity = find(id, persistClass);
			factory = Persistence.createEntityManagerFactory("persistence");
			manager = factory.createEntityManager();

			manager.getTransaction().begin();
			manager.remove(entity);
			manager.getTransaction().commit();
			LOG.info("Successfully removed");

		} catch (Exception e) {
			manager.getTransaction().rollback();
			LOG.error(e.getMessage());
		} finally {
			manager.close();
			factory.close();

		}

	}

	public T find(long id, Class<T> persistClass) {
		EntityManagerFactory factory = null;
		EntityManager manager = null;

		try {
			factory = Persistence.createEntityManagerFactory("persistence");
			manager = factory.createEntityManager();
			entity = manager.find(persistClass, id);
			System.out.println(entity);
		} catch (Exception e) {
			manager.getTransaction().rollback();
			LOG.error(e.getMessage());
		}

		return entity;

	}

	@SuppressWarnings("unchecked")
	public List<T> list(String table) {

		EntityManagerFactory factory = null;
		EntityManager manager = null;
		List<T> string = null;

		try {

			factory = Persistence.createEntityManagerFactory("persistence");
			manager = factory.createEntityManager();

			String qlQuery = "select c from " + table + " c";

			Query query = manager.createQuery(qlQuery);

			string = query.getResultList();

		} catch (Exception e) {
			manager.getTransaction().rollback();
			LOG.error(e.getMessage());
		} finally {
			manager.close();
			factory.close();

		}

		return string;

	}

}
