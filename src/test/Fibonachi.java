/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * 
 */
public class Fibonachi
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int decimalZahl = scanner.nextInt();
        ;
        int[] zahlen = new int[100];
        int k = 0;
        int result2 = 1;

        for (int i = decimalZahl; i >= 1; i--)
        {
            zahlen[k] = i;
            k++;

        }
        for (int i = 0; i < k; i++)
        {
            result2 *= zahlen[i];
        }
        System.out.println(result2);

    }

}
