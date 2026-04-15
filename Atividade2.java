/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package while_dowhile;

import java.util.Scanner;

/**Crie um programa em Java que calcule a soma de todos os números inteiros de 1 até 100 utilizando a estrutura de repetição while.

👉 Para isso:

Crie uma variável para controlar a contagem (começando em 1)
Crie uma variável para armazenar a soma
A cada repetição:
some o valor atual à variável de soma
avance para o próximo número
Ao final, exiba o resultado da soma
💡 Dica: pense em como fazer o programa repetir até chegar no número 100.
 *
 * @author daniel.wrtavares
 */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contagem = 0;
        int soma = 0;
        
        while ( contagem <= 100) {
            
            soma =+ contagem;
   
        }
        System.out.println("Resultado: " + soma);
        
    }
    
}
