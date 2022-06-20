import java.util.Scanner;

public class Exercicio9 {
    
    //Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que 𝐴=𝑙𝑎𝑑𝑜2.

    public static void main(String[] args) {
        
        double ladoQuadrado, areaQuadrado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto mede o lado do quadrado em centímetros ?");
        ladoQuadrado = scan.nextDouble();

        areaQuadrado = ladoQuadrado * ladoQuadrado;

        System.out.println("O quadrado tem uma área de " + areaQuadrado);

        scan.close();
    }
}
