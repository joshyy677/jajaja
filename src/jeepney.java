import java.util.Scanner;
public class jeepney {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, fare, discount, amountPaid, payment, change;

        System.out.print("Enter km: ");
        km = input.nextDouble();

        fare = 12 + ((km - 4) * 2);

        System.out.println("Total fare: " + fare);

        System.out.print("Enter discount (%): ");
        discount = input.nextDouble();

        amountPaid = fare - (fare * discount / 100);

        System.out.println("Amount to pay: " + amountPaid);

        System.out.print("Enter payment: ");
        payment = input.nextDouble();

        change = payment - amountPaid;

        System.out.println("Change: " + change);
    }
}