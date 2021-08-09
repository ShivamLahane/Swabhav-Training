package com.techlab.model;

import java.io.FileWriter;

public class ParagraphTag implements IDom
{	
	private String innerHTML;
	
	public ParagraphTag(String innerHTML)
	{
		this.innerHTML = innerHTML;
	}

	@Override
	public void render(int level, FileWriter fw) throws Exception 
	{
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("<p>\n");
		fw.write(IndentationProducer.insertIndent(level + 1));
		fw.write(innerHTML + "\n");
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("</p>\n");
	}
	
}
