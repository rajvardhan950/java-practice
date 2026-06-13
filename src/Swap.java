import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("welcme to swapping of two numbers: ");
        Scanner input=new Scanner(System.in);
        System.out.println("enter value of A: ");
        int A= input.nextInt();
        System.out.println("enter value of B: ");
        int B= input.nextInt();
        int temp=A;
        A=B;
        B=temp;
        System.out.println("Swapping Done: ");
        System.out.println("Value of A is=" + A);
        System.out.println("Value of B is=" + B);

    }
}
