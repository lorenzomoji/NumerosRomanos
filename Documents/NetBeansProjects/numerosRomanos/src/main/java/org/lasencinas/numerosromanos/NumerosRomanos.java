
package org.lasencinas.numerosromanos;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosRomanos {


    /***** Atributos *****/

    private String romanNumber;
    private int decimalNumber = 0;
    private String[] regex = {"(?<!C)[DM]|(?<!X)[LC](?![DM])|(?<!I)[VX](?![LC])|I(?![VX])",
                              "(C[DM])|(X[LC])|(I[VX])"};

    /* Constructores */

    public NumerosRomanos(String romanNumber) {
        setRomanNumber(romanNumber);
    }


    /* Setters & Getters */

    public String getRomanNumber() {
        return romanNumber;
    }

    public int getDecimalNumber() {
        return decimalNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    private Matcher createMatcher(String regex, String number) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher;
    }
    
    public int traducirNumeroRomano() {
        
        for (String regularExpression: regex) {
            Matcher matcher = createMatcher (regularExpression, getRomanNumber());
            totalDecimal(matcher);
        }  
        return getDecimalNumber();
        
    }
    
    public void totalDecimal(Matcher matcher) {
        
        while (matcher.find()) {
            this.decimalNumber = this.decimalNumber + pasarADecimal(matcher.group());
        }

    }
    
    public int pasarADecimal(String romanNumber) {
        SimbolosRomanos sr = Enum.valueOf(SimbolosRomanos.class, String.valueOf(romanNumber));
        return sr.getNumero();
    }
    
}