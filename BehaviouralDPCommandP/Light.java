package com.design.designpattern.BehaviouralDPCommandP;

// Reciever  - Command knows everything about the reciever ,
// It does its work itself .
public class Light {

	public void turnOn() {
		System.out.println("Lights are On .....  ");

	}

	public void turnOff() {
		System.out.println("Lights are Off ..... ");
	}

}
