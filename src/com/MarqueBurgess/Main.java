package com.MarqueBurgess;

public class Main {

    public static void main(String[] args) {
	// Simple fizz buzz example

        for(int i = 1; i <=100; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is a fizzBuzz");
            }

            else if(i % 3 == 0){
                System.out.println(i + " is a fizz");
            }

            else if(i % 5 == 0){
                System.out.println(i + " is a Buzz");
            }

            else{
                System.out.println(i + " basic number");
            }
            
        }

    }
}
