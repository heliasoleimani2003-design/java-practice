/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * 
 */
public class Tesr
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int decimalZahl = scanner.nextInt();

        int division = 0;
        int[] results = new int[50];
        int zeahler = 0;

        while (decimalZahl > 0)
        {
            int restDivision = decimalZahl % 2;
            decimalZahl = decimalZahl / 2;

            results[zeahler] = restDivision;
            zeahler++;

        }

        for (int i = zeahler - 1; i >= 0; i--)
        {
            System.out.print(results[i]);
        }

    }

}
