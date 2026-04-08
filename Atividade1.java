/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosderepeticao;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Atividade1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int numero;
         
         System.out.println("Voce quer fazer a tabuada de qual numero? ");
         numero = sc.nextInt();
         
         for (int i = 1 ; i <= 10; i++) {
             
             int tabuada = numero * i;
             
             System.out.println("Tabuada de " + numero+ " X " + i+ " = " + tabuada);
             
            
        }
    }
}
