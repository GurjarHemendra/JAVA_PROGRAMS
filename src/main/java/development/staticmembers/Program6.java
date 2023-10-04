package com.development.staticmembers;

public class Program6 {

    //static block : it start executing before the execution of main method begins.

    static
    {
        System.out.println("Static block -1 ");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

    static
    {
        System.out.println("Static block -2");
    }
}
