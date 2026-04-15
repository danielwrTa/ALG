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
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = 6;
        
        System.out.println("Tente adivinhar o numero de 0 a 10: ");
        int num = sc.nextInt();
        
        while (num != 6) {  
            
            System.out.println("Hmmm numero errado, tente dn");
            num = sc.nextInt();
            
            if (num > secreto) {
                
                System.out.println("Numero é menor, tente de novo");
                
            }else if (num < secreto){
                
                System.out.println("Numero é maior, tente novamente");
            }
                
            
                
        }
        
        System.out.println("Parabens, vc acertou");
    }
    
}
