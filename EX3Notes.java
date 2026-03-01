package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Ex3Notes {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre d'etudiants : ");
        int n = sc.nextInt();

        double[] notes = new double[n];

        double somme = 0;
        double max = -1;
        double min = 20;

        for (int i = 0; i < n; i++) {
            System.out.print("Note " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();

            somme += notes[i];

            if (notes[i] > max) max = notes[i];
            if (notes[i] < min) min = notes[i];
        }
        double moyenne = somme / n;

        System.out.println("Moyenne = " + moyenne);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}
