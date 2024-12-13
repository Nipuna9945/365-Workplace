
package com.mycompany.p_001.V8;


public class NewClass_001 
{
    static void myStaticMethod()
    {
        System.out.println("Hello this is the static one");     // You dont need to make a object to call this static method
    }
    
    public void myPublicMethod()
    {
        System.out.println("Hello this is the public one");     // You have to make a object to call this public method
    }
    
    
    public static void main(String[] args) 
    {
        myStaticMethod();       // Call the ststic methos
        
        NewClass_001 myObj = new NewClass_001();        // Make an object and call the public method
        myObj.myPublicMethod();
    }
}
