import java.util.Scanner;

public class Exercicio14 {
    
    //Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que receba o 
    //valor do salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
    //a. o valor de cada quilowatt;
    //b. o valor a ser pago por essa residência;
    //c. o valor a ser pago com desconto de 15%.

    public static void main(String[] args) {
        
        double quilowattCusto, valorSalarioMinimo, quantidadeQuilowattsConsumidas, valorResidencia, desconto;
            
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o valor do salário mínimo ? ");
        valorSalarioMinimo = scan.nextDouble();

        System.out.println("Qual é a quantidade de quilowatts consumida pela residência ?");
        quantidadeQuilowattsConsumidas = scan.nextDouble();

        quilowattCusto = valorSalarioMinimo/5;
        System.out.println("O valor de cada quilowatt é de " + quilowattCusto);
        valorResidencia = quantidadeQuilowattsConsumidas * quilowattCusto;
        System.out.println("O valor a ser pago por essa residência é de " + valorResidencia + " reais.");
        desconto = valorResidencia - (valorResidencia * 15/100);
        System.out.println("O valor a ser pago com um desconto de 15% é de " + desconto + " reais.");

        scan.close();

    }
}
