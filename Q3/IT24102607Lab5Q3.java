import java.util.Scanner;

public class IT24102607Lab5Q3 {
    
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final int DISCOUNT_3_TO_4_DAYS = 10;
    static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner  = new Scanner(System.in);

        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();
        

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31");
            return;
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than End Date");
            return;
        }

        
        int daysReserved = endDate - startDate;

        
        int discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate the total amount to be paid
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        totalAmount -= totalAmount * discountRate / 100;

        
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}