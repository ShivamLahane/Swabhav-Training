package com.techlab.test;

import com.techlab.model.*;

public class NodeTest 
{
	public static void main(String args[])
	{
		Node node1 = new Node("Shivam Lahane");
		Node node2 = new Node("Swabhav Techlabs");
		Node node3 = new Node("Aurionpro Solutions pvt. ltd");
		
		node1.setNext(node2);
		node2.setNext(node3);
		
		node1.checkNext();
		node2.checkNext();
		node3.checkNext();
	}
}
