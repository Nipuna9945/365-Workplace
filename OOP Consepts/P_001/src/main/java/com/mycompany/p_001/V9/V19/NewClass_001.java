
package com.mycompany.p_001.V9.V19;

public class NewClass_001 
{
    static void myStaticMethod()
    {
        System.out.println("This is my static method");
    }
    
    public void myPublicMethiod()
    {
        System.out.println("This isn my public method");
    }
    
    public static void main(String[] args) 
    {
        myStaticMethod();
        
        NewClass_001 myObj = new NewClass_001();
        myObj.myPublicMethiod();
    }
}
