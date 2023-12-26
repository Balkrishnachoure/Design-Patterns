package com.design.designpattern.BehaviouralDPObserverP2;

public interface Subject {
	
	public void addObserver( Observer o )  ;
	public void removerObserver(Observer o  ) ;
	public void notifyAllObservers() ;
	

}
