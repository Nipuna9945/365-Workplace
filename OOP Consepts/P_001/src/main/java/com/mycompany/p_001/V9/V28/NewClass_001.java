
package com.mycompany.p_001.V9.V28;


interface Vehicle
{
    public void DrivingSound();
    public void Drifting();
}

class Car implements Vehicle
{
    public void DrivingSound()
    {
        System.out.println("Turbo sound = Sutuzuuuuuuu");
    }
    
    public void Drifting()
    {
        System.out.println("Press the gas and give em a show");
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        Car myObj = new Car();
        
        myObj.DrivingSound();
        myObj.Drifting();
    }
}

