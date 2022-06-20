import java.util.Scanner;

public class Exercicio15 {
   
    //Faça um programa que receba uma temperatura em Celsius, calcule e mostre essa temperatura em Fahrenheit.

    public static void main(String[] args) {
        
        double tempCelsius, tempFahrenheit;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura em Celsius ?");
        tempCelsius = scan.nextDouble();

        tempFahrenheit = (9 * tempCelsius/5) + 32;

        System.out.println("A temperatura em fahrenheit é de " + tempFahrenheit);

        scan.close();
    }
}
