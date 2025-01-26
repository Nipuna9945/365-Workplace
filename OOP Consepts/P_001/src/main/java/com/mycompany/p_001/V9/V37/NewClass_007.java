
package com.mycompany.p_001.V9.V37;

import java.util.HashSet;

public class NewClass_007
{
    public static void main(String[] args)
    {
        HashSet<Integer> myObj = new HashSet<>();
        
        myObj.add(6);
        myObj.add(3);
        myObj.add(9);
        
        for (int i = 1; i <= 10; i++)
        {
            if (myObj.contains(i))
            {
                System.out.println(i + "was found in the set");
            } 
            
            else
            {
                System.out.println(i + "was not found in the set");
            }
        } 
    }
}
