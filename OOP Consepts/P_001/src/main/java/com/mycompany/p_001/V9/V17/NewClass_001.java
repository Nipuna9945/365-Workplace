
package com.mycompany.p_001.V9.V17;

class NewClass_002 
{
    protected String fName = "Nipuna";
    protected String lName = "Randeer";
    protected int age = 25;
}

class NewClass_001 extends NewClass_002 
{
    private int graduationYear = 2024;
    
    public static void main(String[] args) 
    {
        NewClass_001 myObj = new NewClass_001();
        
        System.out.println("Full name is " + myObj.fName + " " + myObj.lName);
        System.out.println("Age is " + myObj.age);
        System.out.println("Graduation Year is " + myObj.graduationYear); 
    }
}
