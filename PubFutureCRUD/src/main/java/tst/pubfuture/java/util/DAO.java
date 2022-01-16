package tst.pubfuture.java.util;

import java.util.List;

import javax.persistence.EntityManager;

import tst.pubfuture.java.model.Expense;
import tst.pubfuture.java.util.HiberEMFactory;


public abstract class DAO<T>{
	
	protected EntityManager em = HiberEMFactory.getEntityManager();
	
	public T getById(Class<T> entityClass, final int id) {
        return this.em.find(entityClass, id);
      }

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return this.em.createQuery("FROM " +
        Expense.class.getName()).getResultList();
     }

    public void persist(T a) {
        try {
       	 this.em.getTransaction().begin();
       	 this.em.persist(a);
       	 this.em.getTransaction().commit();
       
        } catch (Exception ex) {
           ex.printStackTrace();
           this.em.getTransaction().rollback();
       }
     }

      public void merge(T object) {
        try {
       	 this.em.getTransaction().begin();
       	 this.em.merge(object);
       	 this.em.getTransaction().commit();
        } catch (Exception ex) {
           ex.printStackTrace();
           this.em.getTransaction().rollback();
        }
      }

      public void removeById(Class<T> entityClass, final int id) {
        try {
           this.em.remove(this.getById(entityClass, id));
        } catch (Exception ex) {
           ex.printStackTrace();
        }
      }
      
}

