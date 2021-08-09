package com.models;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Queue<E> implements QueueableInterface<E>, Iterable<E>
{
	private List<Object> queue = new LinkedList<Object>();

	
	@Override
	public void enqueue(E data) 
	{
		queue.add(data);
	}

	@Override
	public E dequeue() 
	{
		E element = (E) queue.remove(0);
		return element;
	}

	@Override
	public Iterator<E> iterator()
	{
		return (Iterator<E>) queue.iterator();
	}

}
