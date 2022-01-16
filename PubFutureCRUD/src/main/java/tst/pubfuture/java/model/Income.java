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
@Table(name="income")
public final class Income implements Serializable {
	
	private static final long serialVersionUID = 1726354L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="income_id")
	private int id;
	
	@Column(name="value")
	private float value;
	
	@Column(name="date_receiving")
	private Date dateReceiving;
	
	@Column(name="date_demanding")
	private Date dateDemanding;
	
	@Column(name="tp_income")
	private EIncome tpIncome;
	
	@Column(name="account_fk")
	private Account account;
	
	@Column(name="description")
	private String description;
	
	public Income(){
		super();
	}
	
	public Income(float value, Date dateReceiving, Date dateDemanding, EIncome tpIncome, Account account,
			String description) {
		super();
		this.value = value;
		this.dateReceiving = dateReceiving;
		this.dateDemanding = dateDemanding;
		this.tpIncome = tpIncome;
		this.account = account;
		this.description = description;
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

	public Date getDateReceiving() {
		return dateReceiving;
	}

	public void setDateReceiving(Date dateReceiving) {
		this.dateReceiving = dateReceiving;
	}

	public Date getDateDemanding() {
		return dateDemanding;
	}

	public void setDateDemanding(Date dateDemanding) {
		this.dateDemanding = dateDemanding;
	}

	public EIncome getTpIncome() {
		return tpIncome;
	}

	public void setTpIncome(EIncome tpIncome) {
		this.tpIncome = tpIncome;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
