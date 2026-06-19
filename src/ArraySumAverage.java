import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome the array sum and average");
        int[] numArray= inputArray();
        long sum=sum(numArray);
        double avg=average(numArray);
        System.out.println("Sum of the numbers is :" + sum);
        System.out.println("Average of the numbers is :" + avg);

    }
    public static int[] inputArray(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=input.nextInt();

        int[] nums= new int[size];

        int i=0;
        while(i<size){
            System.out.print("please enter element no " + (i+1 + " :"));
            nums[i]= input.nextInt();
            i++;
        }return nums;
    }
    public static long sum(int[] numArray){
        long sum=0;
        int i=0;
        while(i < numArray.length){
            sum=sum + numArray[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] numArray){
        double sum=sum(numArray);
        return (sum/ numArray.length);
    }
}
