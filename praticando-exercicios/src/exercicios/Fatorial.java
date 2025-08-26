package exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // Fatorial
        Scanner sc = new Scanner(System.in);

        Boolean inicio = true;

        while(inicio) {

            System.out.println("Digite um número inteiro para calcular o fatorial:");
            int n = sc.nextInt();

            double fatorial = 1;
            for(int i = 1; i <= n; i++){
                fatorial = fatorial * i;

            }
            System.out.println("O fatorial de " + n + " é =" + fatorial);

            System.out.println("Deseja continuar? (s/n)");
            char resposta = sc.next().charAt(0);

            if(resposta == 'n' || resposta == 'N'){
                inicio = false;
            }
            
        }
        System.out.println("Programa finalizado, obrigado por participar!");
        sc.close();
    }
}
