/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrizes;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Exemplo1 {
    
    public static int[] tamanhoMatriz(){
        System.out.println("--- Tamanho Matriz ---");
        Scanner sc = new Scanner(System.in);
        
        int[] vetorLC = new int[2];
        System.out.println("Linha: ");
        vetorLC[0] = sc.nextInt();
        
        System.out.println("Colunas: ");
        vetorLC[1] = sc.nextInt();
        
        return vetorLC;
        
    }
    
    public static int[][] criarMatriz(int[] vetorLC){
        System.out.println("--- Criar Matriz --- ");
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[vetorLC[0]][vetorLC[1]];
        
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]", i, j);
                matriz[i][j] = sc.nextInt();
            }
            
        }
        
        return matriz;
    
    }
    
    
    public static void Imprimir(int[][] matriz){
        System.out.println("--- Imprimir Matriz ---");
        System.out.println("Matriz: " +matriz );
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("matriz[%d][%d]: %d\n", i, j, matriz[i][j]);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetorLC = tamanhoMatriz();
        int[][] matriz = criarMatriz(vetorLC);
        Imprimir(matriz);
        
    }
    
}
