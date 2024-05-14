import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;

        try {
            System.out.println("Introduzca el primer número");
            num1 = Double.parseDouble(sc.nextLine());

            System.out.println("Introduzca el segundo número");
            num2 = Double.parseDouble(sc.nextLine());

            System.out.println("""
                    Selecciona la operación
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    """);
            String opcion = sc.nextLine();
            System.out.println("El resultado es: " + Calculadora.Operacion(opcion, num1, num2));

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println("Introduce un número");
        }
    }
}
