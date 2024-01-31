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
  {
		double currentAmount = startAmount;
		System.out.print("Simulation " + i + ":");
		
	  while((currentAmount > 0) && (currentAmount < winLimit))
			{
				if (winOrLose <= winChance)
					{
						currentAmount++;
					}
		
				else
					{
						currentAmount--;
		}
		}
		}
		
	}
	}

