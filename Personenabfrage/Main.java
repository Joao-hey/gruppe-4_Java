package com.company;
package ch.csbe.Modul403.Codeproject;
import javax.swing.*;
import java.util.Scanner;
import java.lang.String;


public class Main {
    public static Person[] registerdPerson = new Person[10];
    static Scanner myObj = new Scanner(System.in);
    Person newPerson = new Person();


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

            System.out.println("Geben Sie Ihre Addresse an format (Strasse)");
            String addresse;
            addresse = myObj.nextLine();

            System.out.println("Geben Sie Ihr postleitzahl an format (PLZ)");
            int plz;
            plz = myObj.nextLine();

            System.out.println("Geben Sie Ihr Wohnort an format (Wohnort)");
            String city;
            city = myObj.nextLine();

        } else {
            System.exit(0);

        }
    }

}


