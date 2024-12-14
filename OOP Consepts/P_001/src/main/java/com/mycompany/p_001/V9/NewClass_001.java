
package com.mycompany.p_001.V9;

public class NewClass_001 
{
    public void FullTrottle()
    {
        System.out.println("The car is run faster as it can");
    }
    
    public void Speed(int maxSpeed)
    {
        
        System.out.println("The car speed is " + maxSpeed + "kmh-1");
    }
    
    public static void main(String[] args) 
    {
        NewClass_001 myObj = new NewClass_001();
        myObj.FullTrottle();
        
        myObj.Speed(200);
    }
}
