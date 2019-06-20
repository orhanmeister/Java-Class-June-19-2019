package com.company;

import java.util.Scanner;

public class SumofNumbersUsingLoop
{

    public static void main(String[] args)
    {

        System.out.print("Please enter an integer: ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i<=n; i++) {
            sum += i; }

/*      CURLY BRACKETS are VERY Important and defines the "block"
        Putting in up top only adds all of them up, we only get a single result down below

        BUT, if we Put the CURLY BRACKET below, then it adds the 2 numbers and prints it down
        then, repeats it down below. So we get bunch of numbers
        (the sum and the next number adds up, then keep repeating)
 */
        System.out.print(sum);



    }
}
