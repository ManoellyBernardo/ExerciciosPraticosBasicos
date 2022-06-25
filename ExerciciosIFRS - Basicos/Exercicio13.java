import java.util.Scanner;

public class Exercicio13 {

    //Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre 
    //o salário a receber seguindo estas regras:
    //a. a hora trabalhada vale um décimo do salário mínimo;
    //b. o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
    //c. o imposto equivale a 3% do salário bruto;
    //d. o salário a receber equivale ao salário bruto menos o imposto.

    public static void main(String[] args) {
        
        double horasTrabalhadas, salarioMinimo, valorHoraTrabalhada, salarioBruto, imposto, salarioReceber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas horas foram trabalhadas ? ");
        horasTrabalhadas = scan.nextDouble();

        System.out.println("Qual é o valor do salário mínimo ? ");
        salarioMinimo = scan.nextDouble();

        valorHoraTrabalhada = salarioMinimo/10;
        salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
        imposto = salarioBruto*3/100;
        salarioReceber = salarioBruto - imposto;

        System.out.println("O salário a receber é de: " + salarioReceber + " reais.");

        scan.close();
    }
    
}
