

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.numerosromanos.SimbolosRomanos;
import static org.assertj.core.api.Assertions.assertThat;
import org.lasencinas.numerosromanos.NumerosRomanos;


public class MainTest {
    
    @Test
    public void NumerosRomanosConstructorTest() {
        // voy a asegurarme de que los metodos de los Enum Types
        // se comportan como yo espero
        SimbolosRomanos numero = SimbolosRomanos.C.X;
        assertThat(numero).isInstanceOf(SimbolosRomanos.class);
        assertThat(numero.ordinal()).isEqualTo(2);
        assertThat(SimbolosRomanos.valueOf(numero.name())).isEqualTo(SimbolosRomanos.X);
        assertThat(numero.compareTo(numero.X)).isEqualTo(0);
        assertThat(numero.equals(numero.X)).isEqualTo(true);
        assertThat(SimbolosRomanos.values()[2]).isEqualTo(numero);
    }

    @Test
    public void NumerosRomanosX() {
        SimbolosRomanos numerosRomanos = SimbolosRomanos.C.X;
        assertThat(numerosRomanos.getNumero()).isEqualTo(10);
    }

    @Test
    public void NumerosRomanosCM() {
        SimbolosRomanos numerosRomanos = SimbolosRomanos.C.CM;
        assertThat(numerosRomanos.getNumero()).isEqualTo(900);
    }

    @Test
    public void NumerosRomanosUMMMUCCCU() {
        String romanNumber = "UMMMUCCCU";
        NumerosRomanos numeroRomano = new NumerosRomanos(romanNumber);
        assertThat(numeroRomano.traducirNumeroRomano()).isEqualTo(3300);
    }
}
