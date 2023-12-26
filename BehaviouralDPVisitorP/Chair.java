package com.design.designpattern.BehaviouralDPVisitorP;

public class Chair  implements ShoppingItem{

	 public String type ;
	 public double price ;
	 
	 public Chair( String  type ,  double price )
	 {
		 this.type= type ;
		 this.price= price ;
	 }
	
	 
	 
	
	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	@Override
	public double accept( ShoppingCartVisitor visitor) {
		
		return visitor.visit(this) ;
	}


}
