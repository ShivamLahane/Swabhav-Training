package com.model;

public class CompressionHandler extends Handler
{

	@Override
	public void check(DTO dto) throws Throwable 
	{
		System.out.println("Compression done");
		checkNext(dto);
	}

}
