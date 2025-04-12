package org.eternity;

public class Laptop implements Computer {

    Laptop()
    {
        System.out.println("Laptop Object Created");
    }
    @Override
    public void compile()
    {
        System.out.println("Compiling From Laptop");
    }
}
