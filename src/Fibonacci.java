import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.print("Please enter the number up to which series has to be printed: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci Series");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
        if(num < 0) return;
        System.out.println("0");
        if(num == 1) return;
        System.out.println("1");

        int first=0;
        int second=1;
        while (first + second <= num){
            int third=first + second;
            System.out.println(third + " ");
            first=second;
            second=third;
        }
    }
}
