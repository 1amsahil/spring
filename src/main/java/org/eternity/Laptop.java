package org.eternity;

public class Laptop implements Computer {

    public Laptop()
    {
        System.out.println("Laptop Object Created");
    }

    public void compile()
    {
        System.out.println("Compiling from Laptop");
    }
}
