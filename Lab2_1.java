import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //create scanner
        System.out.print("Enter the x coordinate of point 1: "); //prompt user for x value
        double x1 = input.nextDouble(); //store number
        System.out.print("Enter the y coordinate of point 1: "); //prompt user for y value
        double y1 = input.nextDouble(); //store number
        System.out.print("Enter the z coordinate of point 1: "); //prompt user for z value
        double z1 = input.nextDouble(); //store number

        System.out.print("Enter the x coordinate of point 2: "); //prompt user for x value
        double x2 = input.nextDouble(); //store number
        System.out.print("Enter the y coordinate of point 2: "); //prompt user for y value
        double y2 = input.nextDouble(); //store number
        System.out.print("Enter the z coordinate of point 2: "); //prompt user for z value
        double z2 = input.nextDouble(); //store number

        double x = (x1-x2)*(x1-x2); //find x coordinate squared
        double y = (y1-y2)*(y1-y2); //find y coordinate squared
        double z = (z1-z2)*(z1-z2); //find z coordinate squared


        double distance = Math.sqrt( (x + y + z) ); //calculate distance between point1 and point2

        System.out.println("The distance between point 1 and point 2 is: " + distance); //display distance
        System.out.println("The integer part of the distance is: " + ((int)distance) ); //display integer of distance
        double fractionalDistance = distance - ((int)distance); //calculate decimal of distance
        System.out.println("The fractional part of the distance is: " + fractionalDistance); //display decimal of distance
    }
}
