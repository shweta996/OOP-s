package com.bridgelabz.inventorymgt4;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryMgt4 {
	
	public static void main(String[] args) {
		Stock stock1[];
		double price=0;
		int numberOfshare=0;
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/user/eclipse-workspace/OOP/inventorymgt4.json");
		try 
		{
			JsonNode node=mapper.readTree(file);
			JsonNode node1=null;
			
			System.out.println("*******************Idea************");
			node1=node.get("first");
			stock1=mapper.readValue(node1, Stock[].class);
			for(Stock stock2:stock1)
			{
			System.out.println(stock2);
			price=price+stock2.getPrice();
			numberOfshare+=stock2.getNumber();
			}
			System.out.println("");
			System.out.println("****************vodafone*********************");
			
			node1=node.get("second");
			stock1=mapper.readValue(node1, Stock[].class);
			for(Stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("****************JIO*********************");
			node1=node.get("third");
			stock1=mapper.readValue(node1, Stock[].class);
			for(Stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("****************Airtel*********************");
			node1=node.get("fourth");
			stock1=mapper.readValue(node1, Stock[].class);
			for(Stock stock2:stock1)
			{
				System.out.println(stock2);
				price=price+stock2.getPrice();
				numberOfshare+=stock2.getNumber();
			}
			System.out.println("Total Price :"+price);
			System.out.println("Total number of share :"+numberOfshare);
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
