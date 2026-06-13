import com.sun.nio.sctp.SctpSocketOption;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = input.nextInt();
        System.out.println("Enter Second Number");
        int b = input.nextInt();
        int sum=a + b;
        System.out.println("The Sum Of These Number");
        System.out.println(sum);
    }
}
