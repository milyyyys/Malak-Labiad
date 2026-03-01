package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille: ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for(int i=0;i<n;i++){
            tab[i] = sc.nextInt();
        }

        System.out.println("Tableau inverse:");
        for(int i=n-1;i>=0;i--){
            System.out.print(tab[i] + " ");
        }
    }
    
}
