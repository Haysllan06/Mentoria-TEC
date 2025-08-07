package PrimeiraAvaliacao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da Temperatura em °C: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) +35;
        double kelvin = celsius + 273.15;

        System.out.println("==== Escala de Temperaturas ====");
        System.out.printf("Temperatura em Celsius %.1f °C \n", celsius);
        System.out.printf("Temperatura em Fahrenheit %.1f F \n", fahrenheit);
        System.out.printf("Temperatura em Kelvin %.1f K \n", kelvin);
        System.out.println("=================================");
    }
}
