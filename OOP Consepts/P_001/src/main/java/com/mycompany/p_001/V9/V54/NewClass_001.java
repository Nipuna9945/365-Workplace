
package com.mycompany.p_001.V9.V54;

import java.util.ArrayList;

public class NewClass_001
{
    public static void main(String[] args)
    {
        ArrayList<String>cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}
