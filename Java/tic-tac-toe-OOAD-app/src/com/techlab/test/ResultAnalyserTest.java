package com.techlab.test;

import com.techlab.model.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class ResultAnalyserTest
{
	@Test
	public void test_checkAndGetResult_is_returning_true_when_rows_are_completed() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.Won;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(0,Mark.X);
		board.markCell(1, Mark.X);
		board.markCell(2, Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_checkAndGetResult_is_returning_false_when_rows_are_incomplete() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.ONGOING;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(0,Mark.X);
		board.markCell(1, Mark.X);
		board.markCell(5, Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_checkAndGetResult_is_returning_true_when_cols_are_completed() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.Won;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(0,Mark.X);
		board.markCell(3, Mark.X);
		board.markCell(6, Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_checkAndGetResult_is_returning_false_when_cols_are_incomplete() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.ONGOING;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(0,Mark.X);
		board.markCell(3, Mark.X);
		board.markCell(8, Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_checkAndGetResult_is_returning_true_when_diagonals_are_completed() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.Won;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(0,Mark.X);
		board.markCell(4, Mark.X);
		board.markCell(8, Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_checkAndGetResult_is_returning_false_when_diagonals_are_incomplete() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.ONGOING;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(2,Mark.X);
		board.markCell(4, Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_if_checkAndGetResult_returning_match_is_draw() throws CellAlreadyMarkedException
	{
		// arrange
		Result expected = Result.Draw;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		board.markCell(0,Mark.O);
		board.markCell(1, Mark.X);
		board.markCell(2,Mark.X);
		board.markCell(3, Mark.X);
		board.markCell(4,Mark.X);
		board.markCell(5, Mark.O);
		board.markCell(6,Mark.O);
		board.markCell(7, Mark.O);
		board.markCell(8,Mark.X);
		analyser.checkResult();
		Result actual = analyser.getResult();
		// assert
		assertEquals(expected, actual);
	}
}
