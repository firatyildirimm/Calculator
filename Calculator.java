import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        //
        System.out.println("1-Addition \n2-Subtraction \n3-Multiplication \n4-Division");
        System.out.print("Selection: ");
        int select = input.nextInt();
        switch (select){
            case 1:
                System.out.println("Addition = "+(first+second));
                break;

            case 2:
                System.out.println("Subtraction = "+(first-second));
                break;

            case 3:
                System.out.println("Multiplication = "+(first*second));
                break;

            case 4:
                if (second==0)
                    System.out.println("You can't division by 0");
                else
                System.out.println("Division = "+(first/second));
                break;
        }

    }
}
