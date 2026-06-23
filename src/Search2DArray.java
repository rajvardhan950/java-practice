import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome 2D search");
        int[][] newArr = input2DArray();
        System.out.println("Now enter the number you want to search:");
        int num= input.nextInt();
        boolean isFound=search(newArr,num);
        if(isFound){
            System.out.println("Your number is found");
        }else{
            System.out.println("Your number is not found ");
        }
    }
    public static int[][] input2DArray(){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of rows:");
        int rows=input.nextInt();
        System.out.println("please enter the number of column:");
        int column=input.nextInt();
        int[][] newArr=new int[rows][column];

        int i=0;
        while(i<rows){
            int j=0;
            while(j<column){
                System.out.println("please enter element rows" + (i+1)+ ",column" + (j+1) +":");
                newArr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return newArr;
    }
    public static boolean search(int[][]newArr,int num){
        int i=0;
        while (i< newArr.length){
            int j=0;
            while(j< newArr[i].length){
                if(newArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
