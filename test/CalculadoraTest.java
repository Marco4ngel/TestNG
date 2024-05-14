import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculadoraTest {


    @Test
    public void testSuma() {
        Double resultado = Calculadora.suma(13.5,19.5);
        assertEquals(resultado,33);
    }

    @Test
    public void testResta() {
    }

    @Test
    public void testMultiplicacion() {
    }

    @Test
    public void testDivision() {
    }
}
