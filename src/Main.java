import java.util.Scanner;
public class Main {
    public static void main( String[] args ){
        String firstInitial, lastName, streetName,streetType,city;
        int houseNumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first initial: ");
        firstInitial = keyboard.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = keyboard.nextLine();
        System.out.println("Please enter your street name: ");
        streetName=keyboard.nextLine();
        System.out.println("Please enter your street type: ");
        streetType=keyboard.nextLine();
        System.out.println("Please enter your city: ");
        city=keyboard.nextLine();
        System.out.println("Please enter your house number: ");
        houseNumber=keyboard.nextInt();


        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
