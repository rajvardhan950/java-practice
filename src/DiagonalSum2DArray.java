import java.util.Scanner;

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of diagonal 2D array");
        int[][] numArr=input2DArray();
        long sum=sumOfDiagonals(numArr);
        System.out.println("Sum of diagonals is \n" + ":" + sum);
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
    public static long sumOfDiagonals(int[][] numArr){
        long rightSum =sumOfRightDiagonal(numArr);
        long leftSum =sumOfLeftDiagonal(numArr);
        long sum = rightSum + leftSum;
        if(numArr.length % 2 != 0){
            int ind = numArr.length / 2;
            sum = sum - numArr[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while (i< numArr.length){
            sum+=numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while (i< numArr.length){
            int col= numArr.length -1 -i;
            sum+=numArr[i][col];
            i++;
        }
        return sum;
    }
}
