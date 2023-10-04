package com.development.Methods;

public class Program2
{
    public static void login(String name,int id)
    {
        System.out.println("Hi "+name+ " welcome to flipkart. your ID is "+id);
    }

    public static void main(String[] args) {
        System.out.println("login start...");
        login("Rutuja", 101);
        System.out.println("Logged in");

    }
}
