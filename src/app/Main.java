package app;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velInMiles;
        double velInKm;
        double result;
        System.out.println("Vyberite perevod \n" +
                "1. Miles into kilometers \n" +
                "2. Kilometers into miles");
        int vybor = scan.nextInt();
        if (vybor == 1){
            System.out.println("Vvedite chislo v milyah");
            int a = scan.nextInt();
            velInMiles = a;
            velInKm = a*1.6;
            System.out.println("Znachenie v kilometrah = " + velInKm);
        } else if (vybor == 2) {
            System.out.println("Vvedite chislo v kilometrah");
            int a = scan.nextInt();
            velInKm = a;
            velInMiles = a/1.6;
            System.out.println("Znachenie v milyah = " + velInMiles);
        } else {
            System.out.println("Nevernyy vybor");
        }
    }

}
