
package com.mycompany.p_001.V8;


public class NewClass_001 
{
    static void myStaticMethod()
    {
        System.out.println("Hello this is the static one");
    }
    
    public void myPublicMethod()
    {
        System.out.println("Hello this is the public one");
    }
    
    
    public static void main(String[] args) 
    {
        myStaticMethod();
        
        NewClass_001 myObj = new NewClass_001();
        myObj.myPublicMethod();
    }
}
