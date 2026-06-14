import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number to check even or odd: ");
        System.out.println("please enter a first number:");
        int num=input.nextInt();

        if(num%2 == 0){
            System.out.println("Given number even: ");
        }else{
            System.out.println("Given number odd: ");
        }
    }
}
