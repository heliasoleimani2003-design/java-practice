/**
 * 
 */
package test;

/**
 * Übungsklasse mit Methoden zur Verarbeitung von int-Arrays.
 */
public class MyClassWiederholen
{
    /**
     * Führt die Methoden mit Beispielarrays aus und gibt die Ergebnisse auf der
     * Konsole aus.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args)
    {
        MyClassWiederholen mc = new MyClassWiederholen();
        int[] numbers =
        { 7, 2, 3, 10, 5 };
        int b = mc.sumArrayElements(numbers);
        int c = mc.maxArray(numbers);

        System.out.println(b);
        System.out.println(c);

        int[] arry =
        { 1, 2, 1, 3, 1 };
        int d = mc.occurenceMax(arry);
        System.out.println(d);

        int e = mc.maxMinDifferenz(numbers);
        System.out.println(e);

        int[] numbs =
        { 4, 7, 9, 7, 4 };
        boolean bo = mc.arrSymmetric(numbs);
        System.out.println(bo);

    }

    /**
     * Berechnet die Summe aller Elemente eines Arrays.
     *
     * @param arr das Array mit den zu addierenden Zahlen
     * @return die Summe aller Arrayelemente
     */
    public int sumArrayElements(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            sum += arr[i];

        }
        return sum;

    }

    /**
     * Ermittelt den größten Wert eines Arrays.
     *
     * @param arr ein nicht leeres Array
     * @return der größte Wert im Array
     * @throws IllegalArgumentException wenn das Array null oder leer ist
     */
    public int maxArray(int[] arr)
    {
        if (arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Array darf nicht leer sein.");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

        }
        return max;
    }

    /**
     * Ermittelt die Zahl, die im Array am häufigsten vorkommt. Bei gleicher
     * Häufigkeit wird die zuerst vorkommende Zahl zurückgegeben.
     *
     * @param arr ein nicht leeres Array
     * @return die am häufigsten vorkommende Zahl
     */
    public int occurenceMax(int[] arr)
    {

        int countMax = 0;
        int maxOccurence = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int counter = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    counter++;
                    if (counter > countMax)
                    {
                        countMax = counter;
                        maxOccurence = arr[i];

                    }
                }
            }
        }
        return maxOccurence;
    }

    /**
     * Berechnet die Differenz zwischen dem größten und dem kleinsten Wert eines
     * Arrays.
     *
     * @param arr ein nicht leeres Array
     * @return der größte Wert minus dem kleinsten Wert
     */
    public int maxMinDifferenz(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
        int differenz = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] < min)
            {
                min = arr[j];
            }
        }
        differenz = max - min;
        return differenz;
    }

    /**
     * Prüft, ob ein Array symmetrisch ist. Dafür werden die Elemente von außen
     * nach innen verglichen.
     *
     * @param arr das zu prüfende Array
     * @return true, wenn das Array symmetrisch ist, sonst false
     */
    public boolean arrSymmetric(int[] arr)
    {
        boolean gefunden = true;
        for (int i = 0; i < arr.length / 2; i++)
        {
            if (arr[i] != arr[arr.length - 1 - i])
            {
                gefunden = false;
            }
        }
        return gefunden;
    }

}
