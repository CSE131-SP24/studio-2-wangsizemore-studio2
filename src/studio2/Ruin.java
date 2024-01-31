package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Start Amount: ");
		double startAmount = in.nextDouble();
		
		System.out.print("Win Chance: ");
		double winChance = in.nextDouble();
		
		double winOrLose = Math.random();
		
		System.out.print("Win Limit: ");
		double winLimit = in.nextDouble();
		
		System.out.print("Number of Days: ");
		int totalSimulations = in.nextInt();
		
  for(int i = 1; i <= totalSimulations; i++)
		while((startAmount > 0) && (startAmount < winLimit))
			{
				if (winOrLose <= winChance)
					{
						System.out.println("You win!");
						startAmount = startAmount + 1;
						System.out.println(startAmount);
					}
		
				else
					{
						System.out.println("You lose!");
						startAmount = startAmount - 1;
						System.out.println(startAmount);
		}
		}
		
	}
	}

