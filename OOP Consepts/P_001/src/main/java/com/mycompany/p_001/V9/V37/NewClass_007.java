
package com.mycompany.p_001.V9.V37;

import java.util.HashSet;

public class NewClass_007
{
    public static void main(String[] args)
    {
        HashSet<Integer> myObj = new HashSet<>();
        
        myObj.add(6);
        myObj.add(4);
        myObj.add(9);
        myObj.add(1);
        
        for (int i = 1; i <= 10; i++)
        {
            if(myObj.contains(i))
            {
                System.out.println(i + " This numbers is in list");
            }
            
            else
            {
                System.out.println(i + " This numbers is not in list");
            }
        }
    }
}
