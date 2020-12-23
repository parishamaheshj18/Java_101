package com.javaworld.Circus;

import udemyPackage.Arrays;

public class People implements Body{
	String name;
	public People(String name) {this.name=name;}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(name+" has 2 legs");
	}
}
