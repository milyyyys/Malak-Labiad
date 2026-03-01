package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lignes: ");
        int n = sc.nextInt();
        System.out.print("Colonnes: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
