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
public class Atividade1 {

    public static int[] tamanhoMatriz() {
        System.out.println("--- Tamanho Matriz ---");
        Scanner sc = new Scanner(System.in);

        int[] vetorLC = new int[2];
        System.out.println("Linha: ");
        vetorLC[0] = sc.nextInt();

        System.out.println("Colunas: ");
        vetorLC[1] = sc.nextInt();

        return vetorLC;
    }

    public static int[][] criarMatriz(int[] vetorLC) {
        System.out.println("--- Criar Matriz --- ");
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[vetorLC[0]][vetorLC[1]];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public static void abaixoMedia(int media, int[][] matriz) {
        System.out.println("---  Números abaixo da Média ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < media) {
                    System.out.printf("Matriz[%d][%d]: %d \n", i, j, matriz[i][j]);
                }
            }
        }
    }

    public static int qtdAbaixoMedia(int media, int[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < media) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public static int[] vetorAbaixoMedia(int media, int[][] matriz) {

        int tamanho = qtdAbaixoMedia(media, matriz);
        int[] resultadoVetor = new int[tamanho];

        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < media) {
                    resultadoVetor[index] = matriz[i][j];
                    index++;
                }
            }
        }
        return resultadoVetor;
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("---  Imprimir Vetor Resultante ---");
        System.out.print("Vetor abaixo da média: ");

        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + ", ");
        }

    }

    public static void Imprimir(int[][] matriz, int media) {
        System.out.println("--- Imprimir Matriz ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("matriz[%d][%d]: %d\n", i, j, matriz[i][j]);
            }
        }
        System.out.println("Media: " + media);

    }

    public static int media(int[][] matriz) {
        
        int sum = 0;
        int totalnum = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
                totalnum++;
            }
        }
        return sum / totalnum;
    }

    public static void main(String[] args) {
        int[] vetorLC = tamanhoMatriz();
        int[][] matriz = criarMatriz(vetorLC);
        int media = media(matriz);

        Imprimir(matriz, media);
        System.out.println();

        abaixoMedia(media, matriz);
        System.out.println();

        int qtdAbaixo = qtdAbaixoMedia(media, matriz);
        System.out.println("---  Quantidade abaixo da média ---");
        System.out.println("Total de números abaixo da média: " + qtdAbaixo);
      

        int[] vetorimprimido = vetorAbaixoMedia(media, matriz);

        imprimirVetor(vetorimprimido);
    }
}
