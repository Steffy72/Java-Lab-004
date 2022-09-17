 import java.util.Scanner;

public class Radians {

    public static double toRadians(double degrees) {
        double radians = degrees * (3.141592 / 180);
        return radians;
    }


    public static void toDegrees(double radians) {
        double degrees = radians * (180 / 3.141592);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.parseDouble(scanner.nextLine());

        System.out.println(toRadians(degrees));
        System.out.println(Math.toRadians(degrees));


        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.parseDouble(scanner.nextLine());
        System.out.println(toDegrees(radians));
        System.out.println(Math.toDegrees(radians));

        // Add System.out, your method call, and Math.toDegrees call here
    }
}
