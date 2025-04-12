package org.eternity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {

    @Value("24")
    private int age;
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
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    //  Code
    public void code()
    {
        com.compile();
    }
}
