package exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcularDias {
    public static void main(String[] args) {
        // Calcular quantidade de dias entre duas datas

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a primeira data (dd/MM/yyyy): ");
        String data1 = sc.next();

        System.out.println("Digite a segunda data (dd/MM/yyyy): ");
        String data2 = sc.next();

        LocalDate ld1 = LocalDate.parse(data1, formater);
        LocalDate ld2 = LocalDate.parse(data2, formater);

       long diferenca = ChronoUnit.DAYS.between(ld1, ld2);// Calcula a quantidade de dias entre duas datas

        System.out.println("A diferença entre as datas é de " + diferenca + " dias.");

        sc.close();
    }
}