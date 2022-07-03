
public class Exercicio2 {

    /*
     * Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser
     * comercializada na bolsa de valores, o preço de compra e o preço de venda de
     * cada ação e que calcule e mostre:
     *  a quantidade de ações com lucro superior a R$ 1.000,00;
     *  a quantidade de ações com lucro inferior a R$ 200,00.
     * Finalize com o tipo de ação ‘F’.
     */

     public static void main(String[] args) {
        
        String tipoAcao = "Iniciar";
        double precoCompra, precoVenda, valorAcao, acaoLucro1k = 0, acaoLucro200 = 0;

        while (tipoAcao != "F") {
            
            System.out.println("Qual é o tipo de ação ? ");
            tipoAcao = System.console().readLine();
            
            if (tipoAcao == "F") {
                break;
            } else {

                System.out.println("Qual é o preço de compra ? ");
                precoCompra = Integer.parseInt(System.console().readLine());
                
                System.out.println("Qual é o preço de venda ? ");
                precoVenda = Integer.parseInt(System.console().readLine());
        
                valorAcao = precoCompra - precoVenda;
        
                if (valorAcao > 1000) {
                    acaoLucro1k++;
                }
        
                if (valorAcao < 200) {
                    acaoLucro200++;
                }
            }
        }

        System.out.print("Quantidade de ações com lucro superior a R$ 1.000,00: " + acaoLucro1k);
        System.out.print("Quantidade de ações com lucro inferior a R$ 200,00: " + acaoLucro200);

     }
}
