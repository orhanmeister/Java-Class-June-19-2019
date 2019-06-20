package com.company;

import java.util.Scanner;

public class SumofNumbersUsingLoopBUTjustlistingnumbers
{

    public static void main(String[] args)
    {

        System.out.print("Please enter an integer: ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;

        for (int i = 0; i<=n; i++) {
            sum += i;


//      The below code used "if" statement, and allowed you to print all the EVEN numbers.

            if (sum % 2 == 0) {
                System.out.println(sum);
            }
            System.out.println(sum);


        }


    }
}
