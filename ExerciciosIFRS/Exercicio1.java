import java.util.Scanner;

public class Exercicio1 {
    
    //Faça um programa que receba dois números, calcule e mostre a 
    //subtração do primeiro número pelo segundo.

    public static void main(String[] args) {
         
        double num1, num2, resultadoSub;
       
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Qual é o primeiro número ? ");
        num1 = scan.nextDouble();

        System.out.println("Qual é o segundo número ? ");
        num2 = scan.nextDouble();

        resultadoSub = num1 - num2;

        System.out.println("O resultada da subtração de " + num1 + " pelo " + num2 + " é: " + resultadoSub);

        scan.close();
    }
}
