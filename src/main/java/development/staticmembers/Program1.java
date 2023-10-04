package com.development.staticmembers;

public class Program1 {
     static int a=10 ; // static variable
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Program1.a);
        System.out.println(Program2.b);
    }

}
/*
*   Where should i create static variable : Class area
*   how can i access the static variable :
*              1 . by the name
*              2.  Class name as reference
*
* */