import java.util.Scanner;

public class IT24102607Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int members;
        
        System.out.print("Enter the number of new members introduced: ");
        members = input.nextInt();

        
        if (members < 0) {
            System.out.println("Invalid input! The number must be 0 or greater.");
            return;
        }

        
        String prize;
        switch (members) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }

       
        System.out.println("Prize is: " + prize);
    }
}