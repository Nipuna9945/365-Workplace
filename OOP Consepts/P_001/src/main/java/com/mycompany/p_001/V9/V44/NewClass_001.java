
package com.mycompany.p_001.V9.V44;

import java.util.Comparator;


class Car
    {
        public String brand;
        public String model;
        public int year;
        
        public Car(String b, String m, int y)
        {
            brand = b;
            model = m;
            year = y;
        }
    }
    
    class SortByYear implements Comparator 
    {
    public int compare(Object obj1, Object obj2) 
    {
        // Make sure that the objects are Car objects
        Car a = (Car) obj1;
        Car b = (Car) obj2;
    
        // Compare the year of both objects
        if (a.year < b.year) return -1; // The first car has a smaller year
        if (a.year > b.year) return 1;  // The first car has a larger year
        return 0; // Both cars have the same year
    }

public class NewClass_001
{
    
}
    
    
    
    public static void main(String[] args)
    {
        
    }
}
