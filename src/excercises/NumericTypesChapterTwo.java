package excercises;
import java.util.Scanner;

public class NumericTypesChapterTwo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length of rectangle:");
        Double rectangleLength = input.nextDouble();

        System.out.println("Enter Width of rectangle:");
        Double rectangleWidth = input.nextDouble();

        double rectangleArea = rectangleLength * rectangleWidth;

        System.out.println("Area = Length * Width. The area of your rectangle is " + rectangleLength + " * " + rectangleWidth + " = " + rectangleArea);

        //Miles per Gallon Called Below
        double mpg = milesPerGallon(input);

    }
    public static double milesPerGallon (Scanner input) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven for the trip: ");
        Double milesDriven = input.nextDouble();

        System.out.println("Please enter the total gallons of gas you used for the trip: ");
        Double gallonsUsed = input.nextDouble();

        double milesPerGallon = milesDriven / gallonsUsed;

        System.out.println("MPG = miles driven / gallons used. The MPG from your last trip is " + milesDriven + " / " + gallonsUsed + " = " + milesPerGallon);
        return milesPerGallon;
    }

}
