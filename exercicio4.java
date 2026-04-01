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
public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ultimo numero da placa: ");
        int Placa = sc.nextInt();
        System.out.println("Digite o dia da semana de 1 a 5: ");
        int day = sc.nextInt();

        
         switch (Placa) {
            
            case 1:
            case 2:
                if( (Placa == 1 || Placa == 2) && day == 1){
                
                    System.out.println("Nao pode circular");
                
                }else{
                
                    System.out.println("Pode circular");
                    
                }
                break;
            case 3:
            case 4:
                if( (Placa == 3 || Placa == 4) && day == 2){
                
                    System.out.println("Nao pode circular");
                
                }else{
                
                    System.out.println("Pode circular");
                    
                }
                
                break;
            case 5:
            case 6:
                if( (Placa == 5 || Placa == 6) && day == 3){
                
                    System.out.println("Nao pode circular");
                
                }else{
                
                    System.out.println("Pode circular");
                    
                }
                break;
            case 7:
            case 8:
                if( (Placa == 7 || Placa == 8) && day == 4){
                
                    System.out.println("Nao pode circular");
                
                }else{
                
                    System.out.println("Pode circular");
                    
                }
                break;
            case 9: 
                if( (Placa == 9 || Placa == 0) && day == 5){
                
                    System.out.println("Nao pode circular");
                
                }else{
                
                    System.out.println("Pode circular");
                    
                }
            default:
                System.out.println("dia ou placa Invalida");
        }
        
    }
}
