/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package realfordola;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class RealForDola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o valor em reais vc quer converer: ");
        float real = sc.nextFloat();
        
        System.out.println("Qual a cotacao atual do dolar: ");
        float CotacaoDolar = sc.nextFloat();
        
        float valoremdolar = real / CotacaoDolar;
        
        System.out.printf("O seu valor real em dolar é %.2f \n", valoremdolar);
        
    }
    
}
