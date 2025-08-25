package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
     // 1) Calculadora com as 4 operações básicas

        Scanner sc = new Scanner(System.in);

        Boolean iniciar = true;

        while (iniciar) {

            System.out.print("Digite o 1o número: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite o 2o número: ");
            double n2 = sc.nextDouble();

            System.out.print("Qual operação você deseja realizar? (+, -, *, /): ");
            char operacao = sc.next().charAt(0);

            double resultado;

            switch (operacao) {
                case '+':
                    resultado = n1 + n2;
                    System.out.println("O resultado entre " + n1 + " + " + n2 + " é = " + resultado);
                    break;

                case '-':
                    resultado = n1 - n2;
                    System.out.println("O resultado entre " + n1 + " - " + n2 + " é = " + resultado);
                    break;

                case '*':
                    resultado = n1 * n2;
                    System.out.println("O resultado entre " + n1 + " * " + n2 + " é = " + resultado);
                    break;

                case '/':
                    if (n2 == 0){
                        System.out.println("Erro: divisão por zero não é permitida!");
                    }else {
                        resultado = n1 / n2;
                        System.out.println("O resultado entre " + n1 + " / " + n2 + " é = " + resultado);
                    }
                    break;

                default:
                    System.out.println("ERRO! Você precisa selecionar uma das opções acima (+, -, *, /)");
                    break;

            }
            System.out.println("Deseja realizar outra operação? (s/n)");
            char resposta = sc.next().charAt(0);

            if(resposta == 'n' || resposta == 'N'){
                iniciar = false;

            }
        }

        System.out.println("Programa finalizado, Obrigado por prticipar!");
        sc.close();
    }
}
