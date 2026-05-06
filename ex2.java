/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes;

import java.util.Scanner;

/**
 * Menu
 *
 * @author daniel.wrtavares
 */
public class ex2 {

    public static int Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Menu ---");
        int opcao;
        do {            
            System.out.println("1 - Adição \n2 - Subtracao\n3 - Multiplicacao \n4 - Divisao");
        System.out.println("Opcao (1-4): ");
        opcao = sc.nextInt();
            if (opcao <1 || opcao >4) {
                
                System.out.println("Opcao Invalida!!");
                
            }
        } while (opcao <1 || opcao >4);
        
        return opcao;
    }

    public static float entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Entrada de Dados ---");
        System.out.println("Numero: ");
        float numero = sc.nextFloat();

        return numero;

    }

    public static float Add(float n1, float n2) {

        System.out.println("--- Adicao ---");

        return n1 + n2;

    }

    public static float sub(float n1, float n2) {

        System.out.println("--- Subtracao ---");

        return n1 - n2;

    }

    public static float Multiplicacao(float n1, float n2) {

        System.out.println("--- Multiplicacao ---");

        return n1 * n2;

    }

    public static float div(float n1, float n2) {

        System.out.println("--- Divisao ---");

        return n1 / n2;

    }
    public static void Imprimir(float resultado ){
         Scanner sc = new Scanner(System.in);
         System.out.println("--- Imprimir ---");
         System.out.println("=========================");
         System.out.println("Resultado: " + resultado);
         
         
         
     }
    public static float Controlador( int opcao, float n1, float n2){
         Scanner sc = new Scanner(System.in);
         System.out.println("--- Controlador ---");
         
         float resultado = 0;
         switch (opcao) {
            case 1:
                resultado = Add(n1,n2);
                break;
            case 2:
                resultado = sub(n1, n2);
                break;
            case 3:
                resultado = Multiplicacao(n1, n2);
                break;
            case 4:
                resultado = div(n1, n2);
                break;
            
        }
         
         return resultado;
         
   
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Main ---");
        
        int op = Menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float result = Controlador(op, n1, n2);
        Imprimir(result);
        

    }

}
