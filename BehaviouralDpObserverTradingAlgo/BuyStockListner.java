package com.design.designpattern.BehaviouralDpObserverTradingAlgo;

public class BuyStockListner implements Observer {

	@Override
	public void update(float price) {

		if(price <95)
		{
			 System.out.println("Buying the stock because S(t) price is low.... ");
		}	
	}

}
