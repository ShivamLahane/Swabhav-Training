package com.techlab.model;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class HtmlTag extends ParentTag implements IDom 
{
	private List<IDom> childrens = new ArrayList<IDom>(); 
	

	@Override
	public void addChildrenTag(IDom tag)
	{
		childrens.add(tag);
	}

	@Override
	public void render(int level, FileWriter fw) throws Exception
	{
		fw.write("<!DOCTYPE html>\n");
		fw.write("<html>\n");
		for (IDom tag : childrens)
		{
			tag.render(level + 1, fw);
		}
		fw.write("</html>\n");
		fw.close();
	}
	
	
	public void render(FileWriter fw) throws Exception
	{
		render(0, fw);
	}
}
