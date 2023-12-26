package com.design.designpattern.BehaviouralDPVisitorP;

public class Table implements ShoppingItem {

	private String name;
	private double price;

	
	public  Table(String type, double price) {
		this.name = type;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public double accept(ShoppingCartVisitor visitor )
	{
		
		return visitor.visit(this) ;
	}

	
	

}
