package com.techlab.apps;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.techlab.model.*;

public class TicTacToeConsoleBasedApp 
{

	public TicTacToeConsoleBasedApp(int boardSize , String player1Name, Mark mark1, String player2Name, Mark mark2) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Result result = Result.ONGOING;
		
		Board board = new Board(boardSize);
		ResultAnalyser analyser = new ResultAnalyser(board);
		Player p1 = new Player(player1Name, mark1);
		Player p2 = new Player(player2Name, mark2);
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
		
		printer.printBoard();
		
		if (result == Result.Won)
		{
			System.out.println(game.getCurrentPlayer().getName() + " won");
		}
		else
		{
			System.out.println("draw");
		}
	}

}
