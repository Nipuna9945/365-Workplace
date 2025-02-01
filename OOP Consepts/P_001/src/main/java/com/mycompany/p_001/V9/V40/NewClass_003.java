
package com.mycompany.p_001.V9.V40;

public class NewClass_003
{
    static void checkAge(int age)
    {
        if(age < 18)
        {
            throw new AbstractMethodError("Access denied  - You are old enough");
        }
        
        else
        {
            System.out.println("Access granted - You are old enough");
        }
    }
    
    public static void main(String[] args)
    {
        checkAge(15);
    }
}
