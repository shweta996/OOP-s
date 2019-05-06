package com.bridgelabz.inventorymgt4;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.inventorymgt4.*;

public class WriteJsonFile 
{


	public static void main(String[] args) throws JsonProcessingException, IOException {
		Stock stock1[];
		ObjectMapper mapper=new ObjectMapper();
		File file1=new File("/home/user/eclipse-workspace/OOP/inventorymgt4.json");
		File file=new File("/home/user/eclipse-workspace/OOP/writefile.json");
		ArrayList<Stock> stock2=new ArrayList<Stock>();
		JsonNode node=mapper.readTree(file1);
		JsonNode node1=null;
		String string[]= {"first","second","third","fourth"};
		for(int i=0;i<string.length;i++)
		{
			node1=node.get(string[i]);
			stock1=mapper.readValue(node1,Stock[].class);
			for(Stock stock3:stock1)
			{
				stock2.add(stock3);
				System.out.println(stock3);
			}
			mapper.writeValue(file, stock2);	
			
		}
		/*
		 * stock1=mapper.readValue(node1, Stock[].class); for(Stock stock3:stock1) {
		 * stock2.add(stock3); System.out.println(stock3); } mapper.writeValue(file,
		 * stock2);
		 */
		
	}

}