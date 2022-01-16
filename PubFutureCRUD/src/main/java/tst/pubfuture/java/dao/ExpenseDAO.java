package tst.pubfuture.java.dao;

import java.util.Date;
import java.util.List;

import tst.pubfuture.java.model.EExpense;
import tst.pubfuture.java.model.Expense;
import tst.pubfuture.java.util.DAO;

public class ExpenseDAO extends DAO<Expense> {

       private static ExpenseDAO instance;
       
       public static ExpenseDAO getInstance(){
         if (instance == null){
            instance = new ExpenseDAO();
         }

         return instance;
       }

       private ExpenseDAO() {
         
       }
      
       public List<Expense> findAllExpensesByType(EExpense typeExpense){
    	   return this.em.createQuery("FROM " + Expense.class.getName() + "WHERE tp_expense= " + typeExpense.toString()).getResultList();
       }

       public List<Expense> findAllExpensesByPeriod(Date date){
    	   return this.em.createQuery("FROM " + Expense.class.getName() + "WHERE date_receiving= " + date).getResultList();
       }

}
