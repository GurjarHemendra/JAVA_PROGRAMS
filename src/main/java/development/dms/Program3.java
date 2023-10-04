package com.development.dms;

public class Program3 {
    public static void main(String[] args) {
        // switch case statement
        int number=71;
        switch (number%2)
        {
            case 0:{
                System.out.println("even number");
                break; // a keyword and it will transfer the control out of the block
            }
            case 12:
            {
                System.out.println("odd number");
                break;
            }
            /* default is optional but its a good programming practise */
            default :
            {
                System.out.println("invalid input");
            }
        }
    }
}
/*
*  task 3: create a program and print the months
*   1: january , 2: february .................. 12: december
*
* */
