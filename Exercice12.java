package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice12 {
     public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6}
        };

        for(int j=0;j<mat[0].length;j++){
            int somme = 0;
            for(int i=0;i<mat.length;i++){
                somme += mat[i][j];
            }
            System.out.println("Somme colonne " + j + " = " + somme);
        }
    }
}
