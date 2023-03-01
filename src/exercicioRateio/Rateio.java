package src.exercicioRateio;

import java.util.Scanner;

public class Rateio {

    public static void main(String[] args) {
        int quantItem1, quantItem2;
        double precoUnitario1, precoUnitario2, valorTotalItem1, valorTotalItem2;
        double valorTotalCompra, valorFrete, rateioItem1, rateioItem2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade do produto 1:");
        quantItem1 = entrada.nextInt();
        System.out.println("Digite o preço unitário do produto 1:");
        precoUnitario1 = entrada.nextDouble();
        System.out.println("Digite a quantidade do produto 2:");
        quantItem2 = entrada.nextInt();
        System.out.println("Digite o preço unitário do produto 2:");
        precoUnitario2 = entrada.nextDouble();
        System.out.println("Digite o valor do frete:");
        valorFrete = entrada.nextDouble();

        //valor total da compra:
        valorTotalItem1 = precoUnitario1 * quantItem1;
        valorTotalItem2 = precoUnitario2 * quantItem2;
        valorTotalCompra = valorTotalItem1 + valorTotalItem2;

        //valor do rateio de cada item:
        rateioItem1 = (valorTotalItem1/valorTotalCompra)*valorFrete;
        rateioItem2 = (valorTotalItem2/valorTotalCompra)*valorFrete;
        System.out.println("Rateio do frete para o item 1: R$%" + rateioItem1);
        System.out.println("Rateio do frete para o item 2: R$%" + rateioItem2);
        entrada.close();

        //queria aperfeiçoar esse código pra ele poder calcular o rateio por N itens ao invés de só 2 :)
    }
}
