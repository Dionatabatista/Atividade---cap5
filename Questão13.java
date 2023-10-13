import java.util.Scanner;

public class Questão13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[15];
        double[] pesos = new double[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite o peso da pessoa " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        double somaPeso1a10 = 0;
        double somaPeso11a20 = 0;
        double somaPeso21a30 = 0;
        double somaPeso31acima = 0;

        int count1a10 = 0;
        int count11a20 = 0;
        int count21a30 = 0;
        int count31acima = 0;

        for (int i = 0; i < 15; i++) {
            if (idades[i] >= 1 && idades[i] <= 10) {
                somaPeso1a10 += pesos[i];
                count1a10++;
            } else if (idades[i] >= 11 && idades[i] <= 20) {
                somaPeso11a20 += pesos[i];
                count11a20++;
            } else if (idades[i] >= 21 && idades[i] <= 30) {
                somaPeso21a30 += pesos[i];
                count21a30++;
            } else {
                somaPeso31acima += pesos[i];
                count31acima++;
            }
        }

        double mediaPeso1a10 = count1a10 > 0 ? somaPeso1a10 / count1a10 : 0;
        double mediaPeso11a20 = count11a20 > 0 ? somaPeso11a20 / count11a20 : 0;
        double mediaPeso21a30 = count21a30 > 0 ? somaPeso21a30 / count21a30 : 0;
        double mediaPeso31acima = count31acima > 0 ? somaPeso31acima / count31acima : 0;

        System.out.println("Média de peso para pessoas de 1 a 10 anos: " + mediaPeso1a10);
        System.out.println("Média de peso para pessoas de 11 a 20 anos: " + mediaPeso11a20);
        System.out.println("Média de peso para pessoas de 21 a 30 anos: " + mediaPeso21a30);
        System.out.println("Média de peso para pessoas de 31 anos ou mais: " + mediaPeso31acima);

        scanner.close();
    }
}
