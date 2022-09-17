import java.util.Scanner;

public class SimpleMethod2 {
    static  double square(int number) {
        return number*number ;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input= scanner.nextInt();
        square(225);
        // Put the result System.out code here.
        System.out.println(square(input));
    }
}
