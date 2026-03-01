package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de lignes: ");
        int n = sc.nextInt();
        System.out.print("Nombre de colonnes: ");
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] somme = new int[n][m];

        System.out.println("Remplir matrice A:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Remplir matrice B:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                B[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                somme[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("La somme est:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(somme[i][j] + " ");
            }
            System.out.println();
        }
    }
}
