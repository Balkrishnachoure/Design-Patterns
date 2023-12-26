package com.design.designpattern.BehaviouralDpObserverTradingAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {

	public float price = 100;
	private Random random;
	private List<Observer> observer;

	public StockExchange() {
		random = new Random();
		observer = new ArrayList<>();
	}

	public void addObserver(Observer o) {

		observer.add(o);

	}

	@Override
	public void notifyAllObservers() {

		for (Observer o : observer) {
			o.update(price);
		}

	}

	public void start() {
		while (true) {
			try {
				Thread.sleep(500);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		 price = price + 2*random.nextFloat()-1	;
		 notifyAllObservers();
		 System.out.println(price);

		}

	}

}
