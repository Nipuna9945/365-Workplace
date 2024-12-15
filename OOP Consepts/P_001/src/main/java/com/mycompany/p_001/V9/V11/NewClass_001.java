
package com.mycompany.p_001.V9.V11;


public class NewClass_001 
{
    int x;
    
    public NewClass_001()       // This is java constructor, make a method with the same name with the class. SO we dont need to call it will automatically run
    {
        x = 555;
    }
    
    public static void main(String[] args) 
    {
        NewClass_001 myObj = new NewClass_001();        // make a obj and access the value
        
        System.out.println(myObj.x);
    }
}
