
package com.mycompany.p_001.V9.V54;

import java.util.HashMap;

public class NewClass_002
{
    public static void main(String[] args)
    {
        HashMap <String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        for (String i : capitalCities.values())
        {
            System.out.println(i);
        }
    }
}
