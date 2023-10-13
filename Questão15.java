import java.util.Scanner;

public class Questão15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasSim = 0;
        int pessoasNao = 0;
        int mulheresSim = 0;
        int homensSim = 0;
        int homensNao = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o sexo da pessoa " + i + " (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite a resposta da pessoa " + i + " (S/N): ");
            char resposta = scanner.next().charAt(0);

            if (resposta == 'S') {
                pessoasSim++;

                if (sexo == 'F') {
                    mulheresSim++;
                } else if (sexo == 'M') {
                    homensSim++;
                }
            } else if (resposta == 'N' && sexo == 'M') {
                homensNao++;
            } else if (resposta == 'N') {
                pessoasNao++;
            }
        }

        double percentagemHomensNao = 0;
        if (homensSim > 0) {
            percentagemHomensNao = (double) homensNao / homensSim * 100;
        }

        System.out.println("Número de pessoas que responderam 'sim': " + pessoasSim);
        System.out.println("Número de pessoas que responderam 'não': " + pessoasNao);
        System.out.println("Número de mulheres que responderam 'sim': " + mulheresSim);
        System.out.println("Percentagem de homens que responderam 'não': " + percentagemHomensNao + "%");

        scanner.close();
    }
}
