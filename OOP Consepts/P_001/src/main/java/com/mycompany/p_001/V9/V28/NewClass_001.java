
package com.mycompany.p_001.V9.V28;



interface FirstInterface 
{
    public void myMethod_001();
}

interface SecondInterface
{
    public void myMethod_001();
}


class DemoClass implements FirstInterface, SecondInterface
{
    public void myMethod_001()
    {
        System.out.println("Hello world");
    }
    
    public void myMethod_002()
    {
        System.out.println("Chase dreams");
    }
}

public class NewClass_001
{
    public static void main(String[] args)
    {
        
    }
}
