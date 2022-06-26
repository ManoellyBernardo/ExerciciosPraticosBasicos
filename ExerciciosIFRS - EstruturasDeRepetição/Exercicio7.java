public class Exercicio7 {

    //Faça um programa que apresente os quadrados dos números inteiros de 15 a 200.

    public static void main(String[] args) {
        
        int num = 15, quadrados;
        
        System.out.println("Os quadrados dos números inteiros de 15 a 200 são: ");
        
        while (num < 200){
            
            quadrados = num * num;

            System.out.println(quadrados);

            num++;
        }
    }
}

