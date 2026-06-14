import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome multiplication world");
        System.out.print("please enter your number");
        int num = input.nextInt();
        printmultiplicationtable(num);
    }
        public static void printmultiplicationtable(int num){
            int i=0;
            while(i <= 10){
                int sum=num*i;
                System.out.println(num + "X" + i + "=" + (sum));
                i++;
            }
        }
    }

