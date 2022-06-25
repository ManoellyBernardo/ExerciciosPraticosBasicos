import java.util.Scanner;

public class Exercicio4 {
    
    //Construa um programa que leia três valores para os lados de um triângulo (A, B e C). O programa deve verificar se 
    //os lados fornecidos formam realmente um triângulo. Em caso positivo, deve mostrar a mensagem “Os lados formam um 
    //triângulo” e caso contrário “Os valores informados não podem formar um triângulo”. Para que três valores de lados 
    //formem um triângulo, cada par de lados somados não pode ser menor ou igual ao terceiro lado.

    public static void main(String[] args) {
        
        int ladoA, ladoB, ladoC;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do lado A: ");
        ladoA = scan.nextInt();
        
        System.out.println("Informe o valor do lado B: ");
        ladoB = scan.nextInt();
        
        System.out.println("Informe o valor do lado C: ");
        ladoC = scan.nextInt();

        if (ladoA >= ladoB + ladoC ){
        }
        if (ladoB >= ladoA + ladoC){
        }
        if (ladoC >= ladoA + ladoB){
            System.out.println("Os lados formam um triângulo.");
        }
        else {
            System.out.println("Os valores informados não podem formar um triângulo.");
        }

        scan.close();
    }
}
