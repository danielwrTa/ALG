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
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de acordo com o Produto desejado (1 a 4) ou 5 para sair."
                + "\n" + "1 Café Expresso \n"
                + "\n"
                + "2 Cappuccino \n"
                + "\n"
                + "3 Latte \n"
                + "\n"
                + "4 Chá Gelado ");
        int Ncodigo = sc.nextInt();
        
        switch(Ncodigo){
            
            case 1:
                System.out.println("Café Expresso - R$ 5,00");
                break;
            case 2:
                System.out.println("Capuccino - R$ 8,50");
                break;
            case 3:
                System.out.println("Latte - R$ 9,00");
                break;
            case 4:
                System.out.println("Cha gelado - R$ 6,00");
                break;
            case 5:
                sc.close();
                break;
            default:
                System.out.println("Numer Invalido");
        
        
        
        }
    }

}
