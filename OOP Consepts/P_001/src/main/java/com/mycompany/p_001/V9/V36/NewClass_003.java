
package com.mycompany.p_001.V9.V36;

import java.util.HashMap;

public class NewClass_003
{
    public static void main(String[] args)
    {
        HashMap<String, String> myObj = new HashMap<>();
        
        myObj.put("Sri Lankan", "Colombo");
        myObj.put("Canada", "Toronto");
        myObj.put("USA", "Miami");
        myObj.put("Australia", "Melbone");
        myObj.put("Norway", "Oslo");
        
        myObj.remove("USA");
        System.out.println(myObj);    
    }
}
