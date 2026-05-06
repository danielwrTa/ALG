/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcoes;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Funcoes {

    public static void digaOla(String nome) {

        for (int i = 1; i < 4; i++) {
            
            System.out.println(i+".Ola, " + nome);
            
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        digaOla("jose");
        digaOla("maira");
        digaOla("ira");

    }

}
