package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Board
{
	private List<Cell> cells = new ArrayList<Cell>();
	private int size;
	private int markedCellsCount;
	
	public Board(int size)
	{
		this.size = size;
		this.markedCellsCount = 0;
		for (int i = 0; i < Math.pow(size, 2); i++)
		{
			cells.add(new Cell());
		}
	}
	
	public int getMarkedCellsCount()
	{
		return markedCellsCount;
	}
	
	public List<Cell> getCells()
	{
		return cells;
	}
	
	public int size()
	{
		return size;
	}
	
	public void markCell(int index, Mark mark) throws CellAlreadyMarkedException 
	{
		cells.get(index).setMark(mark);
		markedCellsCount++;
	}
	
	public boolean isFull()
	{
		if (getMarkedCellsCount() == cells.size()) return true;
		else return false;
	}
}
