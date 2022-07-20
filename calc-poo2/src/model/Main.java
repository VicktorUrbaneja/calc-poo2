package model;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Adicao adicao = new Adicao();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        Scanner input = new Scanner(System.in);
        int opcaoEscolhida = opcao();

        while(opcaoEscolhida != 0){

            if (opcaoEscolhida == 1){
                System.out.println("Digite o primeiro número: ");
                adicao.numero1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                adicao.numero2 = input.nextInt();
                calculadora.executa(adicao);
                System.out.println(adicao);
                opcaoEscolhida = opcao();
            } else if  (opcaoEscolhida == 2) {
                System.out.println("Digite o primeiro número: ");
                subtracao.numero1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                subtracao.numero2 = input.nextInt();
                calculadora.executa(subtracao);
                System.out.println(subtracao);
                opcaoEscolhida = opcao();
            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o primeiro número: ");
                multiplicacao.numero1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                multiplicacao.numero2 = input.nextInt();
                calculadora.executa(multiplicacao);
                System.out.println(multiplicacao);
                opcaoEscolhida = opcao();
            } else if (opcaoEscolhida == 4) {
                System.out.println("Digite o primeiro número: ");
                divisao.numero1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                divisao.numero2 = input.nextInt();
                calculadora.executa(divisao);
                System.out.println(divisao);
                opcaoEscolhida = opcao();
            } else if (opcaoEscolhida == 6){
                System.out.println("Historico de operações: ");
                List<Operacao> operacoes = calculadora.getOperacoes();
                for (Operacao operacao : operacoes){
                    System.out.println(operacao);
                }
                opcaoEscolhida = opcao();
            }else {
                opcaoEscolhida = 0;
            }

        }


    }
    public static int opcao(){
        Scanner input = new Scanner(System.in);
        System.out.println("Calculadora\n\n" + "Bem vindo usuario, por gentileza digite a opção desejada: "
                + "\n\n1 - Adicao"+"\n2 - Subtracao"+"\n3 - Multiplicacao"+"\n4 - Divisao"+"\n5 - Sair" + "\n6 - Histórico");
        return input.nextInt();
    }
}


/*
 Criar uma Calculadora que mantém o histórico das opreações realizadas.
  Defina classes para cada operação matematica (Adição, Subtração, Multiplicação e Divisão) que utilizam uma interface
  para definir o contrato das operações (por exemplo: função que recebe 2 números e retorna o resultado).

Pense que cada operação matemática realizada na calculadora instancia um novo objeto.

Para exibir as operações, pode ser uma boa sobrescrever o método toString() A calculadora deve conter a função de exibir o histórico.

Opcional/Extra: Se desejar crie Scanners para que o usuário informe a operação e os valores

Sugestão de menu:

Digite

    1 para Adicao;
    2 para Subtracao;
    3 para Multiplicacao;
    4 para Divisao;
    5 para sair;
*/