package games;

import java.util.Scanner;

public class DiceGame 
{
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int totalScore = 0, turn = 1, turnScore = 0, maxScore = 20, die; char rollOrHold; boolean isNextTurn = true;
		while (isNextTurn)
		{
			System.out.println("TURN" + " " + turn);
			System.out.println("roll or hold (r/h) ? :");
			rollOrHold = sc.next().charAt(0);
			if (rollOrHold == 'h')
			{
				turn++;
				totalScore += turnScore;
				System.out.println("Score for turn : " + turnScore);
				System.out.println("Total score : " + totalScore);
				if (totalScore >= maxScore)
				{
					isNextTurn = false;
				}
				turnScore = 0;
			}
			else
			{
				die = (int) (Math.random() * 5) + 1;
				System.out.println("Die :" + die);
				if (die == 1) 
				{
					turnScore = 0;
					System.out.println("Turn Over No Score.");
					turn++;
				}
				else
				{
					turnScore += die;
				}
			}
		}
		System.out.println("You finished in " + turn + "turns.");
		System.out.println("Game Over.");
	}

}

