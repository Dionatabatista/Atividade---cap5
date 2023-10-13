import java.util.Scanner;

public class Questão03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int fxEtaria1 = 0, fxEtaria2 = 0, fxEtaria3 = 0, fxEtaria4 = 0, fxEtaria5 = 0, idade = 0;

        for (int i = 0; i <= 7; i++) {
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();

            if (idade <= 15) {
                fxEtaria1++;
            }else if (idade >= 16 && idade <= 30) {
                fxEtaria2++;
            }else if (idade >= 31 && idade <= 45) {
                fxEtaria3++; 
            }else if (idade >= 46 && idade <= 60) {
                 fxEtaria4++;
            }else{
                fxEtaria5++;
            }
        }

            System.out.print("Quantidade  de pessoa por faixa etária: ");
            System.out.print("Faixa 01: " + fxEtaria1);
            System.out.print("Faixa 02: " + fxEtaria2);
            System.out.println("Faixa 03: " + fxEtaria3);
            System.out.println("Faixa 04: " + fxEtaria4);
            System.out.println("Faixa 05: " + fxEtaria5);

            System.out.println("a porcentagem de pessoas na primeira faixa etária com relação ao total de pessoas: " + porcentagem01 + "% ");


            entrada.close();
            
    }
}
