package com.techlab.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.techlab.model.*;

public class Test 
{

	public static void main(String[] args) throws NumberFormatException, CellAlreadyMarkedException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Result result = Result.ONGOING;
		Board board = new Board(3);
		ResultAnalyser analyser = new ResultAnalyser(board);
		Player p1 = new Player("Shivam", Mark.O);
		Player p2 = new Player("Nikhil", Mark.X);
		Game game = new Game(p1, p2, board, analyser);
		PrintBoard printer = new PrintBoard(board);
		while(result == Result.ONGOING)
		{
			try
			{
				System.out.println(game.getCurrentPlayer().getName() + " your turn");
				printer.printBoard();
				result = game.play(Integer.parseInt(br.readLine()));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		if (result == Result.Won)
			System.out.println(game.getCurrentPlayer().getName() + " won");
		else
			System.out.println("draw");
	}

}
