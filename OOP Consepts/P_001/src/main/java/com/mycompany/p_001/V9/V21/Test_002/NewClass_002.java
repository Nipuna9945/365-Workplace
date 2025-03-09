
package com.mycompany.p_001.V9.V21.Test_002;

public class NewClass_002 
{
    public static void main(String[] args) 
    {
        NewClass_001 myObj = new NewClass_001();
        
        myObj.setfName("Nipuna");
        myObj.setlName("Randeer");
        myObj.setAge(25);
        myObj.setHomeTown("Gampaha");
        
        System.out.println("Hey I`m " + myObj.getfName() + " " + myObj.getlName() + ". I`m " + myObj.getAge() + " years old. " + "I`m from " + myObj.getHomeTown() + ".");
    }
}

//Not yet