package com.techlab.model;

public class Umpire 
{
	private Board board;
	private Tile tiles[][];
	
	public Umpire(Board board)
	{
		this.board = board;
		this.tiles = board.getTiles();
	}
	
	public boolean isWinMove(String mark, int i, int j)
	{
		if (i == 0 && j == 0)
		{
			if (isRowOfThisMark(mark,i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i,j)) return true;
		}
		else if (i == 0 && j == board.size() - 1)
		{
			if (isRowOfThisMark(mark, i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i, j)) return true;
		}
		else if (i == board.size() - 1 && j == 0)
		{
			if (isRowOfThisMark(mark, i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i, j)) return true;
		}
		else if (i == board.size() - 1 && j == board.size() - 1)
		{
			if (isRowOfThisMark(mark, i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i, j)) return true;
		}
		else
		{
			if (isRowOfThisMark(mark, i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
		}
		return false;
	}
	
	private String stringToMatch(String mark)
	{
		String match = "";
		for (int i = 0; i < board.size(); i++)
		{
			match += mark;
		}	
		return match;
	}
	
	private boolean isDiagnoalOfThisMark(String mark, int i, int j)
	{
		String toMatch = stringToMatch(mark);
		String presentString = "";
		if (i == 0 && j == 0)
		{
			for (int index = 0; index < board.size(); index++)
			{
				presentString += tiles[index][index].getMark();
			}
			if (toMatch.equals(presentString)) return true;
		}
		else if (i == 0 && j == board.size() - 1)
		{
			while (i < board.size() && j >= 0)
			{
				presentString += tiles[i][j].getMark();
				i++;
				j--;
			}
			if (toMatch.equals(presentString)) return true;
		}
		else if (i == board.size() - 1 && j == board.size() - 1)
		{
			for (int index = j; index >= 0; index--)
			{
				presentString += tiles[index][index].getMark();
			}
			if (toMatch.equals(presentString)) return true;
		}
		else if (i == board.size() - 1 && j == 0)
		{
			while (i >= 0 && j < board.size())
			{
				presentString += tiles[i][j].getMark();
				i--;
				j++;
			}
			if (toMatch.equals(presentString)) return true;
		}
		return false;
	}

	private boolean isColumnOfThisMark(String mark, int j) 
	{
		String toMatch = stringToMatch(mark);
		String presentString = "";
		for (int i = 0; i < board.size(); i++)
		{
			presentString += tiles[i][j].getMark();
		}
		if (toMatch.equals(presentString)) return true;
		else return false;
	}

	private boolean isRowOfThisMark(String mark, int i)
	{
		String toMatch = stringToMatch(mark);
		String presentString = "";
		for (int j = 0; j < board.size(); j++)
		{
			presentString += tiles[i][j].getMark();
		}
		if (toMatch.equals(presentString)) return true;
		else return false;
	}
}
