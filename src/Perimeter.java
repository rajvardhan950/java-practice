import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Perimeter Calculator: ");
        System.out.print("Please enter all 4 sides in cms: ");
        double A= input.nextDouble();
        double B= input.nextDouble();
        double C= input.nextDouble();
        double D= input.nextDouble();

        double perimeter = A + B + C + D;
        System.out.println("Perimeter of your rectangle is: " + perimeter + "cm");
    }
}
