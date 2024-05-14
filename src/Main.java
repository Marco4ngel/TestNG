import clases.Patron;
import clases.Usuario;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        File fichero = new File("src\\ficheros\\usuarios.csv");

        String nombre = obtenerDatos("Introduce tu nombre y apellidos (Apellido1 Apellido 2, Nombre): ", Patron.PATRON_NOMBRE.getPattern());
        String email = obtenerDatos("Introduce tu correo electrónico (nombre_usuario@dominio): ", Patron.PATRON_EMAIL.getPattern());
        String ip = obtenerDatos("Introduce tu dirección IP (xxx.xxx.xxx.xxx (IPv4)): ", Patron.PATRON_IP.getPattern());
        String telefono = obtenerDatos("Introduce tu número de teléfono: ", Patron.PATRON_TELEFONO.getPattern());
        String nick = obtenerDatos("Introduce tu nickname (en minúsculas, con símbolos permitidos: _): ", Patron.PATRON_NICK.getPattern());
        String contra = "";

        Boolean contraConfirmada = false;

        while (!contraConfirmada) {
            contra = obtenerDatos("Introduce tu contraseña (8 caracteres min,  minusculas, mayúsculas, números, símbolos): ", Patron.PATRON_CONTRA.getPattern());
            String contra1 = obtenerDatos("Introduce tu contraseña de nuevo: ", Patron.PATRON_CONTRA.getPattern());

            if (!contra.equals(contra1)) {
                System.out.println("Las contraseñas no coinciden. Inténtalo de nuevo.");
            } else {
                contraConfirmada = true;
            }
        }

        Usuario usuario = new Usuario(nombre, email, ip, telefono, nick, contra);

        System.out.println("¿Quiere registrar este usuario en el sistema (S/N)?");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("S")) {
            registrarUsuario(usuario, fichero);
            System.out.println("clases.Usuario registrado");
        } else {
            System.out.println("No se ha registrado el usuario");
        }
    }


    public static String obtenerDatos(String texto, String patron) {
        String datos;

        do {
            System.out.print(texto);
            datos = sc.nextLine();

            if (!Pattern.matches(patron, datos)) {
                System.out.println("Formato incorrecto");
            }
        } while (!Pattern.matches(patron, datos));

        return datos;
    }

    public static void registrarUsuario(Usuario usuario, File fichero) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fichero))) {
            writer.write(usuario.getNombre() + ";" + usuario.getEmail() + ";" + usuario.getIp() + ";" + usuario.getTelefono() + ";" + usuario.getNick() + ";" + usuario.getContra() + "\n");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}