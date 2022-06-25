import java.util.Scanner;

public class Exercicio12 {
    
    //O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro do 
    //distribuidor e dos impostos aplicados ao preço de fábrica. Faça um programa que receba o preço de 
    //fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos, calcule e 
    //mostre:
    //a. o valor correspondente ao lucro do distribuidor;
    //b. o valor correspondente aos impostos;
    //c. o preço final do produto.

    public static void main(String[] args) {
        
        double precoFabricaVeiculo, percentualLucroDistribuidor, percentualImpostos, precoFinalProduto, 
        valorLucroDistribuidor, valorImpostos;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o preço de fábrica do veículo ? ");
        precoFabricaVeiculo = scan.nextDouble();

        System.out.println("Qual é o percentual de lucro do distribuidor ? ");
        percentualLucroDistribuidor = scan.nextDouble();

        System.out.println("Qual é o percentual de impostos ? ");
        percentualImpostos = scan.nextDouble();

        valorLucroDistribuidor = precoFabricaVeiculo * percentualLucroDistribuidor/100;
        valorImpostos = precoFabricaVeiculo * percentualImpostos/100;
        precoFinalProduto = precoFabricaVeiculo + valorLucroDistribuidor + valorImpostos;

        System.out.println("a. o valor correspondente ao lucro do distribuidor: " + valorLucroDistribuidor);
        System.out.println("b. o valor correspondente aos impostos: " + valorImpostos );
        System.out.println("c. o preço final do produto: " + precoFinalProduto);

        scan.close();
    }
}
