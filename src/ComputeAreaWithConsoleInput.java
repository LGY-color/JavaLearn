import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/21.
 */
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        //prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        //compute area
        double area = radius * radius * 3.14159;
        //display results
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
