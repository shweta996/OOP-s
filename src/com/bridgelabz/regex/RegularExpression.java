package com.bridgelabz.regex;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class RegularExpression {


	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		ObjectMapper mapper=new ObjectMapper();
		File file=new File("/home/user/eclipse-workspace/OOP/regex.json");
		JsonNode node=mapper.readTree(file);
		String values="Message";
		System.out.println(values);
		JsonNode Message=node.path(values);
		
		String str=Message.asText();
		System.out.println();
		System.out.println("Enter name: ");		
		String name=sc.next();
		if(Pattern.matches("^[A-Z]?{1}[a-z]*$", name)) {
			str=str.replaceAll("<<name>>", name);
		}
		else {
			System.out.println("Not matches");
		}
		
		System.out.println("Enter full name: ");		
		String fullName=sc.next();
		if(Pattern.matches("[a-zA-Z.]", fullName)) {
			str=str.replaceAll("<<full name>>", fullName);
		}
		else {
			System.out.println("Not matches");
		}
		System.out.println("Enter your phoneNumber: ");
		String phoneNumber =sc.next();
		if(Pattern.matches("^[6-9]?[0-9]{9}+$",phoneNumber))
		{
			str=str.replaceAll("x{10}",phoneNumber);
		}
		else {
			System.out.println("Not matches");
		}
		
		Date currentDate = new Date();
        SimpleDateFormat getdate = new SimpleDateFormat("dd/MM/yyyy");	
        String date = getdate.format(currentDate);
        str=str.replaceAll("30/04/2019", date);
        System.out.println(""+str);
        mapper.writeValue(file, str);	
	}	
}
