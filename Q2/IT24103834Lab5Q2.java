import java.util.Scanner;

public class IT24103834Lab5Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int newMembers;
        
        System.out.println("Enter the Number of New Members Introduced: ");
        newMembers = input.nextInt();

        if (newMembers < 0) {
            System.out.println("Invalid Input");
            }
            else {
                switch (newMembers) {
                    case 0:
                        System.out.println("No Prize");
                        break;
                    case 1:
                        System.out.println("You got a Pen");
                        break;
                    case 2:
                        System.out.println("You got an Umbrella");
                        break;
                    case 3:
                        System.out.println("You got a Bag");
                        break;
                    case 4:
                        System.out.println("You got a Travelling Bag");
                        break;
                    default:
                        System.out.println("You got a Headphone");
            }
         }
        input.close();
    }
}