package com.design.designpattern.BehaviouralDPVisitorP;

public interface ShoppingItem {

	public double accept(ShoppingCartVisitor visitor  );
}
