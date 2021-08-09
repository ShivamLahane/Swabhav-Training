package com.techlab.model;

import java.util.List;

public class PrintBoard 
{
	private Board board;
	
	public PrintBoard(Board  board)
	{
		this.board = board;
	}
	
	public void printBoard()
	{
		List<Cell> cells = board.getCells();
		int index = 0;
		for (int i = 0; i < board.size(); i++)
		{
			for (int j = 0; j < board.size(); j++)
			{
				Mark mark = cells.get(index).getMark();
				if (mark == Mark.EMPTY)
				{
					System.out.print("[-]");
				}
				else
				{
					System.out.print("[" + mark +"]");
				}
				index++;
			}
			System.out.println();
		}
	}
}