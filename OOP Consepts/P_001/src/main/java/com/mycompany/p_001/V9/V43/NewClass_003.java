
package com.mycompany.p_001.V9.V43;

interface StringFunction 
{
  String run(String str);
}

public class NewClass_003
{
    public static void main(String[] args)
    {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
    }
}
