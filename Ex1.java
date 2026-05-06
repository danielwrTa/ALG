/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Ex1 {
    
    public static int entradaDados(){
         Scanner sc = new Scanner (System.in);
        System.out.println("--- Entrada de Dados ---");
        System.out.println("Numero: ");
        int n = sc.nextInt();
        return n;
    
    
    }
    public static int menorNumero(int n1, int n2) {
        System.out.println("--- Menor Numero ---");
        
        if (n1 < n2) {
            
            return n1;
            
        }else{
            
            return n2;
        
        }
    
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** MAIN ***");
        
        int n1 = entradaDados();
        int n2 = entradaDados();
        int retorno = menorNumero(n1, n2);
        System.out.println("Resultado: " + retorno);
        
    }
    
}
