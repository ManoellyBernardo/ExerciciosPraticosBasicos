import java.util.Scanner;

public class Exercicio11 {
    
    //Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
    //a. a idade dessa pessoa em anos;
    //b. a idade dessa pessoa em meses;
    //c. a idade dessa pessoa em dias (considerando que cada ano possui 365 dias);
    //d. a idade dessa pessoa em semanas (cada ano possui 52 semanas).

    public static void main(String[] args) {
        
        int anoNascimento, anoAtual, idadeAnos, idadeMeses, idadeDias, idadeSemanas;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o ano de nascimento ? ");
        anoNascimento = scan.nextInt();

        System.out.println("Qual é o ano em que estamos ? ");
        anoAtual = scan.nextInt();

        idadeAnos = anoAtual - anoNascimento;
        idadeMeses = idadeAnos * 12;
        idadeSemanas = idadeAnos * 52;
        idadeDias = idadeAnos * 365;

        System.out.println("a. idade em anos: " + idadeAnos);
        System.out.println("b. idade em meses: " + idadeMeses);
        System.out.println("c. idade em semanas: " + idadeSemanas);
        System.out.println("d. idade em dias: " + idadeDias);

        scan.close();
    }
}
