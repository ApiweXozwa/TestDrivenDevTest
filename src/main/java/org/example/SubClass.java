package org.example;

public class SubClass{
    String firstName;
    String lastName;
    int number;

    public SubClass(String firstName, String lastName, int number){
        System.out.println("Constructing SubClass");
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    public abstract class User{
        public abstract  void child();
    }

    public void sound(){
        System.out.println("Sisonke");
    }

}
