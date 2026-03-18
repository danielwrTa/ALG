/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariowithcomissao;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class SalariowithComissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o total de vendas: ");
        double tvendas = sc.nextDouble();
        
        double salario = 2000 + (tvendas * 0.15);
        
        System.out.printf("Seu Salario do mes e %.2f\n", salario);
        
        
    }
    
}
