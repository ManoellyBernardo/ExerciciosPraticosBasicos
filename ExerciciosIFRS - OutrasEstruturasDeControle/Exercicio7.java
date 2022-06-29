public class Exercicio7 {
    
    //Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo
    // anterior utilizando as estruturas para..faça e for.

    //Faça um programa que apresente os quadrados dos números inteiros de 15 a 200.

    public static void main(String[] args) {
        
        int quadrados;
    
        System.out.println("Os quadrados de 15 a 200 são: ");
        
        for (int i = 15; i < 200; i++) {
            
            quadrados = i * i;
            
            System.out.println(quadrados);
        }
        
    }
}
