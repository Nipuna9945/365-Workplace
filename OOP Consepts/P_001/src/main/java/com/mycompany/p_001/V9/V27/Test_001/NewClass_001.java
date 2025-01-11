
package com.mycompany.p_001.V9.V27.Test_001;


abstract class Vehicle
{
    public abstract void Drifting();
    
    public void Drive()
    {
        System.out.println("Put a gear and drive a vehicle");
    }
}

class Car extends Vehicle
{
    public void Drifting()
    {
        System.out.println("Just press your accelarator and use handbreak to do a drift");
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        Car myObj = new Car();
        myObj.Drive();
        myObj.Drifting();
    }
}
