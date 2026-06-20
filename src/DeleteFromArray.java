import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion :");
        int[] numArray=inputArray();
        System.out.print("Now, Enter the number you want delete :");
        int numToDelete = input.nextInt();
        int[] newArr=deleteNumber(numArray, numToDelete);
        System.out.println("Here is your new array");
        displayArray(newArr);
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
    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = noofOccurences(numArr , numToDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i=0, j=0 ;
        while (i < numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
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
    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.println(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
