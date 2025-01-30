
package com.mycompany.p_001.V9.V39;

import java.util.ArrayList;

public class NewClass_001
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myObj = new ArrayList<>();
        
        myObj.add(10);
        myObj.add(15);
        myObj.add(20);
        myObj.add(25);
        
        for (Integer i : myObj)
        {
            System.out.println(i);
        }
    }
}
