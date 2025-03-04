
package com.mycompany.p_001.V9.V31;

import java.util.Scanner;

public class NewClass_001
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter name, age, salary : ");
        
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Salary is " + salary);
    }
}

//Not yet