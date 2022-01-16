package tst.pubfuture.java.dao;

import tst.pubfuture.java.model.Account;
import tst.pubfuture.java.util.DAO;

public final class AccountDAO extends DAO<Account> {

       private static AccountDAO instance;
       
       public static AccountDAO getInstance(){
         if (instance == null){
            instance = new AccountDAO();
         }

         return instance;
       }

       private AccountDAO() {
         
       }

       public void transferency(Account dest, Account rem, float value) {
    	   float saldoRem = rem.getTotal();
    	   float saldoDes = dest.getTotal();
  
    	   dest.setTotal(saldoDes + saldoRem);
    	   rem.setTotal(saldoRem - value);
    	 
    	   this.merge(dest);
    	   this.merge(rem);
       }

}
