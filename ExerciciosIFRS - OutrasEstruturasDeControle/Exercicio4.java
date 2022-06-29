public class Exercicio4 {
    
     //Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo anterior utilizando as estruturas
     //para..faça e for. 

     //--> 2. Faça um programa que calcule o somatório, a soma dos quadrados e a média entre os n primeiros números
     //inteiros positivos.

      public static void main(String[] args) {
        
        int n = 5, soma = 0, quadrados = 0, somaQuadrados = 0;
        double media;

        for (int i = 1; i <= n; i++) {
            
            soma = soma + i;

            quadrados = i * i;

            somaQuadrados = somaQuadrados + quadrados;
        }

        media = soma/n;

        System.out.println("O somatorio dos 5 primeiros números inteiros é " + soma);
        
        System.out.println("A soma dos quadrados dos 5 primeiros número inteiros é " + somaQuadrados);

        System.out.println("E a média dos 5 primeiros números inteiros é " + media);

      }
}
