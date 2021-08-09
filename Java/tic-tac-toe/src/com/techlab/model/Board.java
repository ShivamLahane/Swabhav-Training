package com.techlab.model;

public class Board
{
	private int size;
	private String board[][];
	
	public Board(int n)
	{
		size = n;
		board = new String[n][n];
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++) board[i][j] = " ";
		}
	}
	
	public void mark(String mark, int i, int j)
	{
		board[i][j] = mark;
	}
	
	public boolean isWinMove(String mark, int i, int j)
	{
		if (i == 0 && j == 0)
		{
			if (isRowOfThisMark(mark,i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i,j)) return true;
		}
		else if (i == 0 && j == size - 1)
		{
			if (isRowOfThisMark(mark, i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i, j)) return true;
		}
		else if (i == size - 1 && j == 0)
		{
			if (isRowOfThisMark(mark, i)) return true;
			else if (isColumnOfThisMark(mark, j)) return true;
			else if (isDiagnoalOfThisMark(mark, i, j)) return true;
		}
		else if (i == size - 1 && j == size - 1)
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
		for (int i = 0; i < size; i++)
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
			for (int index = 0; index < size; index++)
			{
				presentString += board[index][index];
			}
			if (toMatch.equals(presentString)) return true;
		}
		else if (i == 0 && j == size - 1)
		{
			while (i < size && j >= 0)
			{
				presentString += board[i][j];
				i++;
				j--;
			}
			if (toMatch.equals(presentString)) return true;
		}
		else if (i == size - 1 && j == size - 1)
		{
			for (int index = j; index >= 0; index--)
			{
				presentString += board[index][index];
			}
			if (toMatch.equals(presentString)) return true;
		}
		else if (i == size - 1 && j == 0)
		{
			while (i >= 0 && j < size)
			{
				presentString += board[i][j];
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
		for (int i = 0; i < size; i++)
		{
			presentString += board[i][j];
		}
		if (toMatch.equals(presentString)) return true;
		else return false;
	}

	private boolean isRowOfThisMark(String mark, int i)
	{
		String toMatch = stringToMatch(mark);
		String presentString = "";
		for (int j = 0; j < size; j++)
		{
			presentString += board[i][j];
		}
		if (toMatch.equals(presentString)) return true;
		else return false;
	}
	
	public boolean isAvailableAt(int i, int j)
	{
		if (board[i][j].equals(" ")) return true;
		else return false;
	}
	
	public void displayBoard()
	{
		for (int i = 0; i < board.length; i++)
		{
			System.out.print("|");
			for (int j = 0; j < board.length; j++)
			{
				String mark;
				if (board[i][j] == null)
				{
					mark = " ";
				}
				else 
				{
					mark = board[i][j];
				}
				System.out.print(" " + mark + " ");
				System.out.print("|");
			}
			System.out.println();
		}
	}

	public int size()
	{
		return size;
	}
	
}
