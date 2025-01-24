
package com.mycompany.p_001.V9.V36;

import java.util.HashMap;

public class NewClass_009
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> myObj = new HashMap<>();
        
        myObj.put("Kamal", 28);
        myObj.put("Sunimal", 23);
        myObj.put("Ravidu", 18);
        myObj.put("John", 20);
        myObj.put("Keshan", 25);
        
        for(String i : myObj.keySet())
        {
            System.out.println("Name: " + myObj + " Age: " + myObj.values());
        }
    }
}
