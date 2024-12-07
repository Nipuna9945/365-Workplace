
package com.mycompany.p_001.V4;


public class NewClass_002 
{
    public static void main(String[] args) 
    {
        NewClass_001 myObj1 = new NewClass_001();
        NewClass_001 myObj2 = new NewClass_001();
        NewClass_001 myObj3 = new NewClass_001();
        
        myObj3.age = 25;
        
        System.out.println("My full name is " + myObj1.N1 + " " + myObj2.N2 + " " + "and my age is " + myObj3.age);
    }
}
