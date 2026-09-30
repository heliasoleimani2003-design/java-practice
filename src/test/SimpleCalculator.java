package test;

import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String[] args)
	{
		double x, y;
		char op;
		boolean running = true;

		Scanner input = new Scanner(System.in);

		while(running)
		{

			System.out.println("Gib erste Zahl (x)");
			x = input.nextDouble();

			System.out.println("Gib zweite Zahl (y)");
			y = input.nextDouble();

			double a = x + y;
			double b = x - y;
			double c = x * y;
			double d = x / y;

			System.out.println("Welche mathematische Operation? (/  *  +  - )");
			op = input.next().charAt(0);

			if(op == '+')
			{
				System.out.println("Ergebnis: " + a);

			}else if(op == '-')
			{
				System.out.println("Ergebnis: " + b);

			}else if(op == '*')
			{
				if(x==0)
				{
					System.out.println("Division durch null");
				}
				else
				{
					System.out.println("Ergebnis: " + c);
			    }

			}else
			{
				System.out.println("Ergebnis: " + d);
			}

			System.out.println("Willst du weiter machen? yes/No");

			input.nextLine();
			String answer = input.nextLine();

			if(answer.equalsIgnoreCase("no"))
			{
				running = false;

				boolean positivNum = false;

				int[] araye = new int[10];

				int sum = 0;

				System.out.println("Gib 10 positive und negative Zahlen");

				for(int i = 0; i < 10; i++)
				{
					araye[i] = input.nextInt();

					if(araye[i] > 0)
					{
						positivNum = true;
						sum += araye[i];
					}
				}

				if(positivNum == false)
				{
					System.out.println("Es werden keine positive Zahlen gegeben.");

				}else
				{
					System.out.println("Die Summe ist gleich: " + sum);
				}
			}
		}
	}
}