package com.techlab.model;

public class IndentationProducer 
{
	public static String insertIndent(int level)
	{
		String spaces = "";
		for (int i = 0; i < 4 * level; i++)
		{
			spaces += " ";
		}
		return spaces;
	}
}
