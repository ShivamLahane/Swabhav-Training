package com.techlab.model;

public enum Result 
{
	Draw,Won,ONGOING;
	
	public String toString()
	{
		if (this.equals(Draw))
			return "Game has been drawed, since there are no moves remaining";
		if (this.equals(Won))
			return "you have won the game.";
		if (this.equals(ONGOING))
			return "Continue playing...";
		return null;
	} 
}
