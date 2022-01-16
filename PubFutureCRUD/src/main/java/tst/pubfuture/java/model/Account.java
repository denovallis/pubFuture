package tst.pubfuture.java.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account")
public final class Account implements Serializable{

	private static final long serialVersionUID = 1234567L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_id")
	private int id;
	
	@Column(name="total")
	private float total;
	
	@Column(name="tp_account")
	private EAccount tpAccount;
	
	@Column(name="fi_institution")
	private String finInstitution;

	public Account() {
		super();
	}
	
	public Account(float total, EAccount tpAccount, String finInstitution) {
		super();
		this.total = total;
		this.tpAccount = tpAccount;
		this.finInstitution = finInstitution;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public EAccount getTpAccount() {
		return tpAccount;
	}

	public void setTpAccount(EAccount tpAccount) {
		this.tpAccount = tpAccount;
	}

	public String getFinInstitution() {
		return finInstitution;
	}

	public void setFinInstitution(String finInstitution) {
		this.finInstitution = finInstitution;
	}

	
}

