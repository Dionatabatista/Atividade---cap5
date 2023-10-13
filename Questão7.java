import java.util.Scanner;
public class Questão7 {
    /* Faça um programa que receba a idade, a altura e o peso de cinco pessoas, calcule e mostre: 
    a quantidade de pessoas com idade superior a 50 anos; 
    a média das alturas das pessoas com idade entre 10 e 20 anos;
    a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 0, idadeMaior50 = 0, qta = 0;
        double altura = 0, peso = 0, somaAtulrasIdade10e20 = 0, pesoMenor40 = 0, mediaAlturas = 0, percePeso = 0, somaPeso = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.print("Informe sua idade: ");
            idade = entrada.nextInt();
            System.out.print("Informe seu peso: ");
            peso = entrada.nextDouble();
            System.out.print("Informe sua altura : ");
            altura = entrada.nextDouble();

        if(idade > 50) {
            idadeMaior50++;
        }
        if((idade >= 10) && (idade <= 20)) {
            qta++;
            somaAtulrasIdade10e20 += altura;
        }
        if(peso < 40) { 
            pesoMenor40 += peso;
        }
            somaPeso += peso;
        } 

        mediaAlturas = somaAtulrasIdade10e20 / qta;
        percePeso = pesoMenor40 / somaPeso;
        System.out.println("A quantidade de pessoas com idade superior a 50 anos: " + idadeMaior50);
        ++ idadeMaior50;

        System.out.println("A média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas );
        ++ mediaAlturas;

        System.out.println("A porcentagem de pessoas com peso inferior a 40 kg: " + percePeso);
        ++ percePeso;

        entrada.close();

    }

}
