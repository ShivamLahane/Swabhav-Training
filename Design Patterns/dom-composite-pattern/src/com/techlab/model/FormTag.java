package com.techlab.model;

import java.io.FileWriter;

public class FormTag extends ParentTag implements IDom
{

	@Override
	public void render(int level, FileWriter fw) throws Exception 
	{
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("<form>\n");
		for (IDom childrenTag : childrenTags)
		{
			childrenTag.render(level + 1, fw);
		}
		fw.write(IndentationProducer.insertIndent(level));
		fw.write("</form>\n");
	}

}
