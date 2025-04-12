package org.eternity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    private int age;


    @Qualifier("desktop")
    Computer com;

    //  Constructor
    public Programmer()
    {
        System.out.println("Constructor Called");
    }

    public Programmer(int a, Computer c)
    {
        System.out.println("Parametrized Constructor Called");
        this.age = a;
        this.com = c;
    }

    //  Age Getter-Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age Setter Called");
        this.age = age;
    }

    //  Computer Getter-Setter
    public Computer getCom() {
        return com;
    }

    @Autowired
    public void setCom(Computer com) {
        this.com = com;
    }

    //  Code
    public void code()
    {
        com.compile();
    }
}
