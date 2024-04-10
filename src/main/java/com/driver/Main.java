package com.driver;

import java.util.*;
class A {
    // Method in class A
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends A {
    // Class B extends class A
    // Task 4: Overriding the meth() method from class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
public class Main {
public static void main(String[]args)
{
    B obj = new B();
    String result = obj.meth();
    System.out.println(result);
}

}
