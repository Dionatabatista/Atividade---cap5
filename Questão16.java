import java.util.Scanner;

public class Questão16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int somaIdades = 0;
        int contadorIdades = 0;

        do {
            System.out.print("Digite a idade (ou 0 para encerrar): ");
            idade = scanner.nextInt();

            if (idade != 0) {
                somaIdades += idade;
                contadorIdades++;
            }
        } while (idade != 0);

        if (contadorIdades > 0) {
            double mediaIdades = (double) somaIdades / contadorIdades;
            System.out.println("A média das idades digitadas é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi digitada.");
        }

        scanner.close();
    }
}

