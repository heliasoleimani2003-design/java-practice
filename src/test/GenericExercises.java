package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class GenericExercises
{
    public static void main(String[] args)
    {
        Integer[] arr1 =
        { 1, 10, 5 };
        Integer[] arr2 =
        { 1, 10, 5 };
        Integer[] arr3 =
        { 1, 3, 56, 76 };
        String[] str1 =
        { "Helia", "Java" };
        String[] str2 =
        { "Helia", "java" };

        System.out.println(check(arr1, arr2));
        System.out.println(check(arr1, arr3));
        System.out.println(check(str2, str1));
        boolean bool = check(str1, str2);
        System.out.println(bool);

    }

    /**
     * 
     * @param <T>
     * @param array1
     * @param array2
     * @return
     */
    public static <T> boolean check(T[] array1, T[] array2)
    {

        if (array1.length != array2.length)
        {
            return false;

        } else
        {
            for (int i = 0; i < array1.length; i++)
            {
                if (array1[i] instanceof String && array2[i] instanceof String)
                {
                    String s1 = (String) array1[i];
                    String s2 = (String) array1[i];
                    if (!s1.equalsIgnoreCase(s2))
                    {
                        return false;
                    }
                } else
                {
                    if (!array1[i].equals(array2))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /**
     * 
     * @param <T>
     * @param oddAndEven
     * @return
     */
    public static <T extends Number> void numbers(List<T> oddAndEven)
    {
        List<T> evenNumbers = new ArrayList<T>();
        List<T> oddNumbers = new ArrayList<T>();

        for (T number : oddAndEven)
        {
            if (number.intValue() % 2 == 0)
            {
                evenNumbers.add(number);
            } else
            {
                oddNumbers.add(number);
            }
        }

    }

    /**
     * 
     * @param <T>
     * @param allNumbers
     * @return
     */
    public static <T extends Number> int sumNumbers(List<T> allNumbers)
    {
        int sumEven = 0;

        for (T number : allNumbers)
        {
            if (number.intValue() % 2 == 0)
            {
                sumEven += number.intValue();
            }

        }
        return sumEven;
    }

}
