package org.example;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);
        System.out.print( "What is the first number? ");
        int x = Integer.parseInt(Obj.nextLine());
        System.out.print( "What is the second number? ");
        int y = Integer.parseInt(Obj.nextLine());
        int add = x+y;
        int sub = x-y;
        int mul = x*y;
        int div = x/y;
        System.out.println
        (
            x+" + "+y+" = "+add+"\n"
            +x+" - "+y+" = "+sub+"\n"
            +x+" * "+y+" = "+mul+"\n"
            +x+" / "+y+" = "+div+"\n"
        );
    }
}