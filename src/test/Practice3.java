/**
 * 
 */
package test;

/**
 * Übungsklasse mit Methoden zur Verarbeitung von Zeichenketten.
 */
public class Practice3
{
    /**
     * Testet verschiedene Methoden mit Beispieltexten und gibt die Ergebnisse
     * auf der Konsole aus.
     *
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args)
    {
        Practice3 helia = new Practice3();
        String test = "Helia likes java learning";
        char testMth = helia.frequentlyOccureWord(test);
        System.out.println(testMth);
        System.out.println();
        String test2 = "Java is fun";
        String testStr2 = helia.reverseString(test2);
        System.out.println(testStr2);
        char c = 'a';
        String testArr = helia.deleteAllGivenCharacter(test, c);
        System.out.println(testArr);
        String testNew = helia.collectLastCharacter(test);
        System.out.println(testNew);
        System.out.println();
        String test4 = "java is fun";
        String testFor4 = helia.duplicateEveryCharacter(test4);
        System.out.println(testFor4);

    }

    /**
     * Ermittelt das am häufigsten vorkommende Zeichen. Groß- und
     * Kleinschreibung werden nicht unterschieden. Leerzeichen werden nicht
     * mitgezählt. Bei gleicher Häufigkeit wird das zuerst vorkommende Zeichen
     * gewählt.
     *
     * @param str der zu untersuchende Text
     * @return das häufigste Zeichen oder ein Leerzeichen, wenn kein Zeichen
     *         gezählt wurde
     */
    public char frequentlyOccureWord(String str)
    {
        char frequentlyWord = ' ';
        int countMax = 0;
        char[] strNew = str.toLowerCase().trim().toCharArray();
        for (int i = 0; i < strNew.length; i++)
        {
            int counter = 0;
            for (int j = 0; j < strNew.length; j++)
            {
                if (strNew[i] != ' ' && strNew[i] == strNew[j])
                {
                    counter++;
                }
            }
            if (counter > countMax)
            {
                countMax = counter;
                frequentlyWord = strNew[i];
            }
        }
        return frequentlyWord;

    }

    /**
     * Kehrt die Zeichenreihenfolge innerhalb jedes Wortes um. Die Reihenfolge
     * der Wörter bleibt erhalten.
     *
     * @param str der zu verarbeitende Text
     * @return der Text mit umgekehrten Wörtern ohne äußere Leerzeichen
     */
    public String reverseString(String str)
    {
        String[] resultArr = str.split(" ");
        String result = "";
        for (int i = 0; i < resultArr.length; i++)
        {
            String currentWord = resultArr[i];
            for (int j = 0; j < currentWord.length(); j++)
            {
                result += currentWord.charAt(currentWord.length() - 1 - j);
            }
            result += " ";

        }
        return result.trim();

    }

    /**
     * Sammelt das erste Zeichen jedes durch Leerzeichen getrennten Wortes.
     * Leere Wörter werden übersprungen.
     *
     * @param text der zu verarbeitende Text
     * @return die gesammelten Anfangszeichen ohne Leerzeichen
     */
    public String collectFirstCharacters(String text)
    {
        String[] resultArr = text.split(" ");
        String result = "";

        for (int i = 0; i < resultArr.length; i++)
        {
            String currentWord = resultArr[i];

            if (!currentWord.isEmpty())
            {
                result += currentWord.charAt(0);
            }
        }

        return result;
    }

    /**
     * Entfernt alle Vorkommen des angegebenen Zeichens. Groß- und
     * Kleinschreibung werden unterschieden.
     *
     * @param str der zu verarbeitende Text
     * @param key das zu entfernende Zeichen
     * @return der Text ohne das angegebene Zeichen
     */
    public String deleteAllGivenCharacter(String str, char key)
    {

        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) != key)
            {
                result += str.charAt(i);
            }
        }
        return result;
    }

    /**
     * Sammelt das letzte Zeichen jedes durch Leerzeichen getrennten Wortes.
     * Leere Wörter werden übersprungen.
     *
     * @param str der zu verarbeitende Text
     * @return die gesammelten Endzeichen ohne Leerzeichen
     */
    public String collectLastCharacter(String str)
    {
        String result = "";
        String[] resultArr = str.split(" ");
        for (int i = 0; i < resultArr.length; i++)
        {
            if (!resultArr[i].isEmpty())
            {
                result += resultArr[i].charAt(resultArr[i].length() - 1);
            }
        }
        return result;
    }

    /**
     * Verdoppelt jedes Zeichen außer Leerzeichen. Leerzeichen bleiben
     * unverändert.
     *
     * @param str der zu verarbeitende Text
     * @return der Text mit verdoppelten Zeichen
     */
    public String duplicateEveryCharacter(String str)
    {
        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
                result += str.charAt(i);
            } else
            {
                result += str.charAt(i);
                result += str.charAt(i);
            }
        }

        return result;
    }

}
