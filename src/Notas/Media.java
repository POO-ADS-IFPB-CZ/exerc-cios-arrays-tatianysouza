
import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        double soma = 0;
        double[] nums = new double[tamanho];

        for(int i =1; i <=tamanho; i++){
            System.out.println("Informe a nota do aluno " + i + ": ");
            double numero = scanner.nextDouble();
            nums[i-1] = numero;
            soma = soma + numero;
        }
        double media = soma/10;
        System.out.println("-----------------------------------");
        System.out.println("A média do alunos foi: " + media);

        int acima = 0;
        int abaixo = 0;

        for (int i = 0; i < tamanho; i++){
            if (nums[i] < media){
                abaixo = abaixo+1;
            }
            else {
                acima = acima+1;
            }
        }

        System.out.println("Total de alunos acima da média: " + acima);
        System.out.println("Total de alunos abaixo da média: " + abaixo);
    }
}
