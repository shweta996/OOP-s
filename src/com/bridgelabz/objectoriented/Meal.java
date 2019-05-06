package com.bridgelabz.objectoriented;

public class Meal {

	private String name;
	private double price;
	private double weight;
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	@Override
	public String toString() 
	{
		return "Meal [name=" + name + ", price=" + price + ", weight=" + weight + "]";
	}

}
