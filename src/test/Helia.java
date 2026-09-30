/**
 * 
 */
package test;

import java.util.Arrays;

/**
 * 
 */
public class Helia
{
    public static void main(String[] args)
    {
        Helia helia = new Helia();
        int[] numbers =
        { 7, 2, 3, 10, 10, 10 };
        int[] abs = helia.removeDuplicate(numbers);
        for (int ab : abs)
        {
            System.out.print(ab + " ");
        }
        System.out.println();
        int[] ars = helia.removeAllOccurences(numbers, 10);

        for (int ar : ars)
        {
            System.out.print(ar + " ");
        }
        System.out.println();
        int[] numbers2 =
        { 10, 20, 30, 40, 50 };
        int[] javab = helia.findAboveAverage(numbers2);
        for (int jv : javab)
        {
            System.out.print(jv + " ");
        }
        System.out.println();

        int[] test =
        { 1, 2, 3, 4, 5, 6, 7 };
        int[] tests = helia.rotationArry(test, 4);
        for (int t : tests)
        {
            System.out.print(t + " ");
        }
        System.out.println();
        String str = "racecar";
        boolean bp = helia.isPalindrom(str);
        System.out.print(bp);

        System.out.println();
        String kooni = "Helia";
        String kooniJavab = helia.reserveString(kooni);
        System.out.println(kooniJavab);

        String s1 = "Listen";
        String s2 = "silent";
        System.out.println(helia.anagramCheck(s1, s2));

    }

    public int[] removeDuplicate(int arr[])
    {
        int[] temp = new int[arr.length];
        int resultLength = 0;
        for (int i = 0; i < arr.length; i++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < resultLength; j++)
            {
                if (arr[i] == temp[j])
                {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate)
            {
                temp[resultLength] = arr[i];
                resultLength++;
            }
        }
        int[] arrResult = new int[resultLength];
        for (int i = 0; i < resultLength; i++)
        {
            arrResult[i] = temp[i];
        }

        return arrResult;

    }

    public int[] removeAllOccurences(int arr[], int key)
    {

        int[] temp = new int[arr.length];
        int resultLaenge = 0;
        for (int i = 0; i < arr.length; i++)
        {
            boolean gefunden = false;
            for (int j = 0; j < resultLaenge; j++)
            {
                if (arr[i] == key)
                {
                    gefunden = true;
                    break;
                }
            }
            if (!gefunden)
            {
                temp[resultLaenge] = arr[i];
                resultLaenge++;
            }

        }
        int[] result = new int[resultLaenge];
        for (int i = 0; i < resultLaenge; i++)
        {
            result[i] = temp[i];
        }

        return result;

    }

    public int[] findAboveAverage(int[] arr)
    {
        int average = 0;
        int sumArr = 0;
        int resultLange = 0;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            sumArr += arr[i];
        }
        average = sumArr / arr.length;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > average)
            {

                temp[resultLange] = arr[i];
                resultLange++;

            }

        }
        int[] result = new int[resultLange];
        for (int i = 0; i < resultLange; i++)
        {
            result[i] = temp[i];
        }
        return result;

    }

    public int[] rotationArry(int[] arr, int zahlRotate)
    {
        int[] ersteTeil = new int[zahlRotate];
        int[] zweiteTeil = new int[arr.length - zahlRotate];
        for (int i = 0; i < zahlRotate; i++)
        {
            ersteTeil[i] = arr[i];
        }
        for (int j = zahlRotate; j < arr.length; j++)
        {
            zweiteTeil[j - zahlRotate] = arr[j];
        }

        int[] resultTemp = new int[arr.length];
        for (int i = 0; i < zweiteTeil.length; i++)
        {
            resultTemp[i] = zweiteTeil[i];
        }
        for (int j = 0; j < ersteTeil.length; j++)
        {
            resultTemp[zweiteTeil.length + j] = ersteTeil[j];
        }

        return resultTemp;
    }

    public boolean isPalindrom(String s)
    {
        s = s.toLowerCase();
        boolean gefunden = true;
        for (int i = 0; i < s.length() / 2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                gefunden = false;
            }

        }
        return gefunden;
    }

    public String reserveString(String str)
    {

        char[] result = new char[str.length()];
        for (int i = 0; i <= str.length() - 1; i++)
        {
            result[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(result);

    }

    public String anagramCheck(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return "Strings are not anagrm!";
        }
        char[] str1Characters = str1.toLowerCase().toCharArray();
        char[] str2Characters = str2.toLowerCase().toCharArray();
        Arrays.sort(str1Characters);
        Arrays.sort(str2Characters);
        if (Arrays.equals(str1Characters, str2Characters))
        {
            return "Strings are anagram.";
        }
        return "Strings are not anagram.";

    }

}
