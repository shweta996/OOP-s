package com.bridgelabz.objectoriented;

public class Stock {

	private String stockName;
	private int number_of_share;
	private double price;
	public Stock()
	{
		
	}
	public Stock(String stockName, int number_of_share, double price) {
		
		this.stockName = stockName;
		this.number_of_share = number_of_share;
		this.price = price;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumber() {
		return number_of_share;
	}
	public void setNumber(int number_of_share) {
		this.number_of_share = number_of_share;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", number of share=" + number_of_share+ ", price=" + price + "]";
	}	

}