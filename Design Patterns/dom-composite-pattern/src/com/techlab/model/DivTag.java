package com.techlab.model;

import java.io.FileWriter;

public class DivTag extends ParentTag implements IDom
{
	
	@Override
	public void render(int level, FileWriter fw) throws Exception 
	{
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("<div>\n");
		for (IDom children : childrenTags)
		{
			children.render(level + 1, fw);
		}
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("</div>\n");
	}
	
}
