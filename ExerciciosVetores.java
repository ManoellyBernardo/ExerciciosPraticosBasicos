import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosVetores {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Faça um programa que preencha automaticamente um vetor numérico com 8 posições:

        int[] vetor = new int[8];
        int numVetor = 0;

        for (int i = 0;i<vetor.length;i++) {
            vetor[i] = numVetor++;
            System.out.println(vetor[i]);     
        }
       
        System.out.println(vetor[0]);

        //Crie um programa que preencha automaticamente (usando lógica, não apenas
        //atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
        
        int[] vetor2 = new int[10];
        int numVetor2 = 0;

        for (int i = 0;i<vetor2.length;i++) {
            vetor2[i] = numVetor2 += 5;
            System.out.println(vetor2[i]);     
        }

        //Crie um programa que preencha automaticamente (usando lógica, não apenas
        //atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
        
        int[] vetor3 = new int[10];
        int numVetor3 = 9;
        
        for (int i = 0;i<vetor3.length;i++) {
            vetor3[i] = numVetor3--;
            System.out.println(vetor3[i]);     
        }

        //Crie um programa que preencha automaticamente (usando lógica, não apenas
        //atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:

        int[] vetor4 = new int[10];

        for (int i = 0;i<vetor3.length;i++) {
            if (i%2==0){
                vetor4[i] = 3;
            }else{
                vetor4[i] = 5;
            }
            System.out.println(vetor4[i]);     
        }

        //Crie um programa que preencha automaticamente (usando lógica, não apenas
        //atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
        //elementos da sequência de Fibonacci:

        int[] vetor5 = new int[15];

        int numAnterior = 0;
        int numAtual = 1;
        int numProximo = 1; 

        for (int i = 0; i < vetor5.length; i++) {
            vetor5[i] = numProximo;
            numProximo = numAtual + numAnterior;
            numAnterior = numAtual;
            numAtual = numProximo;
            System.out.println(vetor5[i]);
        }

        //Crie um programa que preencha automaticamente um vetor numérico com 7
        //números gerados aleatoriamente pelo computador e depois mostre os valores
        //gerados na tela.

        int[] vetor6 = new int[7]; 
        
        for (int i = 0; i < vetor6.length; i++) {
            vetor6[i]= new Random().nextInt(0,100);
            System.out.println(vetor6[i]);
        }
        
        //Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
        //final, mostre uma listagem com todos os nomes informados, na ordem inversa
        //daquela em que eles foram informados.

        String[] vetor7 = new String[7];

        for (int i = 0; i < vetor7.length; i++) {
            System.out.println("Qual é o nome que você quer armarzenar ?");
            vetor7[i] = scan.next();
        }

        for (int i = 6; i > 0; i--) {
            System.out.println(vetor7[i]);
        }
        
        //Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
        //mostre o vetor inteiro na tela e em seguida mostre em que posições foram
        //digitados valores que são múltiplos de 10.

        int[] vetor8 = new int[5];

        for (int i = 0; i < vetor8.length; i++) {
            System.out.println("Qual número você quer guarda no vetor ? ");
            vetor8[i] = scan.nextInt();
        }

        for (int i = 0; i < vetor8.length; i++) {
            System.out.println(vetor[i]);
        }

        for (int i = 0; i < vetor8.length; i++) {
            if (vetor8[i]%10==0) {
                System.out.println("Existe um número múltiplo de 10 na posição " + i);
            }
        }

        //Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
        //No final, mostre quais são os números pares que foram digitados e em que
        //posições eles estão armazenados.
        
        int[] vetor9 = new int[10];

        for (int i = 0; i < vetor9.length; i++) {
            System.out.println("Qual número você quer guardar ? ");
            vetor9[i] = scan.nextInt();
        }

        for (int i = 0; i < vetor9.length; i++) {
            if (vetor9[i]%2==0) {
                System.out.println(vetor9[i] + " é um número par e estar no índice " + i);
            }
        }
        
        //Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
        //15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
        //número (chave) e seu programa deve mostrar em que posições essa chave foi
        //encontrada. Mostre também quantas vezes a chave foi sorteada.

        int[] vetor10 =  new int[30];
        int numeroChave;
        int vezesSorteada = 0;

        for (int i = 0; i < vetor10.length; i++) {
            vetor10[i] = new Random().nextInt(1,15);
        }
        
        System.out.println("Digite o número que você quer encontrar: ");
        numeroChave = scan.nextInt();

        for (int i = 0; i < vetor10.length; i++) {
            if (vetor10[i] == numeroChave) {
                System.out.println("O número está no índice " + i);
                vezesSorteada++;
            }
        }

        System.out.println("A chave foi sorteada " + vezesSorteada + " vezes.");

        //Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
        //final, mostre:
        
        int[] vetor11 = new int[8];
        
        for (int idade : vetor11) {
            System.out.println("Qual é idade que você quer inserir ? ");
            idade = scan.nextInt();
        }
        
        //a) Qual é a média de idade das pessoas cadastradas;
        
        int total = 0;
        
        for (int i = 0; i < vetor11.length; i++) {
            total += vetor11[i];
        }
        
        System.out.println(total/vetor11.length);
        
        //b) Em quais posições temos pessoas com mais de 25 anos;
        
        for (int i = 0; i < vetor11.length; i++) {
            if (vetor11[i]>25) {
                System.out.println("Na posição " + i + " há uma pessoa com mais de 25 anos.");
            }
        }

        //c) Qual foi a maior idade digitada (podem haver repetições);
        
        int maior = 0;
        
        for ( int i = 0; i < vetor11.length; i++) {
            if (vetor11[i] > maior) {
                maior = vetor11[i];
            }
        }
        
        System.out.println("O maior número é " + maior);
        
        //d) Em que posições digitamos a maior idade;
        
        for (int i = 0; i < vetor11.length; i++) {
            if (vetor11[i] == maior) {
                System.out.println("Na posição " + i + " temos a maior idade.");
            }
        }
        
        //Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
        //um vetor. No final, mostre:
        
        int[] vetor12 = new int[10];
        int total2 = 0;
        int mediaVetor12 = 0;
        int alunosAcimaMedia = 0;
        int maior2 = 0;

        for (int i = 0; i < vetor12.length; i++) {
            System.out.println("Adicione a nota do " + (i+1) + "° : ");
            vetor12[i] = scan.nextInt();
            total2 = vetor12[i];
        }

        //a) Qual é a média da turma.

        mediaVetor12 = total2/vetor12.length;
        System.out.println("A média da turma é " + mediaVetor12);

        //b) Quantos alunos estão acima da média da turma.

        for (int i = 0; i < vetor12.length; i++) {
            if (vetor12[i]>=6) {
                alunosAcimaMedia++;
            }
        }
        
        System.out.println(alunosAcimaMedia + " estão acima da média.");

        //c) Qual foi a maior nota digitada.

        for (int i = 0; i < vetor12.length; i++) {
            if (vetor12[i] > maior2) {
                maior2 = vetor12[i];
            }
        }

        System.out.println("A maior nota é " + maior2);

        //d) Em que posições a maior nota aparece.

        for (int i = 0; i < vetor12.length; i++) {
            if (vetor12[i] == maior2) {
                System.out.println("A maior nota aparece no índice " + i);
            }
        }

        //[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
        //aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
        //números gerados e depois coloque o vetor em ordem crescente, mostrando no final
        //os valores ordenados.

        int[] vetor13 = new int[20];

        for (int i = 0; i < vetor13.length; i++) {
            vetor13[i]= new Random().nextInt(0,99);
            System.out.println(vetor13[i]);
        }

        Arrays.sort(vetor13);
        for (int i : vetor13) {
         System.out.println(vetor13[i]);   
        }

        //Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
        //valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
        //contendo apenas os dados das pessoas menores de idade.

        String[] vetor14Nome = new String[9];
        int[] vetor14Idade = new int[9];

        for (int i = 0; i < vetor14Nome.length; i++) {
            System.out.println("Qual é nome da " + (i+1) + "° pessoa.");
            vetor14Nome[i] = scan.next();
        }

        for (int i = 0; i < vetor14Idade.length; i++) {
            System.out.println("Qual é a idade da " + (i+1) + "° pessoa.");
            vetor14Idade[i] = scan.nextInt();
        }

        for (int i = 0; i < vetor14Idade.length; i++) {
            if (vetor14Idade[i] >= 18) {
                System.out.println(vetor14Nome[i] + " tem " + vetor14Idade[i] + " e é maior de idade.");
            }
            
        //Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
        //guarde esses dados em três vetores. No final, mostre uma listagem contendo
        //apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.

        String[] vetor15Nome = new String[5];
        String[] vetor15Sexo = new String[5];
        int[] vetor15Idade = new int[5];

        for (int j = 0; j < vetor15Nome.length; j++) {
            System.out.println("Qual é o nome da " + (j+1) + "° pessoa ? ");
            vetor15Nome[j] = scan.next();
        }

        for (int j = 0; j < vetor15Sexo.length; j++) {
            System.out.println("Qual é o nome da " + (j+1) + "° pessoa ? ");
            vetor15Sexo[j] = scan.next();
        }

        for (int j = 0; j < vetor15Idade.length; j++) {
            System.out.println("Qual é o nome da " + (j+1) + "° pessoa ? ");
            vetor15Idade[j] = scan.nextInt();
        }

        for (int j = 0; j < vetor15Nome.length; j++) {
            if (vetor15Sexo[j].toLowerCase() == "feminino") {
                System.out.println("A funcionaria " + vetor15Nome + " de " + vetor15Idade 
                + " anos, ganha mais de 5 mil reais por mês.");
            }
        }

        scan.close();
        
    }    
}
}
