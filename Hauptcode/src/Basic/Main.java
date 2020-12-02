package Basic;
import java.util.Scanner;


public class Main {
    public static Person[] registerdPerson = new Person[10];
    public static int personCount = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person newPerson2 = new Person();
        newPerson2.setFirstName("William");

        // static void Hauptmenue() {
        System.out.println("1. Create a new Account");
        System.out.println("2. Show all account's");
        System.out.println("3. Stop the Programm");
        int input = scan.nextInt();
        /*
        Mein vorschlag:

        if (input == 2) {
            (Code)
         }

        if (input == 3) {
            System.exit(0);
         }

         */



        // static void Abfrage() {
        while (true)
        if (input == 1) {
            System.out.println("what's your first Name?");
            String firstName = scan.next();
            System.out.println("What's your Last Name?");
            String lastName = scan.next();
            System.out.println("Is your Name" + firstName + " " + lastName + "?");
            System.out.println("y/n");
            String yes = scan.next();
            if (yes.equals("y")) {
                Person newPerson = new Person();
                newPerson.setFirstName(firstName);
                newPerson.setLastName(lastName);
                System.out.println("What's your age?");
                int age = scan.nextInt();
                if (age >= 16) {
                    newPerson.setAge(age);
                    System.out.println("Great you are " + age);
                    System.out.println("On wich street to you live?");
                    String street = scan.next();
                    newPerson.setStreet(street);
                    System.out.println("In wich city?");
                    String city = scan.next();
                    newPerson.setCity(city);
                    System.out.println("What's your PLZ");
                    String PLZ = scan.next();
                    System.out.println("");

                }
                registerdPerson[personCount] = newPerson;
                personCount++;
            }
            else if (yes.equals("n")) {
                System.out.println("Good luck next time");
            }
            else {
                System.out.println("Unable to process Answer");
            }
            break;
        }
    }
}
