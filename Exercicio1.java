/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero da semana de 1  a 7: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                
                System.out.println("Dia comercial");
                break;
            case 7:
                
                System.out.println("Fim de Semana");
                break;
                
            default:
                System.out.println("Dia Invalido");
        }
    }

}
