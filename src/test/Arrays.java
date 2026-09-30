/**
 * 
 */
package test;

/**
 * 
 */
public class Arrays
{
    public static void main(String[] args)
    {
        int[][] sensorData = new int[2][5];
        int[][] input =
        {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        int[][] result = new int[3][3];

        // Startwert für das Befüllen des Arrays
        int startWert = 10;

        // Befüllen des Arrays zeilenweise von links nach rechts

        // Ausgabe des Arrays als Tabelle

        // Ausgabe des aktuellen Elements
        for (int i = 0; i < sensorData.length; i++)
        {
            for (int j = 0; j < sensorData[i].length; j++)
            {
                sensorData[i][j] = startWert;
                System.out.print(sensorData[i][j]);

                if (j < sensorData[i].length - 1)
                {
                    System.out.print(" ");
                }
                startWert++;
            }
            System.out.println();
        }

        for (int i = 0; i < input.length; i++)
        {
            for (int j = 0; j < input[i].length; j++)
            {
                result[j][i] = input[i][j];
                System.out.print(result[j][i] + " ");

            }
            System.out.println();
        }

    }
}
