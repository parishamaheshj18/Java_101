package com.javaworld.Circus;

public class Animals implements Body{
	String name;
	public Animals(String name) {this.name=name;}
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println(name + " has 4 legs");
	}
 
	public static void main(String[] args) {
		Animals donkey = new Animals("Tommy");
		donkey.showInfo();
		
		People woman = new People("Pari");
		woman.showInfo();
		
	}
}
