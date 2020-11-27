package com.company;
import javax.swing.*;
import java.util.Scanner;
import java.lang.String;

public class Main {
    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {


        PersonenAbfrage();

    }


    static void PersonenAbfrage() {

        System.out.println("Wie heisen Sie zum Vorname: ");
        String vorname;
        vorname = myObj.nextLine();

        System.out.println("Wie heisen Sie zum Nachname: ");
        String nachname;
        nachname = myObj.nextLine();

        System.out.println("Wie alt sind Sie: ");
        int age;
        age = myObj.nextInt();

        if (age >= 16) {

            System.out.println("Geben Sie Ihre Addresse an format (Strasse, Nr)");
            String addresse;
            addresse = myObj.nextLine();

        }
        if (age >= 16) {
            System.out.println("Geben Sie Ihr wohnort an format (Wohnort, PLZ)");
            String wohnort;
            wohnort = myObj.nextLine();

        } else {
            System.exit(0);

        }
    }

}


