package com.bridgelabz.commercialdataprocessing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.inventorymgt4.Stock;

public class CDP {

	
	public static void main(String[] args) throws IOException {
		
		CompanyShare companyshare[];
		String pathname="/home/user/eclipse-workspace/OOP/cdp.json";
		String pathname1="/home/user/eclipse-workspace/OOP/replacefile.json";
		File file=new File(pathname);
		ObjectMapper mapper=new ObjectMapper();
		JsonNode node=mapper.readTree(file);
		JsonNode node1=node.get("second");
		companyshare=mapper.readValue(node1, CompanyShare[].class);
		StockAccount stock=new StockAccount(companyshare);
		stock.buy(100, "Idea");
		stock.printReport(companyshare);
		File file1=new File(pathname1);
		JsonNode node2=mapper.readTree(file);
		JsonNode node3=node2.get("first");
	
		int number=companyshare[0].getShare();
		double price=companyshare[0].getPrice();
		System.out.println(number);
		mapper.writeValue(file1, companyshare);
		
	}

}