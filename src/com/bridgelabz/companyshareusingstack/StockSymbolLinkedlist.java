package com.bridgelabz.companyshareusingstack;


class Node<T>
{
	Object data;
	Node next;
}
public class StockSymbolLinkedlist<T> 
{
	Node head=null;
	public boolean Isempty()
	{
		if(head==null)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public void Insert(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	public void Delete()
	{
		Node node=head;
		head=head.next;
		
	}
	public void display()
	{
		Node node=head;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
	
}