
package com.mycompany.p_001.V9.V56;

enum Level 
{
  LOW,
  MEDIUM,
  HIGH
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        for (Level myVar : Level.values()) 
        {
            System.out.println(myVar);
        }
    }
}


//not yet