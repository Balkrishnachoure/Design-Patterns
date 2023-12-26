package com.design.designpattern.BehaviouralDpObserverTradingAlgo;

public class SellStockListner  implements Observer{

	@Override
	public void update(float price) {
		
		if(price > 105)
		{
			System.out.println("Selling the stock beacause S(t) price is too high .... ");
		}
		
	}

}
