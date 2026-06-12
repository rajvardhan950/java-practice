import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Welcome " + name + " to coding world" );
    }
}
