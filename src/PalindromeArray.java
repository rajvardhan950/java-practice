import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome checker\n");
        int[] numArray=inputArray();
        boolean isPalin = isPalindrome(numArray);
        if(isPalin){
            System.out.println("your array is palindrome");
        }else{
            System.out.println("your array is not palindrome");
        }
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
    public static boolean isPalindrome(int[] numArray){
        int i=0;
        while(i < (numArray.length/2)){
            if(numArray[i] != numArray[(numArray.length) -1 -i]) {
                return false;
            }i++;
        }
        return true ;
    }
}
