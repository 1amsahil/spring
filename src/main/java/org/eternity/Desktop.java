package org.eternity;

public class Desktop implements Computer {

    Desktop()
    {
        System.out.println("Desktop Object Created");
    }
    @Override
    public void compile()
    {
        System.out.println("Compiling From Desktop");
    }
}
