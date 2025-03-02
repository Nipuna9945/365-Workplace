
package com.mycompany.p_001.V9.V33;

import java.util.ArrayList;
import java.util.Collections;

public class NewClass_009
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("GT3RS");
        cars.add("BMW");
        cars.add("AMG");
        cars.add("GMC");
        
        Collections.sort(cars);
        
        for(String i : cars)
        {
            System.out.println(i);
        }
    }
}


//Not yet