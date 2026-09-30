/**

 * 
 */
package test;

/**
 * Übungsklasse mit Methoden zum Filtern, Umordnen und Verarbeiten von
 * int-Arrays.
 */
public class MorePractice
{
    /**
     * Führt die Methoden mit Beispielarrays aus und gibt die Ergebnisse auf der
     * Konsole aus.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args)
    {
        MorePractice a = new MorePractice();
        int[] tests =
        { 2, 5, 2, 7, 8, 2, 4 };
        int[] resultTests = a.occurencesToTheEnd(tests, 2);
        for (int test : resultTests)
        {
            System.out.print(test + " ");
        }
        System.out.println();

        int[] tests2 =
        { 4, -2, 7, -5, 0, 3 };
        int[] resultTests2 = a.removeNegative(tests2);
        for (int test : resultTests2)
        {
            System.out.print(test + " ");
        }
        System.out.println();

        int[] tests3 =
        { 3, 7, 2 };
        int[] resultTests3 = a.elementsAppearTwice(tests3);
        for (int test : resultTests3)
        {
            System.out.print(test + " ");
        }

        System.out.println();
        int[] tests4 =
        { -3, 2, 5, 0 };
        int[] resultTests4 = a.squreElements(tests4);
        for (int test : resultTests4)
        {
            System.out.print(test + " ");
        }
        System.out.println();
        int[] tests5 =
        { 4, 2, 7, 2, 4, 4, 9 };
        int[] resultTests5 = a.keepDuplicateValue(tests5);
        for (int test : resultTests5)
        {
            System.out.print(test + " ");
        }
        System.out.println();

        int[] arr1 =
        { 4, 2, 7, 2, 9, 4 };
        int[] arr2 =
        { 8, 7, 4, 4, 6 };
        int[] resultArrs = a.keepCommonValues(arr1, arr2);
        for (int test : resultArrs)
        {
            System.out.print(test + " ");
        }

        System.out.println();

        int[] heliaArr =
        { 4, 9, 2, 9, 7, 5 };
        int heliaResult = a.findSecondLargestNum(heliaArr);
        System.out.println(heliaResult);

    }

    /**
     * Verschiebt alle Vorkommen des angegebenen Wertes an das Ende eines neuen
     * Arrays. Die Reihenfolge der übrigen Elemente bleibt erhalten.
     *
     * @param arr das zu verarbeitende Array
     * @param key der ans Ende zu verschiebende Wert
     * @return ein neues Array mit allen Vorkommen von key am Ende
     */
    public int[] occurencesToTheEnd(int[] arr, int key)
    {
        int[] reapetTeil = new int[arr.length];
        int reapetTeilLaength = 0;
        int[] uniqueTeil = new int[arr.length];
        int uniqueTeilLaength = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                reapetTeil[reapetTeilLaength] = arr[i];
                reapetTeilLaength++;
            } else
            {
                uniqueTeil[uniqueTeilLaength] = arr[i];
                uniqueTeilLaength++;
            }

        }
        int[] result = new int[arr.length];
        for (int i = 0; i < uniqueTeilLaength; i++)
        {
            result[i] = uniqueTeil[i];
        }
        for (int j = 0; j < reapetTeilLaength; j++)
        {
            result[uniqueTeilLaength + j] = reapetTeil[j];
        }
        return result;

    }

    /**
     * Entfernt alle negativen Zahlen aus dem Array. Null und positive Zahlen
     * bleiben in ihrer ursprünglichen Reihenfolge.
     *
     * @param arr das zu filternde Array
     * @return ein neues Array ohne negative Zahlen
     */
    public int[] removeNegative(int[] arr)
    {
        int[] resultTemp = new int[arr.length];
        int resultTempLaength = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 0)
            {
                resultTemp[resultTempLaength] = arr[i];
                resultTempLaength++;

            }
        }
        int[] result = new int[resultTempLaength];
        for (int i = 0; i < resultTempLaength; i++)
        {
            result[i] = resultTemp[i];

        }

        return result;

    }

    /**
     * Kopiert jedes Arrayelement zweimal direkt hintereinander in ein neues
     * Array.
     *
     * @param arr das ursprüngliche Array
     * @return ein neues Array mit der doppelten Länge
     */
    public int[] elementsAppearTwice(int[] arr)
    {
        int[] resultTemp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++)
        {
            resultTemp[i * 2] = arr[i];
            resultTemp[i * 2 + 1] = arr[i];
        }

        return resultTemp;

    }

    /**
     * Quadriert jedes Element des Arrays.
     *
     * @param arr das ursprüngliche Array
     * @return ein neues Array mit den quadrierten Werten
     */
    public int[] squreElements(int[] arr)
    {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }

    /**
     * Sammelt alle Werte, die mindestens zweimal im Array vorkommen. Jeder
     * dieser Werte wird nur einmal übernommen. Die Reihenfolge ihres ersten
     * Auftretens bleibt erhalten.
     *
     * @param arr das zu untersuchende Array
     * @return ein neues Array mit den mehrfach vorkommenden Werten
     */
    public int[] keepDuplicateValue(int[] arr)
    {
        int[] resultTemp = new int[arr.length];
        int resultTempLaength = 0;

        for (int i = 0; i < arr.length; i++)
        {
            boolean appearsAgain = false;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j] && i != j)
                {
                    appearsAgain = true;
                    break;
                }
            }
            if (appearsAgain)
            {
                boolean alreadyAdded = false;
                for (int k = 0; k < resultTempLaength; k++)
                {
                    if (resultTemp[k] == arr[i])
                    {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded)
                {
                    resultTemp[resultTempLaength] = arr[i];
                    resultTempLaength++;
                }
            }
        }

        int[] result = new int[resultTempLaength];
        for (int i = 0; i < resultTempLaength; i++)
        {
            result[i] = resultTemp[i];
        }

        return result;

    }

    /**
     * Sammelt alle Werte, die in beiden Arrays vorkommen. Jeder gemeinsame Wert
     * wird nur einmal übernommen. Die Reihenfolge ihres ersten Auftretens im
     * ersten Array bleibt erhalten.
     *
     * @param arr1 das erste Array
     * @param arr2 das zweite Array
     * @return ein neues Array mit den gemeinsamen Werten
     */
    public int[] keepCommonValues(int[] arr1, int[] arr2)
    {
        int[] resultTemp = new int[arr1.length];
        int resultTempLaength = 0;
        for (int i = 0; i < arr1.length; i++)
        {
            boolean firstInSecond = false;
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    firstInSecond = true;
                    break;
                }
            }
            if (firstInSecond)
            {
                boolean alreadyAdded = false;
                for (int k = 0; k < resultTempLaength; k++)
                {
                    if (resultTemp[k] == arr1[i])
                    {
                        alreadyAdded = true;
                        break;
                    }
                }
                if (!alreadyAdded)
                {
                    resultTemp[resultTempLaength] = arr1[i];
                    resultTempLaength++;
                }
            }
        }
        int[] result = new int[resultTempLaength];
        for (int i = 0; i < resultTempLaength; i++)
        {
            result[i] = resultTemp[i];
        }

        return result;
    }

    public int findSecondLargestNum(int[] arr)
    {
        int max = arr[0];
        int secondMax = arr[1];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;

    }

}
