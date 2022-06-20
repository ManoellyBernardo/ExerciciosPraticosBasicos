import java.util.Scanner;

public class Exercicio8 {
    
    //Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base x altura) / 2. 
    //A base e altura devem ser informadas pelo usuário.

    public static void main(String[] args) {
        
        double baseTriangulo, alturaTriangulo, areaTriangulo;

        Scanner scan = new Scanner (System.in);

        System.out.println("Qual é base do triângulo ? ");
        baseTriangulo = scan.nextDouble();
        
        System.out.println("Qual é a altura do triângulo ? ");
        alturaTriangulo = scan.nextDouble();

        areaTriangulo = (baseTriangulo * alturaTriangulo)/2;

        System.out.println("A área do triângulo é de " + areaTriangulo);

        scan.close();
    }
}
