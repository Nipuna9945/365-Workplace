
package com.mycompany.p_001.V9.V38;

import java.util.ArrayList;
import java.util.Iterator;

public class NewClass_003
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myObj = new ArrayList<>();
        
        myObj.add(12);
        myObj.add(8);
        myObj.add(2);
        myObj.add(23);
        
        Iterator<Integer> it = myObj.iterator();
        
        while (it.hasNext())
        {
            Integer i = it.next();
            if (i < 10)
            {
                it.remove();
            }
        }
        
        System.out.println(myObj);
    }
}
