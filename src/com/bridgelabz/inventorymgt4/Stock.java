package com.bridgelabz.inventorymgt4;


public class Stock {

	private String name;
	private int number;
	private double price;
	
	public Stock()
	{
		
	}

	public Stock(String name, int number, double price) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", number=" + number + ", price=" + price + "]";
	}
	
}