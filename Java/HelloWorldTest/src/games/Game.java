package games;

import java.util.Scanner;

public class Game 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean repeat = true;
		while (repeat)
		{
			int count = 1;
			System.out.println("Guess the number");
			System.out.println("I'm thinking of a number from 1 to 10");
			int randomNumber = (int) Math.random() * 10;
			while (true)
			{
				System.out.print("Your guess: ");
				int input = sc.nextInt();
				if (input > randomNumber)
				{
					System.out.println("Too High");
				}
				else if (input < randomNumber)
				{
					System.out.println("Too Low");
				}
				else
				{
					System.out.println("You guessed it in "+ count + "tries");
					break;
				}
				count++;
			}
			System.out.print("Would you like to continue (y/n) ? ");
			char c = sc.next().charAt(0);
			if (c == 'n')
			{
				repeat = false;
			}
		}
		sc.close();
	}
}
