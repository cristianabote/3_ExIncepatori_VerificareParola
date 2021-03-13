package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// scrie un program care contine o metoda avand ca functie verificarea unei parole(un sir de caractere introdus)
        //parola trebuie sa fie compusa doar din litere si cifre, are min 8 aractere max 32, are cel putin 2 cifre
        Scanner scan=new Scanner(System.in);
        System.out.print(
                "1. Parola sa fie compusa din litere si cifre.\n" +
                        "2. Parola trebuie sa aiba minim 8 caractere si maxim 32 de caractere.\n" +
                        "3. Parola sa contina minum doua cifre. \n" +
                        "Introduceti o parola : ");
        String parola=scan.nextLine();
        verificareParola(parola);

    }
    public static void verificareParola(String parola){
        int contorCifre = 0;
        int contorNumarCaractere=0;
        int contorLitere = 0;
        parola=parola.toLowerCase();
        for (int i = 0; i < parola.length(); i++) {
                switch (parola.charAt(i)) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        contorCifre++;
                        contorNumarCaractere++;
                        break;
                }
                if (parola.charAt(i) >= 'a' && parola.charAt(i) <= 'z') {
                    contorNumarCaractere++;
                    contorLitere++;
                }
        }
        if (contorCifre >= 2 && contorNumarCaractere >= 8 && contorNumarCaractere <= 32 && (contorCifre + contorLitere) == parola.length())
                System.out.println("Parola ok.");
        else
            System.out.print("Parola este incorecta, nu respecta cele 3 conditii cerute.");

    }
}
