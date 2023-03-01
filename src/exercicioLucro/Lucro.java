package src.exercicioLucro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lucro implements Comparator<Double> {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<>();

        int continuar = 0;
        while (continuar == 0) {
            System.out.println("Digite os valores dos preços do período escolhido:");
            double numero = entrada.nextDouble();
            if (numero >= 0) {
                lista.add(numero);
            } else {
                System.out.println("Não é possível adicionar um valor negativo.");
            }
            System.out.println("Deseja informar mais valores? Digite 0 para Sim / 1 para Não");
            continuar = entrada.nextInt();
        }
        System.out.println("Valores das ações no período: " + lista);

        // percorrer só uma vez e em ordem. A cada posição, você precisa saber qual foi
        // o melhor preço pra comprar até aquele momento; guarda isso numa variável.

        ArrayList<Double> lucros = new ArrayList<>();

        double lucro = 0;

        for (int i = 0; i < lista.size(); i++) {
            for (int j = i+1; j < lista.size(); j++) {
                int comparation = lista.get(i).compareTo(lista.get(j));
                if (comparation < 0) { //i < j
                    lucro = lista.get(j) - lista.get(i);
                    lucros.addAll(Collections.singleton(lucro));
                }
            }
        }

        double maiorLucro = Collections.max(lucros);
        System.out.println("O maior lucro do período foi: " + maiorLucro);
    }

    @Override
    public int compare(Double o1, Double o2) {
        return o1.compareTo(o2);
    }
}

