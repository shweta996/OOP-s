package com.bridgelabz.companyshareusinglinkedList;

public class CompanyShareDetails {

	
	private String name;
	private int share;
	private double price;
	private String date;
	
	public CompanyShareDetails()
	{
		
	}

	public CompanyShareDetails(String name, int share, double price,String date) {
		super();
		this.name = name;
		this.share = share;
		this.price = price;
		this.date=date;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShare() {
		return share;
	}

	public void setShare(int share) {
		this.share = share;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CompanySharePOJO [name=" + name + ", share=" + share + ", price=" + price + ", date=" + date + "]";
	}
	

}