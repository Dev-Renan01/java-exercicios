package exercicios;

public class TabelaASCII {
    public static void main(String[]args){
        // Tabela ASCII

        System.out.println("Tabela ASCII: ");
        System.out.println("----------------------------");

        for(int i = 0; i <= 127; i++){
            char contagem = (char) i;
            System.out.println("Código: " + i + " -> charactere: " +  contagem);

        }
    }
}
