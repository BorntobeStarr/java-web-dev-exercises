package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius:");
//        String userInput = input.nextLine();
        double radius = getGoodInput(input);
//        double pi = 3.14;
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle radius " + radius + " is: " + area);

    }
    public static double getGoodInput(Scanner input){
     Boolean inputIsGood = false;

        while(!inputIsGood) {
            if (!input.hasNextDouble()){
                System.out.println(("Please input a double"));
                input.next();
            } else {
                Double userInput = input.nextDouble();
                if (userInput <0){
                    System.out.println(("Please input a positive number"));
                } else {
                    return userInput;
                }
            }
        }
        return 0;
    }
}
