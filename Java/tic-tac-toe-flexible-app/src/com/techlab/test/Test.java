package com.techlab.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.techlab.model.*;

public class Test
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// declaring size.
		int size = 3;
		// creating Board object.
		Board board = new Board(size);
		// creating Umpire object.
		Umpire umpire = new Umpire(board);
		// creating two Player objects.
		Player x = new Player("X", "Shivam");
		Player o = new Player("O", "Nikhil");
		// 
		int count = 1;
		int blocks = (int) Math.pow(size, 2);
		//
		boolean won = false;
		//
		Player turn = x;
		System.out.println("We will start with " + turn.getName() + ".\n");
		while (!won && count <= blocks)
		{
			System.out.println("This is " + turn.getMark() + "'s turn.");
			board.displayBoard();
			System.out.println("Enter position: ");
			String input[] = br.readLine().trim().split("\\s+");
			int i = Integer.parseInt(input[0]);
			int j = Integer.parseInt(input[1]);
			if (board.isTileAvailableAt(i, j))
			{
				board.mark(new Tile(turn.getMark()), i, j);
				won = umpire.isWinMove(turn.getMark(), i, j);
				count++;
				if (!won)
				{
					if (turn.equals(x)) turn = o;
					else turn = x;
				}
			}
			else
			{
				System.out.println("These positions are already marked. choose other.");
			}
		}
		board.displayBoard();
		if (won)
		{
			System.out.println("Congratulations " + turn.getName() + ", you have won the game.");
		}
		else
		{
			System.out.println("The match is draw.");
		}
	}
}
