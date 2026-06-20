import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting check post: ");
        int[] numArray=inputArray();
        boolean isInc=isIncreasing(numArray);
        boolean isDec=isDecreasing(numArray);
        if( isInc || isDec ) {
            System.out.println("your array is sorted");
        }else{
            System.out.println("your array is not sorted");
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
    public static boolean isIncreasing(int[] numArray){
        int i=1;
        while(i < numArray.length){
            if(numArray[i] < numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] numArray){
        int i=1;
        while(i < numArray.length){
            if(numArray[i] > numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
