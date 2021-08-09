package com.techlab.model;

public class Board 
{
	private int size;
	private Tile tiles[][];
	
	public Board(int size)
	{
		this.size = size;
		tiles = new Tile[size][size];
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++) tiles[i][j] = new Tile(" ");
		}
	}
	
	public boolean isTileAvailableAt(int i, int j)
	{
		if (tiles[i][j].getMark().equals(" ")) return true;
		else return false;
	}
	
	public void mark(Tile tile, int i, int j)
	{
		tiles[i][j] = tile;
	}
	
	public int size()
	{
		return size;
	}
	
	public Tile[][] getTiles()
	{
		return tiles;
	}
	
	public void displayBoard()
	{
		for (int i = 0; i < tiles.length; i++)
		{
			System.out.print("|");
			for (int j = 0; j < tiles.length; j++)
			{
				String mark;
				if (tiles[i][j] == null)
				{
					mark = " ";
				}
				else 
				{
					mark = tiles[i][j].getMark();
				}
				System.out.print(" " + mark + " ");
				System.out.print("|");
			}
			System.out.println();
		}
	}
}
