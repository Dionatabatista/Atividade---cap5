import java.util.Scanner;

public class Questão21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVotosCandidato1 = 0;
        int totalVotosCandidato2 = 0;
        int totalVotosCandidato3 = 0;
        int totalVotosCandidato4 = 0;
        int totalVotosNulos = 0;
        int totalVotosBranco = 0;
        int totalVotos = 0;

        while (true) {
            System.out.print("Digite o código do voto (ou 0 para encerrar): ");
            int voto = scanner.nextInt();

            if (voto == 0) {
                break;
            } else if (voto >= 1 && voto <= 4) {
                totalVotos++;
                switch (voto) {
                    case 1:
                        totalVotosCandidato1++;
                        break;
                    case 2:
                        totalVotosCandidato2++;
                        break;
                    case 3:
                        totalVotosCandidato3++;
                        break;
                    case 4:
                        totalVotosCandidato4++;
                        break;
                }
            } else if (voto == 5) {
                totalVotosNulos++;
                totalVotos++;
            } else if (voto == 6) {
                totalVotosBranco++;
                totalVotos++;
            } else {
                System.out.println("Código de voto inválido. Por favor, insira um código válido.");
            }
        }

        double porcentagemVotosNulos = (double) totalVotosNulos / totalVotos * 100;
        double porcentagemVotosBranco = (double) totalVotosBranco / totalVotos * 100;

        System.out.println("Total de votos para o Candidato 1: " + totalVotosCandidato1);
        System.out.println("Total de votos para o Candidato 2: " + totalVotosCandidato2);
        System.out.println("Total de votos para o Candidato 3: " + totalVotosCandidato3);
        System.out.println("Total de votos para o Candidato 4: " + totalVotosCandidato4);
        System.out.println("Total de votos nulos: " + totalVotosNulos);
        System.out.println("Total de votos em branco: " + totalVotosBranco);
        System.out.println("Porcentagem de votos nulos sobre o total de votos: " + porcentagemVotosNulos + "%");
        System.out.println("Porcentagem de votos em branco sobre o total de votos: " + porcentagemVotosBranco + "%");

        scanner.close();
    }
}

