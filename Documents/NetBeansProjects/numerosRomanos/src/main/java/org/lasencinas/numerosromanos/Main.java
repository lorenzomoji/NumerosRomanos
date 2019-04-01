
package org.lasencinas.numerosromanos;


public class Main {
    
    public static void main( String[] args ) {

        // Numero Romano a convertir.
        String romanNumber = "DCXLIX";

        // Declaramos numeroRomano como nuevo objeto.
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        
        numeroRomano.traducirNumeroRomano();
        
        System.out.println("El número romano" +" "+numeroRomano.getRomanNumber() +" "+ "es: "+ numeroRomano.getDecimalNumber()+" "+"en decimal");
    }

}
