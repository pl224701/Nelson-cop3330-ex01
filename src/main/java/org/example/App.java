/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        System.out.print("What is your name?");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.printf("Hello, %s, nice to meet you!", str);
    }
}
