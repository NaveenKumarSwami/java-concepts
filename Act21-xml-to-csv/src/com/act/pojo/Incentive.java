package com.act.pojo;

public class Incentive {

	private double amount;
	private String categroy;
	
	public Incentive(double amount, String category) {
		this.amount = amount;
		this.categroy = category;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCategroy() {
		return categroy;
	}
	public void setCategroy(String categroy) {
		this.categroy = categroy;
	}
	
}
