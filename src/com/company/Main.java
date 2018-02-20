package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 4a.
        //​
        // Parašyti programą kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
        //paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
        //KMI = masė (kg) / (ūgis(m))^2

        Scanner in = new Scanner(System.in);
        double mase, ugis;
        double kmi;

        System.out.print("Iveskite mase: ");
        mase = in.nextDouble();
        System.out.print("Iveskite ugi: ");
        ugis = in.nextDouble();

        kmi = mase / (Math.pow(ugis, 2));
        System.out.println("KMI: " + kmi);
    }
}
