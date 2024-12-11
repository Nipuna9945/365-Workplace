
package com.mycompany.p_001.V6;

public class NewClass_001 
{
    int x = 13;
    
    public static void main(String[] args) 
    {
        NewClass_001 myObj1 = new NewClass_001();
        NewClass_001 myObj2 = new NewClass_001();
        
        myObj2.x = 17;
        
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
