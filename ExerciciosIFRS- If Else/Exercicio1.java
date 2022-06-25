import java.util.Scanner;

public class Exercicio1 {
    
    //Faça um programa que leia dois valores numéricos inteiros e apresente o resultado da diferença do maior valor pelo 
    //menor valor. Se os valores forem iguais, o programa deve mostrar zero.

    public static void main(String[] args) {
        
        int num1, num2, resultado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o valor do primeiro número: ");
        num1 = scan.nextInt();
        
        System.out.println("Digite aqui o valor do primeiro número: ");
        num2 = scan.nextInt();
        
        if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println("O resultado da subtração do número maior pelo menor é: " + resultado);
        } else if (num1 == num2) {
            System.out.println("Números iguais: 0");
        } else {
            resultado = num2 - num1;
            System.out.println("O resultado da subtração do número maior pelo menor é: " + resultado);
        }
        
        scan.close();
    }
}
