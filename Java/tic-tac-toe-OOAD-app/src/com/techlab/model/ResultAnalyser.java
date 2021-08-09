package com.techlab.model;

import java.util.List;

public class ResultAnalyser 
{
	private Board board;
	private Result result;
	
	public ResultAnalyser(Board board)
	{
		this.board = board;
		this.result = Result.ONGOING;
	}
	
	public Result getResult()
	{
		return result;
	}
	
	public Board getBoard()
	{
		return board;
	}
	
	public void checkResult()
	{
		List<Cell> cells = board.getCells();
		if (checkRows(cells)) 
			result = Result.Won;
		else if ( checkColumns(cells)) 
			result = Result.Won;
		else if (board.size() % 2 == 1 && checkDiagonals(cells)) 
			result = Result.Won; 
		else if (board.isFull()) 
			result = Result.Draw;
		else
			result = Result.ONGOING;
	}

	private boolean checkDiagonals(List<Cell> cells) 
	{
		int index = 0;
		Mark mark = cells.get(index).getMark();
		int row = index + board.size() + 1;
		while (row < cells.size() && mark != Mark.EMPTY && cells.get(row).getMark() == mark)
			row += board.size() + 1;
		if (row == cells.size() + (board.size())) return true;
		index = board.size() - 1;
		mark = cells.get(index).getMark();
		row = index + board.size() - 1;
		while (row < cells.size() - 1 && mark != Mark.EMPTY && cells.get(row).getMark() == mark)
			row += board.size() - 1;
		if (row == cells.size() - 1) return true;
		return false;
	}

	private boolean checkColumns(List<Cell> cells) 
	{
		boolean found = false;
		int c = 0;
		Mark mark = cells.get(c).getMark();
		while (c < board.size())
		{
			int row = c + board.size();
			while (row < cells.size() && mark!= Mark.EMPTY && cells.get(row).getMark() == mark) 
			{
				row += board.size();
			}
			if (row >= cells.size())
			{
				found = true;
				break;
			}
			c++;
		}
		return found;
	}

	private boolean checkRows(List<Cell> cells) 
	{
		boolean found = false;
		int r = 0;
		Mark mark = cells.get(r).getMark();
		while (r < cells.size())
		{
			int col = r + 1;
			while (mark != Mark.EMPTY && col < r + board.size() && cells.get(col).getMark() == mark) 
				col++;
			if (col == (r + board.size()))
			{
				found = true;
				break;
			}
			r += board.size();
		}
		return found;
	}
}

// O	X	X            //		0	1	2	3	4
// X	X	O			 //		5	6	7	8	9
// O	O	X			 //		10	11	12	13	14
						 //		15  16  17	18	19
						 //		20	21	22	23	24