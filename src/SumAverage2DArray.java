import java.util.Scanner;

public class SumAverage2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average of 2D array\n");
        int[][] numArr=input2DArray();
        long sum=sum(numArr);
        double avg=average(numArr);
        System.out.println("Your sum of array is :" + sum);
        System.out.println("Your average of array is :" + avg);
    }
    public static int[][] input2DArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of rows:");
        int rows=input.nextInt();
        System.out.println("please enter the number of column:");
        int column=input.nextInt();
        int[][] numArr=new int[rows][column];

        int i=0;
        while(i<rows){
            int j=0;
            while(j<column){
                System.out.println("please enter element rows" + (i+1)+ ",column" + (j+1) +":");
                numArr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;
    }
    public static double average(int[][] numArr){
        if(numArr.length == 0){
            return 0;

        }
        int row= numArr.length;
        int cols= numArr[0].length;
        double size=row*cols;
        return sum(numArr) / size;
    }
    public static long sum(int[][] numArr){
        int sum=0;
        int i=0;
        while(i< numArr.length){
            int j=0;
            while (j< numArr[i].length){
                sum+=numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
