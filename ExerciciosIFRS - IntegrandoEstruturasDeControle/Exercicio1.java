
public class Exercicio1 {

    /*
     * Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
     * dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas
     * informações para cada habitante, calcule e mostre:
     * a média dos salários do grupo;
     * a maior e a menor idade do grupo;
     * a quantidade de mulheres com salário até R$ 1500,00;
     * a idade e o sexo da pessoa que possui o menor salário.
     * Finalize a entrada de dados ao ser digitada uma idade negativa.
     */

    public static void main(String[] args) {

        int idade = 0, maiorIdade = 0, menorIdade = 0, quantidadeFuncionario = 0, 
        quantidadeMulheresSalarioMaior = 0, idadeMenorSalario = 0;
        String sexo, sexoMenorSalario = "C";
        double salario, mediaSalario = 0, totalSalario, menorSalario = 0;

        while (idade >= 0) {

            quantidadeFuncionario++;

            System.out.println("FUNCIONÁRIO " + quantidadeFuncionario);

            System.out.println("Sexo: ");
            sexo = System.console().readLine();

            System.out.println("Salário: ");
            salario = Double.parseDouble(System.console().readLine());

            if (sexo.equals("F") && salario <= 1.500) {
                quantidadeMulheresSalarioMaior++;
            }

            totalSalario = +salario;

            mediaSalario = totalSalario / quantidadeFuncionario;

            if (salario > menorSalario) {
                menorSalario = salario;
            }

            System.out.println("Idade: ");
            idade = Integer.parseInt(System.console().readLine());

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (quantidadeFuncionario == menorSalario) {
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }

        }

        System.out.println("A média dos salários do grupo: " + mediaSalario);
        System.out.println("A maior e a menor idade do grupo: " + maiorIdade + " e " + menorIdade);
        System.out.println("A quantidade de mulheres com salário até R$ 1500,00: " + 
        quantidadeMulheresSalarioMaior);
        System.out.println("a idade e o sexo da pessoa que possui o menor salário: " + idadeMenorSalario + 
        ", " + sexoMenorSalario);

    }
}
