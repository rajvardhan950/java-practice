import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        System.out.println("welcome to Arithmetic calculator\n: ");
        Scanner input=new Scanner(System.in);
        System.out.println("enter value of A: ");
        int A= input.nextInt();
        System.out.println("enter value of B: ");
        int B= input.nextInt();
        int add = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int mod = A % B;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Division is: " + div);
        System.out.println("Modulus is: " + mod);
    }
}
