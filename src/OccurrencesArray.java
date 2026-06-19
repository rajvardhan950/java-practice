import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurrence/n");
        int[] numArray=inputArray();
        System.out.println("Now enter the number you want to find :");
        int nums= input.nextInt();
        int occurences=noofOccurences(numArray,nums);
        System.out.println("Your element was found :" + occurences + "times in the array");

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
    public static int noofOccurences(int[] numArray,int nums){
        int occ=0;
        int i=0;
        while (i< numArray.length){
            if(numArray[i] == nums){
                occ++;
            }i++;
        }
        return occ;
    }
}
