
package com.mycompany.p_001.V9.V25;


class Vehicle
{
    void drive()
    {
        System.out.println("Vehicle can drive");
    }
}

class Car extends Vehicle
{
    void drift()
    {
        System.out.println("Car can drift");
    }
    
    void reverse()
    {
        System.out.println("Car can reverse");
    }
}

class Bike extends Vehicle
{
    void wheelie()
    {
        System.out.println("Bike can do a wheelie");
    }
    
    void stunt()
    {
        System.out.println("Bike can do stunt");
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        Car myCarObj = new Car();
        Bike myBikeObj = new Bike();
        
        myCarObj.drive();
        myCarObj.drift();
        myCarObj.reverse();
        
        myBikeObj.wheelie();
        myBikeObj.stunt();
        
    }
}
