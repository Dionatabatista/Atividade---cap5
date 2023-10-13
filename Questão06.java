importar  java . útil . Scanner ;

 public class Questão06 {
    public  static  void  main ( String [] args ) {
         Entrada do Scanner = new  Scanner ( System.in ) ;
        //String código;
        double  totalAVista = 0 , totalAPrazo = 0 , valorCompra , total ;
        char  código ;

        para ( int  eu = 0 ; eu < 15 ; eu ++) {
            Sistema . fora . print ( "Informar código: " );
            código = entrada . próximo (). charAt ( 0 );
            //codigo = entrada.next().toUpperCase();

            Sistema . fora . print ( "Informe valor de compra: " );
            valorCompra = entrada . próximoDuplo ();

            if ( código == 'V' || código == 'v' ) {
                //codigo.equals("V")
                totalAVista = totalAVista + valorCompra ;
                //totalAVista += valorCompra
            } else  if ( código == 'P' || código == 'p' ) {
                //codigo.equals("P")
                totalAPrazo = totalAPrazo + valorCompra ;
                //totalAPrazo += valorCompra
            } else {
                Sistema . fora . println ( "Código inválido!" );
            }

        }
        total = totalAPrazo + totalAVista ;

        Sistema . fora . imprimir (
            "o valor total das compras à vista: " + totalAVista );
        Sistema . fora . imprimir (
            "o valor total das compras a prazo: " + totalAPrazo );
        Sistema . fora . imprimir (
            "o valor total das compras efetuadas: " + total );
        Sistema . fora . imprimir (
            "o valor total das compras efetuadas: " + totalAPrazo / 3 );

        entrada . fechar ();
    }
}








    

