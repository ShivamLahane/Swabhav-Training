package com.techlab.model;

import java.io.FileWriter;

public class BrTag implements IDom
{

	@Override
	public void render(int level, FileWriter fw) throws Exception 
	{
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("<br>\n");
	}
	
}
