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
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, soma = 0;
        System.out.println("Digite um numero Inteiro positivo: ");
        numero = sc.nextInt();
        
        
        for (int i = 1; i < numero; i++) {
            
            
            if (i%2 ==0 ) {
                
                soma += i;
                 System.out.println(soma);
                
            }
        }
    }
}
