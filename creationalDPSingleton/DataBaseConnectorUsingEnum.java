package com.design.designpattern.creationalDPSingleton;

public enum DataBaseConnectorUsingEnum {

	INSTANCE;

	public void connect() {
		System.out.println("Connecting to DataBase >>>>>");
	}

}
