/**

 * 
 */
package test;

/**
 * 
 */
public class MorePractice
{
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

    public int[] squreElements(int[] arr)
    {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }

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
