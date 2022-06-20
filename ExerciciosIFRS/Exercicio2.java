import java.util.Scanner;

public class Exercicio2 {
    
    //Faça um programa que receba dois números, calcule e mostre a divisão do primeiro pelo segundo. 
    //Sabe-se que o segundo número não pode ser zero, portanto, não é necessário se preocupar com isso 
    //neste exercício.

    public static void main(String[] args) {
        
        double num1, num2, resultadoDiv;

        Scanner scan = new Scanner (System.in);

        System.out.println("Qual é o primeiro número ? ");
        num1 = scan.nextDouble();

        System.out.println("Qual é o segundo número ? ");
        num2 = scan.nextDouble();

        resultadoDiv = num1/num2;

        System.out.println("O resultada da divisão de " + num1 + " pelo " + num2 + " é: " + resultadoDiv);

        scan.close();
    }
}
