package com.techlab.test;

import org.junit.Test;
import com.techlab.model.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest 
{
	@Test
	public void test_if_mark_is_empty()
	{
		// arrange
		Mark expectedMark = Mark.EMPTY;
		// act
		Cell cell = new Cell();
		// assert
		assertEquals(expectedMark, cell.getMark());
	}
	
	@Test
	public void test_if_setMark_is_working() throws CellAlreadyMarkedException
	{
		// arrange
		Mark expectedMark = Mark.X;
		// act
		Cell cell = new Cell();
		cell.setMark(Mark.X);
		// assert
		assertEquals(expectedMark, cell.getMark());
	}
	
	@Test
	public void test_if_setMark_is_throwing_exception()
	{
		// arrange
		String expected = "This cell is already marked.";
		Mark expectedMark = Mark.O;
		// act
		Cell cell = new Cell();
		try 
		{
			cell.setMark(Mark.O);
		} 
		catch (CellAlreadyMarkedException e1) 
		{
			e1.printStackTrace();
		}
		String actual = null;
		Mark actualMark = null;
		try 
		{
			cell.setMark(Mark.X);
		} catch (CellAlreadyMarkedException e) 
		{
			actual = e.getMessage();
			actualMark = cell.getMark();
		}
		assertEquals(expectedMark, actualMark);
		assertEquals(expected, actual);
	}
}
