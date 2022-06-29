public class Exercicio3 {
    
     //Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo anterior utilizando as estruturas
     //para..faça e for. 

     //--> 1. Faça um programa que calcule a soma de dez números quaisquer fornecidos pelo usuário.

     public static void main(String[] args) {
        
        int num, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número qualquer: ");
            num = Integer.parseInt(System.console().readLine());

            soma =+ num;
        }

        System.out.println("A soma de todos os números foi: " + soma);

     }
}
