package com.techlab.test;

import org.junit.Test;
import com.techlab.model.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;


public class BoardTest 
{
	@Test
	public void test_if_mark_cell_is_marking_right_index() throws CellAlreadyMarkedException
	{
		// arrange
		Mark expected = Mark.X;
		//
		int size = 3;
		int index = 1;
		Board board = new Board(size);
		board.markCell(index, Mark.X);
		List<Cell> cells = board.getCells();
		// assert
		assertEquals(expected, cells.get(index).getMark());
	}
	
	@Test
	public void test_if_isBoardFull_returning_false_when_not_full() throws CellAlreadyMarkedException
	{
		// arrange
		boolean expected = false;
		// act
		int size = 3;
		Board board = new Board(size);
		board.markCell(0, Mark.X);
		board.markCell(1, Mark.O);
		board.markCell(2, Mark.X);
		board.markCell(3, Mark.O);
		// assert
		assertEquals(expected, board.isFull());
	}
	
	@Test
	public void test_if_isBoardFull_returning_true_when_full() throws CellAlreadyMarkedException
	{
		// arrange
		boolean expected = true;
		// act
		int size = 3;
		Board board = new Board(size);
		board.markCell(0, Mark.X);
		board.markCell(1, Mark.O);
		board.markCell(2, Mark.X);
		board.markCell(3, Mark.O);
		board.markCell(4, Mark.X);
		board.markCell(5, Mark.O);
		board.markCell(6, Mark.X);
		board.markCell(7, Mark.O);
		board.markCell(8, Mark.X);
		// assert
		assertEquals(expected, board.isFull());
	}
}
