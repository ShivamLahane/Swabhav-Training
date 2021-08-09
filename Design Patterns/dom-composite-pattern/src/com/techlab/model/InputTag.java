package com.techlab.model;

import java.io.FileWriter;

public class InputTag implements IDom
{
	private InputType type;
	
	public InputTag(InputType type)
	{
		this.type = type;
	}
	
	@Override
	public void render(int level, FileWriter fw) throws Exception 
	{
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("<input type = " + '"' + type.getType() + '"' + " >\n" );
	}
}
