package com.test;

import java.util.Iterator;
import java.util.LinkedList;

import com.models.Queue;

public class QueueTest 
{

	public static void main(String[] args) 
	{		
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(10);
		queue.enqueue(4);
		display(queue);
		queue.dequeue();
		display(queue);
	}

	private static <E> void display(Queue<E> queue) 
	{
		Iterator<E> iter = queue.iterator();
		System.out.print("[");
		while(iter.hasNext())
		{
			System.out.print(iter.next());
			if (iter.hasNext())
			{
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

}
