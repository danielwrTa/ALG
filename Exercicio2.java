/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero da semana de 1  a 12: ");
        int day = sc.nextInt();

        switch (day) {
            case 12:
            case 1:
            case 2:
                System.out.println("Verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                break;

            default:
                System.out.println("Dia Invalido");
        }
    }

}
