
package com.mycompany.p_001.V9.V43;

import java.util.ArrayList;
import java.util.function.Consumer;

public class NewClass_002
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> {System.out.println(n); };
        
        numbers.forEach(method);
    }
}


//done