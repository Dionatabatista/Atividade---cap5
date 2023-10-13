import java.util.Scanner;

public class Questão10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int somaPrimos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
            }

            if (isPrimo(numero)) {
                somaPrimos += numero;
            }
        }

        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números primos é: " + somaPrimos);

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

