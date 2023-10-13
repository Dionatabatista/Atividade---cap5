import java.util.Scanner;

public class Questão17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAudienciaTotal = 0;
        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal7 = 0;
        int audienciaCanal12 = 0;

        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou 0 para encerrar: ");
            int canal = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            int audiencia = scanner.nextInt();

            totalAudienciaTotal += audiencia;

            switch (canal) {
                case 4:
                    audienciaCanal4 += audiencia;
                    break;
                case 5:
                    audienciaCanal5 += audiencia;
                    break;
                case 7:
                    audienciaCanal7 += audiencia;
                    break;
                case 12:
                    audienciaCanal12 += audiencia;
                    break;
                default:
                    System.out.println("Canal inválido. Por favor, insira um canal válido (4, 5, 7, 12).");
            }
        }

        if (totalAudienciaTotal > 0) {
            double porcentagemCanal4 = (double) audienciaCanal4 / totalAudienciaTotal * 100;
            double porcentagemCanal5 = (double) audienciaCanal5 / totalAudienciaTotal * 100;
            double porcentagemCanal7 = (double) audienciaCanal7 / totalAudienciaTotal * 100;
            double porcentagemCanal12 = (double) audienciaCanal12 / totalAudienciaTotal * 100;

            System.out.println("Porcentagem de audiência do Canal 4: " + porcentagemCanal4 + "%");
            System.out.println("Porcentagem de audiência do Canal 5: " + porcentagemCanal5 + "%");
            System.out.println("Porcentagem de audiência do Canal 7: " + porcentagemCanal7 + "%");
            System.out.println("Porcentagem de audiência do Canal 12: " + porcentagemCanal12 + "%");
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }

        scanner.close();
    }
}
