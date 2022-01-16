package tst.pubfuture.java.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "expense")
public final class Expense implements Serializable {

	private static final long serialVersionUID = 7654321L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="expense_id")
	private int id;
	
	@Column(name="value")
	private float value;
	
	@Column(name="date_receiving")
	private Date dateReceving;
	
	@Column(name="date_demanding")
	private Date dateDemanding;
	
	@Column(name="tp_expense")
	private EExpense tpExpense;
	
	@Column(name="account_fk")
	private Account account;

	public Expense() {
		super();
	}
	
	public Expense(float value, Date dateReceving, Date dateDemanding, EExpense tpExpense, Account account) {
		super();
		this.value = value;
		this.dateReceving = dateReceving;
		this.dateDemanding = dateDemanding;
		this.tpExpense = tpExpense;
		this.account = account;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public Date getDateReceving() {
		return dateReceving;
	}

	public void setDateReceving(Date dateReceving) {
		this.dateReceving = dateReceving;
	}

	public Date getDateDemanding() {
		return dateDemanding;
	}

	public void setDateDemanding(Date dateDemanding) {
		this.dateDemanding = dateDemanding;
	}

	public EExpense getTpExpense() {
		return tpExpense;
	}

	public void setTpExpense(EExpense tpExpense) {
		this.tpExpense = tpExpense;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
}
