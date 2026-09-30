package test;

import java.util.Iterator;

public class MyClass
{
		 public static void main(String[] args)
   {
			for (int i = 1; i <= 2; i++)
			{
				for(int j = 1; j <= 3; j++)
				{
					if(i == 2)
					{
						System.out.print(j);
					}else if(i == 1)
					{
						if(j == 2)
						{
							System.out.print(i);
						}else
						{
							System.out.print(" ");
						}
					}
					 
  }
				System.out.println();
}                
    
			 System.out.println("------------------------------");

			 for(int i = 1; i <= 5; i++)
			 {
				 for(int space = 1; space <= 5 - i; space++)
				 {
					 System.out.print(" ");
				 }
				 for(int j = 1; j <= i; j++)
				 {
					 System.out.print(j + " ");
				 }
				 
					System.out.println(" ");
			 }
			 
			 System.out.println("------------------------------");
			 
			 int row = 5;
			 int x = 0;
			 for(int i = 1; i <= row; i++)
			 {
				 x= i -1;
				 for(int space = i; space <= row -1; space++)
				 {
					 System.out.print(" ");
					 System.out.print("  ");
					
				 }
				 for(int j = 0; j <= x; j++)
				 {
					 System.out.print(i + j + "  ");
				 }
				 for(int j = 1; j <= x; j++)
				 {
					 System.out.print(i + x - j + "  ");
				 }
				 System.out.println();
			 }
			 
			 System.out.println("------------------------------");

			 
			 for (int i = 1; i <= 5; i++) 
			 {
				 for(int space = 1; space <= 5 - i; space++)
				 {
					 System.out.print(" ");

				 }

					for (int j = 1; j <= i; j++) 
					{
						System.out.print(j);
					}
					System.out.println();

			 
	}
			 System.out.println("------------------------------");
			 
			 for (int i = 1; i <= 5; i++) 
			 {
				for(char c = 'a'; c <= 'a' +i -1 ; c++)
				{
					System.out.print(c  + " ");
				}
				System.out.println();

					}

			 System.out.println("------------------------------");
			 
			 
			 for(int i = 5; i>= 1; i--)
			 {
				 for(char c = 'a'; c <= 'a' +i -1 ; c++)
				 {
					 System.out.print(c  + " ");
				 }
				 System.out.println();
			 }
			 
			 System.out.println("------------------------------");
			 
			 int y = 1;
			 for(int i = 1; i <= 4; i++)
			 {
				 for(int j = 1; j <= i; j++)
				 {
					 System.out.print(y);
					 y++;
				 }
				 System.out.println();
			 }
			 
			 System.out.println("------------------------------");
			 
			 for(int i = 1; i <= 4; i++)
			 {
				 for(int j = 1; j <= i; j++)
				 {
					 System.out.print("*");
					
				 }
				 System.out.println();
			 }
			 
			 }


			 
   }
		 
