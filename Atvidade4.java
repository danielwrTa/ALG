/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lacosderepeticao;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Atvidade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd;
        double nota1,nota2,media;
        double mediageral= 0;
        
        int aprovados = 0;
        int reprovados = 0;
        
        System.out.println("Quantos alunos tem na turma: ");
        qtd = sc.nextInt();
        
        for (int i = 1; i <= qtd; i++) {
            
                System.out.println("nome: ");
                String nome = sc.next();
                
                System.out.println("Nota1: ");
                nota1 = sc.nextDouble();
                
                System.out.println("nota2: ");
                nota2 = sc.nextDouble();
                
                media = (nota1 +nota2)/2;
                mediageral += media;
                
                if (media >= 6) {
                    
                    System.out.println("Aluno: " + nome + "; Media: "+ media +"; Aprovado");
                    aprovados++;
                
            }else{
                
                System.out.println("Aluno: " + nome + "; Media: "+ media +"; Reprovado");
                    reprovados++;
                
                }
                
                double mediaTurma = mediageral / qtd ;
                
                System.out.println("Resultado");
                
                System.out.println("Media da Turma: " + mediaTurma);
                System.out.println("Aprovados: " + aprovados);
                System.out.println("Reprovados: " + reprovados);
            
        }
    }
    
}
