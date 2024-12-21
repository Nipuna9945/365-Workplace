
package com.mycompany.p_001.V9.V20;

abstract class NewClass_001 
{
    public String Fname = "Nipuna";
    public int age = 25;
    
    public abstract void Study();
}

class Student extends NewClass_001
{
    public int graduationYear = 2025;
    
    public void Study()
    {
        System.out.println("Studying all day long");
    }
}
