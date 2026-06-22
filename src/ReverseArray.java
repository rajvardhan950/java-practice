import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal\n");
        int[] numArray=inputArray();
        reverse(numArray);
        System.out.println("your reversed array is");
        displayArray(numArray);
    }
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=input.nextInt();
        int[] nums= new int[size];

        int i=0;
        while(i<size){
            System.out.print("please enter element no " + (i+1) + " :");
            nums[i]= input.nextInt();
            i++;
        }return nums;
    }
    public static void reverse(int[] numArray) {
        int i = 0;
        while (i < (numArray.length) / 2) {
            int swap = numArray[i];
            numArray[i] = numArray[(numArray.length - 1) - i];
            numArray[(numArray.length) - 1 - i] = swap;
            i++;
        }
    }
    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.println(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
