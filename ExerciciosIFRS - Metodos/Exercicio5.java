public class Exercicio5 {

    // Escreva um programa em Java que leia um número real qualquer e um número de
    // casas decimais (inteiro) e o arredonde o número real para o número de casas
    // especificado. Por exemplo, caso o usuário informe o número 1,1379 e 2 casas
    // decimais, o número seria arredondado para 1,14.

    public static void main(String[] args) {
       
        double numReal, numArredondado;
        int numCasaDecimal;

        System.out.println("Qual número você quer arredondar ? ");
        numReal = Double.parseDouble(System.console().readLine());

        System.out.println("Quantas casas decimais você quer ? ");
        numCasaDecimal = Integer.parseInt(System.console().readLine());

        numArredondado = numReal * Math.pow(10, numCasaDecimal);
		numArredondado += 0.5; 
		numArredondado = Math.floor(numArredondado);
		numArredondado /= Math.pow(10, numCasaDecimal);

        System.out.println(numArredondado);
    }
}
