
package com.mycompany.p_001.V9.V33;

import java.util.ArrayList;

public class NewClass_004
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("GT3RS");
        cars.add("BMW");
        cars.add("AMG");
        cars.add("GMC");
        
        cars.remove(0);
        
        System.out.println(cars);
    }
}
