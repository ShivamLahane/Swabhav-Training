package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class ParentTag 
{
	protected List<IDom> childrenTags = new ArrayList<IDom>();
	
	public void addChildrenTag(IDom tag) 
	{
		childrenTags.add(tag);
	}
	
	public List<IDom> gettChildrens()
	{
		return childrenTags;
	}
}
