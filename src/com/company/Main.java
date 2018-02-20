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
        Main obj = new Main();

        System.out.print("Iveskite mase: ");
        mase = in.nextDouble();
        System.out.print("Iveskite ugi: ");
        ugis = in.nextDouble();

        kmi = obj.kmi(mase, ugis);
        System.out.println("KMI: " + kmi);
    }

    public double kmi(double m, double u){
        return m / (Math.pow(u, 2));
    }
}
