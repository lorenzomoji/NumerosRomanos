package org.lasencinas.numerosromanos;

public enum SimbolosRomanos {

    /**
     * *** Símbolos ****
     */
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000),
    IV(4),
    IX(9),
    XL(40),
    XC(90),
    CD(400),
    CM(900);

    /**
     * *** Atributos ****
     */
    int numero = 0;

    /**
     * *** Constructor/es ****
     */
    private SimbolosRomanos(int numero) {
        this.numero = numero;
    }

    /**
     * *** Setter & Getter ****
     */
    public int getNumero() {
        return this.numero;
    }

}
