/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediapoderada;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class MediaPoderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Qual segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("Qual terceira nota: ");
        float n3 = sc.nextFloat();
        
        float media = (n1*2 + n2*3 + n3*5) / 10;
        
        System.out.println("Sua media foi de: " + media);
    }
    
}
