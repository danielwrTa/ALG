/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Digite um codigo de 1 a 7:  ");
        int day = sc.nextInt();

        switch (day) {
            
            case 1:
                System.out.println("Alimento nao-Perecivel");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Alimento Perecivel");
                break;
            case 5:
            case 6:
                System.out.println("Vestuario");
                break;
            case 7:
                System.out.println("Vestuario");
                break;

            default:
                System.out.println("Codigo Invalido");
        }
        
        
    }
    
}
