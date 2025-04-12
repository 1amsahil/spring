package org.eternity;

public class Programmer {

    private int age;
    Laptop lap;

//  Constructor
    Programmer()
    {
        System.out.println("Constructor Called");
    }

    Programmer(int a)
    {
        System.out.println(" Parametrized Constructor Called");
    }

//  Age Getter-Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter Called");
        this.age = age;
    }

//  Laptop Getter-Setter
    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

//  Code
    public void code()
    {
        lap.compile();
    }
}
