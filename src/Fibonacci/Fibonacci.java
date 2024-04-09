package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int tamanho = 30;
        int[] nums = new int[tamanho];
        int n1 = 1;
        int n2 = 0;

        for (int i = 0; i < tamanho; i++){
            nums[i] = n1;
            int aux = n1;
            n1 = n1 + n2;
            n2 = aux;
        }

        for (int i = 0; i < tamanho; i++){
            System.out.println(nums[i]);
        }
    }
}
