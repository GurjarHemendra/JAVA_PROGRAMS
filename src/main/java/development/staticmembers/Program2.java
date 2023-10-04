package com.development.staticmembers;

public class Program2 {
    static int a=20;
    static int b=30;
    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(Program2.b);
        System.out.println(a);
        System.out.println(Program2.a);
        System.out.println(Program1.a);
    }
}
