import java.util.Scanner;

public class IT24103834Lab5Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, smallest, largest;
        
        System.out.println("Enter the First Integer: ");
        num1 = input.nextInt();

        System.out.println("Enter the Second Integer: ");
        num2 = input.nextInt();

        System.out.println("Enter the Third Integer: ");
        num3 = input.nextInt();

        System.out.println("User Entered Numbers are: "+ num1 + num2 + num3);

        smallest = (num1 < num2)? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        largest = (num1 > num2)? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

        System.out.println("The Smallest Number is: " + smallest);
        System.out.println("The Largest Number is: " + largest);

        input.close();
    }
}