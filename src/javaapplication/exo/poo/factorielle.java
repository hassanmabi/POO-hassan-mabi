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
public class factorielle {
    public static void main(String[] args){
        Scanner stocke = new Scanner(System.in);
        System.out.println("Saisir un nombre entier : ");
        int n = stocke.nextInt();
        int x = 1;
        for (int i=n;i>0;i--) x*=i; 
        System.out.println("Factorielle "+n+" donne "+x);
    }
}
