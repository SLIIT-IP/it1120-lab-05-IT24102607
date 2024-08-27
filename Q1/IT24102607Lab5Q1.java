import java.util.Scanner;

public class IT24102607Lab5Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, smallest, largest;
        
        System.out.print("Enter the first integer: ");
        num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        num2 = input.nextInt();
        System.out.print("Enter the third integer: ");
        num3 = input.nextInt();

        smallest = Math.min(num1, Math.min(num2, num3));
        largest = Math.max(num1, Math.max(num2, num3));
        
        System.out.println("\nUser entered numbers are: " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
    }
}

       
 