import java.util.Scanner;

public class Validator {
    Scanner leer = new Scanner(System.in);

    public static String leerTextoNoVacio(Scanner leer, String msg) {
        System.out.print(msg);
        String texto = leer.nextLine().trim();
        while (texto.isEmpty()) {
            System.out.println("Debes ingresar el nombre");
            System.out.print(msg);
            texto = leer.nextLine().trim();
        }
        return texto;
    }

    public static double leerDoubleEnRango(Scanner leer, String msg) {
        while(true) {
            System.out.println(msg);
            if (leer.hasNextInt()) {
                int valor = leer.nextInt();
                if (valor > 0) {
                    return valor;
                }

                System.out.println("Valor Inválido: el numero no es positivo");
            } else {
                System.out.println("Valor Inválido: el valor no es numerico");
                leer.next();
            }
        }
    }

    public static int leerIntEnRango(Scanner leer, String msg) {
        while(true) {
            System.out.println(msg);
            if (leer.hasNextInt()) {
                int valor = leer.nextInt();
                if (valor > 0) {
                    return valor;
                }
                System.out.println("Valor Inválido: el numero no es positivo");
            } else {
                System.out.println("Valor Inválido: el valor no es numerico");
                leer.next();
            }
        }
    }

    public static boolean leerBoolean(Scanner leer, String msg) {
        while (true) {
            System.out.print(msg);
            String input = leer.next().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Inválido: debe escribir true o false: ");
        }
    }

    public void imprimirReporte(String nombre, double promedio1, double promedio2, double promedio3,double promedio, int asistencia, boolean proyecto, double calificacionfinal, String estado) {
        System.out.println("-----REPORTE DE CALIFICACIONES------");
        System.out.println("Nombre del Alumno :" + nombre);
        System.out.println("Calificacion de Parciales :"+"\n"+promedio1+"\n"+ promedio2 +"\n"+ promedio3);
        System.out.println("Promedio de Parciales :"+ promedio);
        System.out.println("Porcentaje de Asistencia :" + asistencia + "%");
        System.out.println("¿Proyecto Entregado? :" +proyecto);
        System.out.println("Promedio Final :"+calificacionfinal);
        System.out.println("Estado:" + estado);
    }
}