package tst.pubfuture.java.dao;

import java.util.Date;
import java.util.List;

import tst.pubfuture.java.model.EIncome;
import tst.pubfuture.java.model.Income;
import tst.pubfuture.java.util.DAO;

public final class IncomeDAO extends DAO<Income> {

       private static IncomeDAO instance;
       
       public static IncomeDAO getInstance(){
         if (instance == null){
            instance = new IncomeDAO();
         }

         return instance;
       }

       private IncomeDAO() {
    	   
       }

       public List<Income> findAllExpensesByType(EIncome typeIncome){
    	   return this.em.createQuery("FROM " + Income.class.getName() + "WHERE tp_income= " + typeIncome.toString()).getResultList();
       }
       
       public List<Income> findAllExpensesByPeriod(Date date){
    	   return this.em.createQuery("FROM " + Income.class.getName() + "WHERE date_receiving= " + date).getResultList();
       }
       
}
