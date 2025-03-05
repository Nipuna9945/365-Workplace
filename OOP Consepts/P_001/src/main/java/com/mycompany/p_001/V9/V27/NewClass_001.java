
package com.mycompany.p_001.V9.V27;



abstract class Animal
{
    public abstract void animalSound();
    
    public void sleep() 
    {
        System.out.println("Zzz");
    }
}

class Cat extends Animal
{
    public void animalSound()
    {
        System.out.println("The cat says: meow meow");
    }
}


class NewClass_001
{
    public static void main(String[] args)
    {
        Cat myObj = new Cat();
        
        myObj.sleep();
        myObj.animalSound();
    }
}


//Not yet