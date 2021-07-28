package com.lti.demo;

public class Person {
	private int perId;
	private String perName;
	private double perSal;
	public Person() {
		super();
	}
	public Person(int perId, String perName, double perSal) {
		super();
		this.perId = perId;
		this.perName = perName;
		this.perSal = perSal;
	}
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getPerName() {
		return perName;
	}
	public void setPerName(String perName) {
		this.perName = perName;
	}
	public double getPerSal() {
		return perSal;
	}
	public void setPerSal(double perSal) {
		this.perSal = perSal;
	}
	@Override
	public String toString() {
		return "Person [perId=" + perId + ", perName=" + perName + ", perSal=" + perSal + "]";
	}
	
	
}
