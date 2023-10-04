package com.development.staticmembers;

/* how to call the static methods */
public class Program5 {

     public static void add()
     {
         System.out.println("adding 2 numberes");
     }

    public static void main(String[] args) {
         add(); // 1st way to call the static method
         Program5.add();// 2nd way to call the static methods.

    }
}
