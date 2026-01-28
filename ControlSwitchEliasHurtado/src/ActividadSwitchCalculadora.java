import java.util.Scanner;
public class  ActividadSwitchCalculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        double variableA;
        double variableB;
        double resultado;
        System.out.println("Bienvenido a tu calculadora");
        System.out.println("Menú(Elige el numero de tu elección)");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("Escriba su opción");
        opcion = leer.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("SUMA");
                System.out.println("Ingresa el primer valor");
                variableA = leer.nextDouble();
                System.out.println("Ingrese el segundo valor");
                variableB = leer.nextDouble();
                resultado = variableA + variableB;
                System.out.println("===================================");
                System.out.println("Valores ingresados:"+ variableA + " y " +variableB);
                System.out.println("El resultado es: " +resultado);
                break;
            case 2:
                System.out.println("RESTA");
                System.out.println("Ingresa el primer valor");
                variableA = leer.nextDouble();
                System.out.println("Ingrese el segundo valor");
                variableB = leer.nextDouble();
                resultado = variableA - variableB;
                System.out.println("===================================");
                System.out.println("Valores ingresados:"+ variableA + " y " +variableB);
                System.out.println("El resultado es: " +resultado);
                break;
            case 3:
                System.out.println("MULTIPLICACIÓN");
                System.out.println("Ingresa el primer valor");
                variableA = leer.nextDouble();
                System.out.println("Ingrese el segundo valor");
                variableB = leer.nextDouble();
                resultado = variableA * variableB;
                System.out.println("===================================");
                System.out.println("Valores ingresados:"+ variableA + " y " +variableB);
                System.out.println("El resultado es: " +resultado);
                break;
            case 4:
                System.out.println("DIVISIÓN");
                System.out.println("Ingresa el primer valor");
                variableA = leer.nextDouble();
                System.out.println("Ingrese el segundo valor");
                variableB = leer.nextDouble();
                if (variableB==0) {
                    System.out.println("No se puede dividir entre 0");
                    break;
                }
                resultado = variableA / variableB;
                System.out.println("===================================");
                System.out.println("Valores ingresados:"+ variableA + " y " +variableB);
                System.out.println("El resultado es: " +resultado);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}
