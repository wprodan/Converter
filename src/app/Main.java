package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velInMiles;
        double velInKm;
        double result;
        System.out.println("Vvedite chislo v milyah");
        int a = scan.nextInt();
        velInMiles = a;
        velInKm = a*1.6;
        System.out.println("Znachenie v kilometrah = " + velInKm);
    }

}
