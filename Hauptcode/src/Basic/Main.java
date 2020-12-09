package Basic;

import java.util.Scanner;

public class Main {
    public static Person[] registerdPerson = new Person[10];
    public static int personCount = 0;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Hauptmenu();
    }

    static void Hauptmenu() {
        System.out.println("Welcome to our Program");
        System.out.println("----------------------------------");
        System.out.println("Create a new Account    press 1");
        System.out.println("Show all account's      press 2");
        System.out.println("Stop the Program        press 3");
        System.out.println("---------------------------------");
        int input = scan.nextInt();

        if (input == 1) {
            Abfrage();
        } else if (input == 2) {
            System.out.println("This System is not working at the monent, sorry error M_403");
        } else if (input == 3) {
            System.exit(0);
        }

    }
    static void AlleBenutzer() {
        for (int i = 0 ; i <= personCount ; i++ ){
            //registerdPerson[i].get
        }
    }

    static void Abfrage() {
        while (true) {
            System.out.println("what's your first Name?");
            String firstName = scan.next();
            System.out.println("What's your Last Name?");
            String lastName = scan.next();
            Person newPerson = new Person();
            newPerson.setFirstName(firstName);
            newPerson.setLastName(lastName);
            System.out.println("How old are you?");
            int age = scan.nextInt();
            if (age >= 16) {
                newPerson.setAge(age);
                System.out.println("Great you are " + age + " years old.");
                System.out.println("On wich street to you live on? (Only Street name)");
                String street = scan.next();
                newPerson.setStreet(street);
                System.out.println("In wich city do you live?");
                String city = scan.next();
                newPerson.setCity(city);
                System.out.println("What's your Postal code (PLZ)");
                String PLZ = scan.next();
                newPerson.setPLZ(PLZ);
                System.out.println("Are the following information correct");
                System.out.println("Firstname = " + firstName);
                System.out.println("Lastname = " + lastName);
                System.out.println("age = " + age);
                System.out.println("Address = " + street);
                System.out.println("City = " + city);
                System.out.println("PLZ = " + PLZ);
                System.out.println(" ");
                System.out.println("y/n");
                String yes1 = scan.next();
                if (yes1.equals("y")) {
                    registerdPerson[personCount] = newPerson;
                    personCount++;
                } else if (yes1.equals("n")) {
                    System.out.println("Good luck next time");
                } else {
                    System.out.println("Unable to process Answer");
                }
                break;
            }

            Hauptmenu();
        }
    }
}