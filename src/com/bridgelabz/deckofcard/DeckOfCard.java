package com.bridgelabz.deckofcard;


import java.util.Random;

public class DeckOfCard {
	
	public static void main(String[] args) {
		
		String suit[]= {"Clubs","Diamonds","Hearts","Spades"};
		String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int number=suit.length*rank.length;
		String card[]=new String[number];
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			card[rank.length*i+j]=rank[j]+""+suit[i];
		}
		for(int i=0;i<card.length;i++)
		{
			int random=(int) (Math.random()*card.length);
			for(int j=0;j<card.length;j++)
			{
				card[i]=card[j];
				card[j]=card[random];
				card[random]=card[i];
			}
		}
	
		int k=0;
		String dis[]=new String[36];
		for(int i=0;i<4;i++)
		{
			System.out.print("Player "+(i+1)+":");
			for(int j=0;j<9;j++)
			{
				dis[j]=card[k];
				System.out.print("\n[ "+card[k]+""+" ]\n");
				k++;
			}
			System.out.println(" ");
			
		}
		
	
	}

}