
package com.mycompany.p_001.V9.V26.Test_001;


class Vehicle
{
    protected String brand = "koenigsegg";
    
    public void honk()
    {
        System.out.println("Homp Homp");
    }
}

class Car extends Vehicle
{
    protected String model = "Jesko";
    
    public static void main(String[] args) 
    {
        Car myCarObj = new Car();
        myCarObj.honk();
        
        System.out.println(myCarObj.brand + " " + myCarObj.model);
    }
} 