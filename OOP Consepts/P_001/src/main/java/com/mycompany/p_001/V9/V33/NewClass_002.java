
package com.mycompany.p_001.V9.V33;

import java.util.ArrayList;

public class NewClass_002
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("BMW");
        cars.add("AMG");
        cars.add("GMC");
        
        cars.add(0, "GT3RS");
        
        System.out.println(cars);
    }
}


//Not yet