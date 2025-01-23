
package com.mycompany.p_001.V9.V36;

import java.util.HashMap;
import java.util.Locale;

public class NewClass_002
{
    public static void main(String[] args)
    {
        HashMap<String, String> myObj = new HashMap<>();
        
        myObj.put("Sri Lankan", "Colombo");
        myObj.put("Canada", "Toronto");
        myObj.put("USA", "Miami");
        myObj.put("Australia", "Melbone");
        
        System.out.println(myObj.get("Canada"));
    }
}
