package com.act.pojo;

public class Transaction {

	private Long transId;
	private TransProductType transProductType;
	private TransType tansType;
	private Double transAmount;
	private Transaction transParent;
	private boolean priority;
	private Employee employee;

	public Long getTransId() {
		return transId;
	}

	public void setTransId(Long transId) {
		this.transId = transId;
	}

	public TransProductType getTransProductType() {
		return transProductType;
	}

	public void setTransProductType(TransProductType transProductType) {
		this.transProductType = transProductType;
	}

	public TransType getTansType() {
		return tansType;
	}

	public void setTansType(TransType tansType) {
		this.tansType = tansType;
	}

	public Double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(Double transAmount) {
		this.transAmount = transAmount;
	}

	public Transaction getTransParent() {
		return transParent;
	}

	public void setTransParent(Transaction transParent) {
		this.transParent = transParent;
	}

	public boolean isPriority() {
		return priority;
	}

	public void setPriority(boolean priority) {
		this.priority = priority;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


}
