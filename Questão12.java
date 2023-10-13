import java.util.Scanner;

public class Questão12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int countPrimos = 0;

        System.out.println("Digite dez números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (isPrimo(numeros[i])) {
                countPrimos++;
            }
        }

        System.out.println("A quantidade de números primos entre os números digitados é: " + countPrimos);

        scanner.close();
    }

    // Função para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

