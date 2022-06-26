import java.util.Scanner;

public class Exercicio7 {

    //Faça um programa que leia três valores numéricos inteiros, identifique e apresente o menor valor informado.

    public static void main(String[] args) {
        
        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva aqui o primeiro número: ");
        num1 = scan.nextInt();
        
        System.out.println("Escreva aqui o segundo número: ");
        num2 = scan.nextInt();
        
        System.out.println("Escreva aqui o terceiro número: ");
        num3 = scan.nextInt();
        
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " é o menor número.");
        }
        if (num2 < num1 && num2 < num3){
            System.out.println(num2 + " é o menor número.");
        }
        if (num3 < num1 && num3 < num2) {
            System.out.println(num3 + " é o menor número.");
        }

        scan.close();
    }
    
}
