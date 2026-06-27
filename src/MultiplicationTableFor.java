import java.util.Scanner;

public class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing table");
        System.out.println("Please enter the number you want to print table: ");
        int num= input.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}
