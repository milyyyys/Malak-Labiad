package com.mycompany.tp1;

/**
 *
 * @author ExpertBook
 */
import java.util.Scanner;
public class Exercice6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille: ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for(int i=0;i<n;i++){
            tab[i] = sc.nextInt();
        }

        System.out.print("Valeur a chercher: ");
        int x = sc.nextInt();

        boolean trouve = false;

        for(int i=0;i<n;i++){
            if(tab[i] == x){
                System.out.println("Trouve a la position " + i);
                trouve = true;
                break;
            }
        }

        if(!trouve){
            System.out.println("Valeur non trouvee");
        }
    }
}
