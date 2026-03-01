package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice13 {
    public static void main(String[] args) {

        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println("Diagonale principale:");

        for(int i=0;i<mat.length;i++){
            System.out.print(mat[i][i] + " ");
        }
    }
}
