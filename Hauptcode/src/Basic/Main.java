package Basic;
import java.util.Scanner;


public class Main {
    public static Person[] registerdPerson = new Person[10];
    public static int personCount = 0;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Person newPerson2 = new Person();
        newPerson2.setFirstName("William");

        Hauptmenue();
    }

    static void Hauptmenue() {
        System.out.println("Welcome to are Program");
        System.out.println("----------------------------------");
        System.out.println("Create a new Account, press 1");
        System.out.println("Show all account's, press 2");
        System.out.println("Stop the Program, press 3");
        System.out.println("---------------------------------");
        int input = scan.nextInt();

        if (input == 1) {
            Abfrage();
        }

        if (input == 2) {
            System.out.println("This System is not working at the monent, sorry error M_403");
        } else if (input == 3) {
            System.exit(0);
        }

    }



    static void Abfrage() {
        while (true) {
            System.out.println("what's your first Name?");
            String firstName = scan.next();
            System.out.println("What's your Last Name?");
            String lastName = scan.next();
            System.out.println("Is your Name" + "" + firstName + " " + lastName + "?");
            System.out.println("y/n");
            String yes = scan.next();
            if (yes.equals("y")) {
                Person newPerson = new Person();
                newPerson.setFirstName(firstName);
                newPerson.setLastName(lastName);
                System.out.println("How old are you?");
                int age = scan.nextInt();
                if (age >= 16) {
                    newPerson.setAge(age);
                    System.out.println("Great you are " + age + "years old.");
                    System.out.println("On witch street to you live on? (Only Street name)");
                    String street = scan.next();
                    newPerson.setStreet(street);
                    System.out.println("In witch city do you live?");
                    String city = scan.next();
                    newPerson.setCity(city);
                    System.out.println("What's your Postal code (PLZ)");
                    String PLZ = scan.next();
                    System.out.println("");

                }
                registerdPerson[personCount] = newPerson;
                personCount++;
            } else if (yes.equals("n")) {
                System.out.println("Good luck next time");
            } else {
                System.out.println("Unable to process Answer");
            }
            break;
        }

        Hauptmenue();
    }
}