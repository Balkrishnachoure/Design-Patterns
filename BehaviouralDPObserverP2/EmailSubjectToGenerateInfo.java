package com.design.designpattern.BehaviouralDPObserverP2;

import java.util.ArrayList;
import java.util.List;

public class EmailSubjectToGenerateInfo implements Subject {

	List<Observer> observer;
	String notification;

	public EmailSubjectToGenerateInfo() {
		this.observer = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {

		this.observer.add(o);

	}

	@Override
	public void removerObserver(Observer o) {

		this.observer.remove(o);
	}

	@Override
	public void notifyAllObservers() {

		for (Observer o : observer) {
			o.update(notification);
		}

	}

	public void setnotification(String notification) {
		this.notification = notification;
		notifyAllObservers();
	}

}
