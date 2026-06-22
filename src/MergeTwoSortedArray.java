import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to merging sorted array:");
        int[] arr1=inputArray();
        int[] arr2=inputArray();
        int[] mergedArr=merge(arr1,arr2);
        System.out.print("Your merged array is :");
        displayArray(mergedArr);

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
    public static int[] merge(int[] arr1, int[] arr2){
        int newSize=arr1.length + arr2.length;
        int[] newArray=new int[newSize];
        int i=0,j=0,k=0;
        while (i<arr1.length || j<arr2.length){
            if( j== arr2.length ||
                    (i< arr1.length && arr1[i]<arr2[j])){
                newArray[k]=arr1[i];
                i++;
                k++;
            }else{
                newArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        return newArray;
    }
    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}
