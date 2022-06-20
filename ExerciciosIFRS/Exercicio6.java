import java.util.Scanner;

public class Exercicio6 {
    
    //Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas (4% do valor das vendas 
    //efetuadas pelo funcionário). Faça um programa que receba o salário fixo do funcionário e o valor de 
    //suas vendas, calcule e mostre a comissão e seu salário final.

    public static void main(String[] args) {

        double salarioFixo, valorVendas, comissao, salarioFinal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o salário fixo do funcionário? ");
        salarioFixo = scan.nextDouble();

        System.out.println("Qual é o valor das suas vendas? ");
        valorVendas = scan.nextDouble();
        
        comissao = valorVendas * 4/100;
        salarioFinal = salarioFixo + comissao;

        System.out.println("A comissão do funcionário é de " + comissao + " reais e o salário final é " + 
        salarioFinal + " reais.");

        scan.close();
    }
}
