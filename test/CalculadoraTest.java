import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculadoraTest {

    @Test
    public void testOperacion() {

    }

    @Test
    public void testSuma() {
        double resultado = Calculadora.suma(0, 2);
        assertEquals(2, resultado, 0);
    }

    @Test
    public void testResta() {

    }

    @Test
    public void testMultiplicacion() {
        double resultado = Calculadora.multiplicacion(23,5);
        assertEquals();
    }

    @Test
    public void testDivision() {
        double resultado = Calculadora.division(0, 2);
        assertEquals(0, resultado, 0);
    }
}