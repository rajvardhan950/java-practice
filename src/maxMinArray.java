import java.util.Scanner;

public class maxMinArray {
    public static void main(String[] args) {
        System.out.println("welcome to max and min\n");
        int[] numArray=inputArray();
        int min=min(numArray);
        int max=max(numArray);

        System.out.println("Min of the Array is :" + min);
        System.out.println("Max of the Array is :" + max);

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
    public static int min(int[] numArray){
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i < numArray.length){
            if(min > numArray[i])
                min = numArray[i];
            i++;
        }
        return min;
    }
    public static int max(int[] numArray){
        if(numArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max=numArray[0];
        int i = 0;
        while (i < numArray.length) {
            if (max < numArray[i])
                max = numArray[i];
            i++;
        }
        return max;
    }
}
