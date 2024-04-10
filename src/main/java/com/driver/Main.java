package com.driver;

import java.util.*;
public class Main {
  B obj = new B();
    String result = obj.meth();
}
class A{
    public static String meth()
    {
        String ans = "Invoking method from class A";

        return ans;
    }
}
class B extends A{
    public static String meth()
    {
        String ans = "Method is overridden in Extendend class B";
        return ans;
    }
}