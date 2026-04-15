/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package while_dowhile;

import java.util.Scanner;

/**Crie um programa que exiba a tabuada do número 5, mostrando os cálculos de 1 até 10, utilizando while.

👉 O programa deve mostrar no formato:

5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
👉 Para isso:

Use uma variável de controle começando em 1
Repita o processo até o número 10
A cada repetição:
calcule a multiplicação
mostre o resultado na tela
💡 Desafio extra: depois, adapte o programa para o usuário escolher o número da tabuada.
 *
 * @author daniel.wrtavares
 */
public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int contagem = 1;
        int n = 5;
        
        while (contagem <= 10) {

            int resultado = n * contagem;
            
            System.out.println("5 X " +contagem+ " = "+ resultado);
            contagem++;
            
            
        }
    }
    
}
