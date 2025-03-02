
package com.mycompany.p_001.V9.V33;

import java.util.ArrayList;

public class NewClass_003
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("GT3RS");
        cars.add("BMW");
        cars.add("AMG");
        cars.add("GMC");
        
        cars.set(0, "Mustang");
        
        System.out.println(cars);
    }
}


//Not yet