package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille du tableau: ");
        int n = sc.nextInt();

        int[] tab = new int[n];
        int somme = 0;

        for(int i=0;i<n;i++){
            tab[i] = sc.nextInt();
            somme += tab[i];
        }

        System.out.println("Somme totale = " + somme);
    }
}
