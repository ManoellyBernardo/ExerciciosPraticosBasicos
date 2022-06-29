public class Exercicio6 {

    // Refaça os exercícios 1, 2, 5, 6, 7 do caderno de exercícios do módulo
    // anterior utilizando as estruturas para..faça e for.

    /*
     * Para cada uma das mercadorias com que um armazém trabalha dispõe-se dos
     * seguintes dados:
     * − o nome da mercadoria;
     * − o seu preço unitário;
     * − a quantidade total vendida no mês.
     * Elabore um programa para calcular o faturamento total mensal do armazém. O
     * faturamento total do armazém será calculado somando-se o total faturado por
     * cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu
     * preço unitário. O número de mercadorias comercializadas pelo armazém deve ser
     * informado pelo usuário.
     */

    public static void main(String[] args) {

        String nomeMercadoria;
        double precoUnit, fatTotal = 0;
        int numMercadorias, quantVendida, cont = 0;

        System.out.print("Digite a quantidade de mercadorias: ");
        numMercadorias = Integer.parseInt(System.console().readLine());

        do {

            System.out.printf("\n--- MERCADORIA %02d ---\n", cont + 1);
            System.out.print("Nome: ");
            nomeMercadoria = System.console().readLine();
            System.out.print("Preco Unitario: ");
            precoUnit = Double.parseDouble(System.console().readLine());
            System.out.print("Quantidade Vendida: ");
            quantVendida = Integer.parseInt(System.console().readLine());

            fatTotal = fatTotal + precoUnit * quantVendida;
            cont = cont + 1;

        } while (cont < numMercadorias);

        System.out.printf("\nFATURAMENTO TOTAL DO ARMAZEM = R$ %.2f\n", fatTotal);
    }
}
