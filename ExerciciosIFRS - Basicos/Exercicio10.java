import java.util.Scanner;

public class Exercicio10 {
    
    /*Sabe-se que:
    1 pé = 12 polegadas
    1 jarda = 3 pés
    1 milha = 1.760 jardas
    Faça um programa que receba uma medida em pés , faça as conversões a seguir e mostre os resultados.
    a. polegadas;
    b. jardas;
    c. milhas.*/

    public static void main(String[] args) {
        
        double medidaPes, medidaPolegadas, medidaJardas, medidaMilhas;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a medida em pés ? ");
        medidaPes = scan.nextDouble();

        medidaPolegadas = medidaPes * 12;
        medidaJardas = medidaPes/3;
        medidaMilhas = medidaJardas/1760;

        System.out.println("Resultados: ");
        System.out.println("a. polegadas: " + medidaPolegadas);
        System.out.println("b. jardas: " + medidaJardas);
        System.out.println("c. milhas: " + medidaMilhas);

        scan.close();
    }
}
