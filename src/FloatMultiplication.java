import java.util.Scanner;

public class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.println("Please enter first decimal number: ");
        double A = input.nextDouble();
        System.out.println("Please enter Second decimal number: ");
        double B = input.nextDouble();
        double product=A*B;
        System.out.println("\n Result is: " + product);
    }
}
