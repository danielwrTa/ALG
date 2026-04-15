/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package while_dowhile;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Exemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inicio: ");
        int inicio = sc.nextInt();
        System.out.println("Fim: ");
        int fim = sc.nextInt();
        int i = 0;

        if (inicio == fim) {

            System.out.println("São Iguais");
            

        } else if (inicio > fim) {

            int temp = fim;

            while (temp <= fim) {

                if (temp % 2 == 0) {

                    System.out.println("I: " + temp);
                    i++;

                }
                temp++;
            }
            System.out.println("Quantidade de Pares: " + i);
        } else {

            int temp = inicio;

            while (temp <= fim) {

                if (temp % 2 != 0) {

                    System.out.println("I: " + temp);
                    i++;

                }
                temp++;
            }
            System.out.println("Quantidade de impares: " + i);
        }

    }
}
