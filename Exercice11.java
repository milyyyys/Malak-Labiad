package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = {
            {5,6,7},
            {8,9,4}
        };

        for(int i=0;i<mat.length;i++){
            int somme = 0;
            for(int j=0;j<mat[i].length;j++){
                somme += mat[i][j];
            }
            System.out.println("Somme ligne " + i + " = " + somme);
        }
    }
}
