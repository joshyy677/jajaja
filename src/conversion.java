import java.util.Scanner;
public class conversion {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int number, choice;
        System.out.print("Enter an Integer : " );
        number = input.nextInt();
        System.out.println("\nConvert Options:");
        System.out.println("1. Binary");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        System.out.print("Enter Convert Option : ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println(number + " into Binary is "+ Integer.toBinaryString(number));
                break;
            case 2:
                System.out.println(number + "into Octal is " + Integer.toOctalString(number));
                break;
            case 3:
                System.out.println(number + " into Hexadecimal is " + Integer.toHexString(number).toUpperCase());
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
 