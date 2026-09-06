import java.util.Scanner;
public class sariSari{
    public static void main() {
        Scanner input = new Scanner(System.in);
        int noodles = 12;
        int rice = 50;
        int softdrink = 20;
        int noodlesQ, riceQ, softdrinkQ;
        double total, payment = 0, change, priceN;

        System.out.println("Price of food ");
        System.out.println("Noodles : " + noodles);
        System.out.println("Rice : " + rice);
        System.out.println("SoftDrink : " + softdrink);

        System.out.print("\namount of noodles to buy  : ");
        noodlesQ = input.nextInt();
        System.out.print("amount of rice to buy : ");
        riceQ = input.nextInt();
        System.out.print("amount of softdrink to buy : ");
        softdrinkQ = input.nextInt();

        System.out.println("\nQuantity + price of noodles : " + noodlesQ + ", "+ (noodles*noodlesQ));
        System.out.println("Quantity + price of rice : " + riceQ+ ", "+ (rice*riceQ));
        System.out.println("Quantity + price of softdrinks : " + softdrinkQ + ", "+ (softdrink*softdrinkQ));

        total = (noodles*noodlesQ) + (softdrink*softdrinkQ) + (rice*riceQ);
        System.out.println("\nTotal Price : " + total);

        System.out.print("Enter Payment : ");
        payment = input.nextDouble();
        change = payment - total;
        System.out.println("Change : " + change);

    }
}