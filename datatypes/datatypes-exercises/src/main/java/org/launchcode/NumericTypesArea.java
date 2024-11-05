package org.launchcode;
import java.util.Scanner;

public class NumericTypesArea {
    public static void main(String[] args) {
        //Create a scanner object to handle user input
        Scanner scanner = new Scanner(System.in);
        //Prompt the user for the length
        System.out.println("Enter the length of the rectangle: ");
        //Use double for dimensions
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        //Calculate the area of the rectangle
        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);
    }
}
