package com.bridgelabz.companyshareusingqueue;


class Node<T>
{
	Object data;
	Node next;
}
public class TransactionQueue<T> {
	Node front=null;
	Node rear=null;
	
	public void Insert(T data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(front==null)
		{
			rear=node;
			front=node;
			
		}
		else
		{
			rear.next=node;
			rear=node;
		}
		
	}
	public void Delete()
	{
		if(front==null && rear==null)
		{
			System.out.println("Underflow");
		}
		else
		{
			Node node=front;
			front=front.next;
		}
	}
	public void display()
	{
		Node node=front;
		while(node!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
	}
	public static void main(String[] args) {
		
		
		TransactionQueue<String> list=new TransactionQueue<String>();
		list.Insert("shubhra");
		list.Insert("nack");
		list.Insert("shk");
		list.Insert("manjiri");
		list.Delete();
		list.Delete();
		list.display();
	}
}