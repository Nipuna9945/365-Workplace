
package com.mycompany.p_001.V9.V18;

public class NewClass_001 
{
    final int x = 13;
    final double Pi = 3.14;
    
    public static void main(String[] args) 
    {
        NewClass_001 myObj = new NewClass_001();
        
        //myObj.x = 50;       // will generate an error: cannot assign a value to a final variable
        //myObj.Pi = 2.49;        // will generate an error: cannot assign a value to a final variable
                
        System.out.println(myObj.x);
    }
}
