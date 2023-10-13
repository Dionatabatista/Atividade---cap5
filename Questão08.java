import java.útil.Scanner;

 public class Questão08 {
  public  static  void  main ( String [] args ) {
        var  entrada = new  Scanner ( System.in ) ; _
        int  idade = 0 , qtdIdadeMaior50EPesoMenor60 = 0 , qtdIdadeAlturaMenor150 = 0 ;
        int  olhosAzuis = 0 , ruivasSemOlhosAzuis = 0 ;
        double  peso = 0 , altura = 0 , somaIdadeAlturaMenor150 = 0 , mediaIdades = 0 ;
        double  perOlhos = 0 ;
        char  olhos = ' ' , cabelos = ' ' ;

        for ( int  i = 0 ; i < 6 ; i ++){
            Sistema . fora . print ( "Informe sua idade: " );
            idade = entrada . próximoInt ();
            Sistema . fora . print ( "Informe seu peso: " );
            peso = entrada . próximoDuplo ();
            Sistema . fora . print ( "Informe sua altura: " );
            altura = entrada . próximoDuplo ();
            Sistema . fora . imprimir (
                "(A — azul; P — preto; V — verde; e C — castanho)"
                + " \n Cor dos olhos: " );
            olhos = entrada . próximo (). charAt ( 0 );
            Sistema . fora . imprimir (
                "(P — preto; C — castanho; L — louro; e R — ruivo)"
                + " \n Cor dos cabelos: " );
            cabelos = entrada . próximo (). charAt ( 0 );

            if ( idade > 50 && peso < 60 ){
                qtdIdadeMaior50EPesoMenor60 ++;
            }
            if ( altura < 1,50 ){
                qtdIdadeAlturaMenor150 ++;
                somaIdadeAlturaMenor150 += idade ;
            }
            if (( olhos == 'A' ) || ( olhos == 'a' )){
                olhosAzuis ++;                
            }
            if ((( cabelos == 'R' ) || ( cabelos == 'r' ) ) && (( olhos != 'A' ) || ( olhos != 'a' ))){
                ruivasSemOlhosAzuis ++;
            }
        }

        mediaIdades = somaIdadeAlturaMenor150 / qtdIdadeAlturaMenor150 ;
        perOlhos = ( olhosAzuis / 6.0 )* 100 ;

        Sistema . fora . println ( "Quantidade de pessoas com idade superior a 50 anos"
        + "e peso inferior a 60 kg: " + qtdIdadeMaior50EPesoMenor60 );
        Sistema . fora . imprimir (
            "Média das idades das pessoas com altura inferior a 1,50 m: " +
            mediaIdades );
        Sistema . fora . println ( "Porcentagem de pessoas com olhos azuis: " + perOlhos + "%" );
        Sistema . fora . println ( "Ruivas e que não possuem olhos azuis: " + ruivasSemOlhosAzuis );

        entrada.fechar ();
     }   
}