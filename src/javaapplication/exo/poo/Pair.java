/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.exo.poo;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner saisie = new Scanner(System.in);   
        System.out.println("Saisir un entier naturel: ");
        int a = saisie.nextInt();
        if (a%2==1){  
            System.out.println("nombre impair. ");
        }
        else
            System.out.println("nombre pair. ");
    } 
}