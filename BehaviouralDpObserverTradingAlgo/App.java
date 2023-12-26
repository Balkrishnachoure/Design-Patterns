package com.design.designpattern.BehaviouralDpObserverTradingAlgo;

import java.sql.Time;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static void main(String [] args)
	{
		 StockExchange stockExchange = new StockExchange() ;
		 stockExchange.addObserver( new BuyStockListner() );
		 stockExchange.addObserver(new  SellStockListner());
		 stockExchange.start();
	}

}
