import java.util.Scanner;
public class grade {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        double average, prelim, midterm, finals;
        String name, course, section;

        System.out.print("Enter Student Name: ");
        name = input.nextLine();
        System.out.print("Enter Student Course: ");
        course = input.nextLine();
        System.out.print("Enter Student Section: ");
        section = input.nextLine();
        System.out.print("Enter Prelim Grade: ");
        prelim = input.nextDouble();
        System.out.print("Enter Midterm Grade: ");
        midterm = input.nextDouble();
        System.out.print("Enter Finals Grade: ");
        finals = input.nextDouble();


        average = (prelim + midterm + finals) /3;

        System.out.println("\nname : " + name);
        System.out.println("course : " + course);
        System.out.println("section : " + section);
        System.out.println("average : " + average);

    }
}