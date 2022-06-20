import java.util.Scanner;

public class Exercicio3 {
    
    //Faça um programa que receba três notas de um estudante, calcule e mostre a média aritmética 
    //entre elas.

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;

        Scanner scan = new Scanner (System.in);

        System.out.println("Qual é a primeira nota ? ");
        nota1 = scan.nextDouble();

        System.out.println("Qual é a segunda nota ? ");
        nota2 = scan.nextDouble();

        System.out.println("Qual é a terceira nota ? ");
        nota3 = scan.nextDouble();

        media = (nota1+nota2+nota3)/3;

        System.out.println("A média aritnética do estudante é: " + media);

        scan.close();
    }
}
