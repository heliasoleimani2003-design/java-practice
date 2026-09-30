/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * 
 */
public class WhatEver
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int belibigeZahl = 2;

        int arr[] =
        { 1, 2, 3, 4, 5, 6, 7 };

        int ersteTeil[] = new int[belibigeZahl];
        int zweiteTeil[] = new int[arr.length - belibigeZahl];
        int result[] = new int[arr.length];

        for (int i = 0; i < belibigeZahl; i++)
        {
            ersteTeil[i] = arr[i];

        }
        for (int j = belibigeZahl; j < arr.length; j++)
        {
            zweiteTeil[j - belibigeZahl] = arr[j];
        }
        for (int i = 0; i < zweiteTeil.length; i++)
        {
            result[i] = zweiteTeil[i];

        }

        for (int i = 0; i < ersteTeil.length; i++)
        {
            result[zweiteTeil.length + i] = ersteTeil[i];
        }

        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }

    }

}
