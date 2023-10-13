import java.util.Scanner;

public class Questão09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0, qtdPesoMaior90 = 0, qtdIdadeEntre10 = 0;
        double peso = 0, altura 0, mediaIdades = 0, perIdade10e = 0, somaIdade = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.println("Informe sue peso: ");
            peso = entrada.nextDouble();
            System.out.println("Informe sua altura: ");
            altura = entrada.nextDouble();
            
            somaIdade += idade;

            if((peso > 90 ) && (altura < 1.50)) {
                qtdPesoMaior90 ++;
            } if(((idade >= 10) && (idade <= 30 ) && (altura > 1.90))) {
                qtdIdadeEntre10 ++;
            }
        }

            mediaIdades = somaIdade / 10;
            perIdade10e = (qtdIdadeEntre10 / 10)* 100;

            System.out.println("Média das idades  das dez pessoas: " + mediaIdades);

            System.out.println("Peso superior a 90kg e altura  innferior a 1.50 m: " + qtdPesoMaior90);

            System.out.println("Idade entre 10 e 330 anos entre mais de 1.90 m: " + perIdade10e);

            entrada.close();

    }
}
