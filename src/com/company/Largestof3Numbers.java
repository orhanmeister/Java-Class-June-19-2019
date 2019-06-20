package com.company;

import java.util.Scanner;

public class Largestof3Numbers
{

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an 3 integers to determine which one is largest: ");
        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        String result;

        if (x>=y && x>=z)
        {System.out.print(x + " is the largest");}
        else if (y>=z && y>=z)
        {System.out.print(y + " is the largest");}
        else
        {System.out.print(z + " is the largest");}

    }
}
