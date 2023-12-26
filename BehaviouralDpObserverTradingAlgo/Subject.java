package com.design.designpattern.BehaviouralDpObserverTradingAlgo;

public interface Subject {
	
	public void addObserver(Observer o  );
	public void notifyAllObservers() ;

}
