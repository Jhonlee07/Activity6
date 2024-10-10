import java.util.Scanner;
public class Activity6 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:  ");
        String fullname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int jlg_age = scanner.nextInt();

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your Gender (M for male): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Are you married? (true/false):");
        boolean IsMarried = scanner.nextBoolean();


    System.out.println("Your name is: " + fullname);
    System.out.println("Your age is: " + jlg_age);
    System.out.println("Your height is: " + height);
    System.out.println("Your gender is: " + gender);
    System.out.println("IsMarried: " + IsMarried);

    scanner.close();
    }
}