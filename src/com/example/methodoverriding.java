package com.example;

public class methodoverriding {

    void run(){System.out.println("Vehicle is running");}
    }
    //Creating a child class
    class Bike extends methodoverriding {
        public static void main(String args[]){
            //creating an instance of child class
            Bike obj = new Bike();
            //calling the method with child class instance
            obj.run();
        }

}