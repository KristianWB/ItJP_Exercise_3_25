import java.util.Scanner;

public class IntersectingPoints {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // prompting the user for inputs
        System.out.print(
                "Enter the coordinates for the 4 points\n"
        );
        System.out.print(
                "x1: "
        );
        double x1 = input.nextDouble();

        System.out.print(
                "y1: "
        );
        double y1 = input.nextDouble();
        System.out.print(
                "x2: "
        );
        double x2 = input.nextDouble();
        System.out.print(
                "y2: "
        );
        double y2 = input.nextDouble();
        System.out.print(
                "x3: "
        );
        double x3 = input.nextDouble();
        System.out.print(
                "y3: "
        );
        double y3 = input.nextDouble();
        System.out.print(
                "x4: "
        );
        double x4 = input.nextDouble();
        System.out.print(
                "y4: "
        );
        double y4 = input.nextDouble();


        // calculating the essential variables
        double a = y1-y2;
        double b = x1-x2;
        double e = (y1-y2) * x1 - (x1-x2) * y1;

        double c = y3-y4;
        double d = x3-x4;
        double f = (y3-y4) * x3 - (x3-x4) * y3;

        // calculating the intersection point
        double x = (e * d - b * f) / (a * d - b * c); // Declaring and assigning the variable x by calculation
        double y = (a * f - e * c) / (a * d - b * c); // Decalaring and assigning the variable y by calculation

        // 2) Displaying the values for x and y
        System.out.print(
                "x is: " + x + "\n y is: " + y
        );
    }
}
