package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice8 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille: ");
        int n = sc.nextInt();

        int[] tab = new int[n];
        int count = 0;

        for(int i=0;i<n;i++){
            tab[i] = sc.nextInt();
            if(tab[i] % 2 == 0){
                count++;
            }
        }

        System.out.println("Nombre de valeurs paires = " + count);
    }
}
