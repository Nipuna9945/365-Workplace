
package com.mycompany.p_001.V9.V24;


class Animal    // make parent class
{
    void eat()
    {
        System.out.println("Animal eat food");
    }
}

class Dog extends Animal    // make child class and extends the child class from parent class01
{
    void barks()
    {
        System.out.println("Dog barks a lot");
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        Dog myObj = new Dog();      // make an object and then call it
        myObj.eat();
        myObj.barks();
    }
}
