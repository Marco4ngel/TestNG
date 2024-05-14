import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculadoraTest {
    @Test
    void testSuma() {
        double resultado = Calculadora.suma(19.5, 10.5);
        assertEquals(30, resultado);
    }

    @Test
    void testResta() {
        double resultado = Calculadora.resta(0, 2);
        assertEquals(-2, resultado);
    }

    @Test
    void testMultiplicacion() {
        double resultado = Calculadora.multiplicacion(45, 3);
        assertEquals(135, resultado);
    }

    @Test
    void testDivision() {
        double resultado = Calculadora.division(84, 2);
        assertEquals(42, resultado);
    }
}

