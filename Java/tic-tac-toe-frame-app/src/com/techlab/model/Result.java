package com.techlab.model;

public enum Result 
{
	Draw,Won,ONGOING;
	
	public String toString()
	{
		if (this.equals(Draw))
			return "Draw";
		if (this.equals(Won))
			return "Won";
		if (this.equals(ONGOING))
			return "In-process";
		return null;
	} 
}
