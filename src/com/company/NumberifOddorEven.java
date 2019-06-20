package com.company;

import java.util.Scanner;

public class NumberifOddorEven
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer to determine if it is even or odd: ");
        int Value = in.nextInt();
        String result;

        if (Value % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }

        System.out.print("The integer " + Value + " is " + result);
    }
}
