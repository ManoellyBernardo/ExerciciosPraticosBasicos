import java.util.Scanner;

public class Exercicio3 {

    /*
     * A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de
     * funcionários para várias empresas em diversos ramos de atuação. Para
     * facilitar o trabalho de identificação do perfil dos candidatos que se
     * inscrevem para as vagas, resolveu fazer um programa para registrar alguns
     * dados para obter as informações a seguir:
     * a. número de candidatos do sexo feminino;
     * b. número de candidatos do sexo masculino;
     * c. idade média dos homens;
     * d. idade média das mulheres com experiência
     * Faça um programa para calcular as informações solicitadas anteriormente,
     * sabendo que para cada candidato devem ser informados sexo (M ou F), idade e
     * tempo de experiência profissional (em anos). Também considere que a cada
     * interação deverá ser perguntado ao usuário se deseja cadastrar outro
     * candidato
     * ou não. Quando a resposta for negativa, os resultados deverão ser
     * apresentados.
     */

    public static void main(String[] args) {

        String sexo, respostaCadastro;
        int cont = 1, idade, tempoExpProf, candidatas = 0, candidatos = 0, totalIdadeMasculina = 0, 
        totalIdadeFemExp = 0, candidatasExp = 0;
        double mediaIdadeMasculina, mediaIdadeFemExp;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println(" CANDIDATX " + cont);

            cont++;

            System.out.println("Qual é o sexo do candidatx ? ");
            sexo = scan.nextLine();

            if (sexo == "F") {
                candidatas++;
            }

            System.out.println("Qual é a idade do candidatx ? ");
            idade = scan.nextInt();

            if (sexo == "M") {
                candidatos++;
                totalIdadeMasculina += idade;
            }

            System.out.println("Qual é o tempo de experiência do candidatx ? ");
            tempoExpProf = scan.nextInt();

            if (sexo == "F" && tempoExpProf != 0) {
                totalIdadeFemExp += idade;
                candidatasExp++;
            }

            System.out.println("Deseja cadastrar um novo candidatx ? ");            
            respostaCadastro = scan.nextLine();

        } while (respostaCadastro != "Não");

        mediaIdadeMasculina = totalIdadeMasculina/candidatos;
        mediaIdadeFemExp = totalIdadeFemExp/candidatasExp;

        System.out.println("Número de candidatos do sexo feminino: " + candidatas);
        System.out.println("Número de candidatos do sexo masculino: " + candidatos);
        System.out.println("Idade média dos homens: " + mediaIdadeMasculina);
        System.out.println("Idade média das mulheres com experiência: " + mediaIdadeFemExp);

        scan.close();
    }
}
