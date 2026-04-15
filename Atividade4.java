/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package while_dowhile;

import java.util.Scanner;

/**Crie um programa que leia vários números digitados pelo usuário e calcule a soma deles.

👉 Regras:

O programa deve continuar pedindo números até o usuário digitar 0
O número 0 não deve entrar na soma
Ao final, exiba o valor total somado
👉 Passos sugeridos:

Crie uma variável para armazenar a soma
Leia o primeiro número
Enquanto o número for diferente de 0:
adicione à soma
leia o próximo número
Quando o usuário digitar 0, encerre e mostre o resultado
💡 Dica: esse tipo de estrutura é chamado de sentinela (valor que encerra o programa).
 *
 * @author daniel.wrtavares
 */
public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        
        while (num != 0) {

            soma += num;
            
            System.out.println("Digite 0 para finalizar: ");
            num = sc.nextInt();
            
        }
        
        System.out.println("Valor: " + soma);
    }
    
}
