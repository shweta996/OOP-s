package com.bridgelabz.companyshareusinglinkedList;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

	public class CompanyShareTest {
	
	public static void main(String[] args) {
		CompanyShareDetails share[];
		CompanyshareLinkeList<Integer> list=new CompanyshareLinkeList<Integer>();
		ObjectMapper mapper=new ObjectMapper();
		String pathname="/home/user/eclipse-workspace/OOP/companyshare.json";
		File file=new File(pathname);
		String string1[]= {"first","second","third","fourth"};
		
		
		try 
		{
			for(int i=0;i<string1.length;i++)
			{
			JsonNode node=mapper.readTree(file);
			JsonNode node1=node.get(string1[i]);
			share=mapper.readValue(node1,CompanyShareDetails[].class);
			int numberofshare=share[0].getShare();
			list.Insert(numberofshare);
			
			}
			
			list.display();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}