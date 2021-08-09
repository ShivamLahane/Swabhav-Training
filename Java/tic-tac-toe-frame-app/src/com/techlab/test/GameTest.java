package com.techlab.test;

import com.techlab.model.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class GameTest 
{
	@Test
	public void test_if_changeTurn_is_changing_turns_or_not()
	{
		// arrange
		Player p1 = new Player("Shivam" , Mark.O);
		Player p2 = new Player("abc", Mark.X);
		Player expected = p2;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		Game game = new Game(p1, p2, board, analyser);
		Player actual = game.changeTurn();
		// assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_if_play_method_marking_cell_and_changing_turn() throws CellAlreadyMarkedException
	{
		// arrange
		Player p1 = new Player("Shivam", Mark.O);
		Player p2 = new Player("Nikhil", Mark.X);
		Mark expectedMark = Mark.O;
		Player expectedTurn = p2;
		// act
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		Game game = new Game(p1, p2, board, analyser);
		game.play(0);
		Mark actualMark = board.getCells().get(0).getMark();
		Player actualTurn = game.getCurrentPlayer();
		// assert
		assertEquals(expectedMark, actualMark);
		assertEquals(expectedTurn, actualTurn);
	}
}
