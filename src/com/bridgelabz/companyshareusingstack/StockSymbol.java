package com.bridgelabz.companyshareusingstack;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class StockSymbol
{
	public static void main(String[] args) throws JsonProcessingException,IOException {
		
		StockSymbolDetails symbol[];
		StockSymbolLinkedlist<Integer> list=new StockSymbolLinkedlist<Integer>();
		ObjectMapper mapper=new ObjectMapper();
		String pathname="/home/user/eclipse-workspace/OOP/stockSymbol.json";
		File file=new File(pathname);
		JsonNode node=null;
		JsonNode node1=null;
		String string[]= {"first","second","third","fourth"};
		node=mapper.readTree(file);
		for(int i=0;i<string.length;i++)
		{
			node1=node.get(string[i]);
			symbol=mapper.readValue(node1, StockSymbolDetails[].class);
			int number=symbol[0].getShare();
			list.Insert(number);
			
		}
		list.display();		
		
	}

}