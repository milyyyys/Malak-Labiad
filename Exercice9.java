package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille: ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for(int i=0;i<n;i++){
            tab[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(tab[i] > tab[j]){
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        System.out.println("Tableau trie:");
        for(int i=0;i<n;i++){
            System.out.print(tab[i] + " ");
        }
    } 
}
