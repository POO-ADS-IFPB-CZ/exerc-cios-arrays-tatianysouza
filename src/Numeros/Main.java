package Numeros;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
            soma += numero;
            contador++;
        }
        System.out.println("-----------------------------------------");
        System.out.println("Os números do array são: " + numeros);
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Total de números digitados: " + contador);
            System.out.println("Média dos números: " + media);
        }
        else {
            System.out.println("Nenhum número digitado");
        }
    }
}

