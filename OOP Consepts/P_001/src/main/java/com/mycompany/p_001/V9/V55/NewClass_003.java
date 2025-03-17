
package com.mycompany.p_001.V9.V55;

import java.util.HashMap;

public class NewClass_003
{
    public class Main 
    {
        public static void main(String[] args) 
        {
        
            HashMap<String, String> capitalCities = new HashMap<String, String>();
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
    
            for (String i : capitalCities.keySet()) 
            {
                System.out.println("key: " + i + " value: " + capitalCities.get(i));
            }
        }
    }
}


// Done