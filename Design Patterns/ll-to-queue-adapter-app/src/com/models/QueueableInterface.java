package com.models;

public interface QueueableInterface<E>
{
	public void enqueue(E data);
	public E dequeue();
}
