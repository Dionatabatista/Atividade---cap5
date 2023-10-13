
public class Questão02 {
    public static void main(String[] args) {
        
        double valorIngresso;
    int qtdIngre = 120;

    for (double valor = 5; valor >= 1;valor = valor - 0.50){
    valorIngresso = valor * qtdIngre - 200;
    System.out.println("Lucro: " + valorIngresso + "Quantidade de ingresso vendido: " + valorIngresso + "Valor ingresso: ");
    qtdIngre = qtdIngre + 26; 
    }
}
