public class Calculadora {

    public static double Operacion(String eleccion, double num1, double num2) {
        switch (eleccion) {
            case "1":
                return suma(num1, num2);
            case "2":
                return resta(num1, num2);

            case "3":
                return multiplicacion(num1, num2);

            case "4":
                if (num2 != 0) {
                    return division(num1, num2);
                } else {
                    throw new ArithmeticException("No es posible dividir entre 0");
                }

            default:
                throw new IllegalArgumentException("Introduce una opcion válida");
        }
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}