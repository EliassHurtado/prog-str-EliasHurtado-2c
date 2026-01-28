import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int decision;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Menú de Operaciones");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular el área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular el área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Escribe el número de su opción: ");
            decision= leer.nextInt();

            switch (decision) {
                case 1:
                    System.out.print("Escriba el peso en kg:");
                    double peso = leer.nextDouble();
                    System.out.print("Escriba la estatura en m:");
                    double estatura= leer.nextDouble();
                    CalcularIMC(peso, estatura);
                    break;
                case 2:
                    System.out.print("Escriba la base:");
                    double base = leer.nextDouble();
                    System.out.print("Escriba la altura:");
                    double altura = leer.nextDouble();
                    CalcularAreaRectangulo(base, altura);
                    break;
                case 3:
                    System.out.print("Ingrese la temperatura en °C:");
                    double gradosC = leer.nextDouble();
                    ConvertirCaF(gradosC);
                    break;
                case 4:
                    System.out.print("Escriba el radio del círculo: ");
                    double radio = leer.nextDouble();
                    CalcularAreaCirculo(radio);
                    break;
                case 5:
                    System.out.println("Hasta Luego");
                    break;
                default:
                    System.out.println("Opción no encontrada");
            }
            System.out.println();
        } while (decision != 5);
    }

    /**
     * Metodo que da el IMC de una persona con sus datos de estatura y peso
     *@param peso Toma el valor del peso de la persona
     *@param estatura Toma el valor de la estatura de la persona
     *@return El valor del IMC total
     */
    public static double CalcularIMC(double peso, double estatura) { /*Metodo que calcula el IMC*/
        double imc=peso/(estatura*estatura);
        System.out.println("Tu IMC es:" + imc);
        return imc;
    }
    /**
     * Metodo que calcula el area de un rectángulo pidiendo la base y altura y devolviendo el area total
     *@param base Recibe el valor de la base del rectángulo
     *@param altura Toma el valor de la altura del rectángulo
     *@return El valor final del area del rectángulo
     */
    public static double CalcularAreaRectangulo(double base, double altura) { /*Metodo para calcular el área de un rectángulo*/
        double area = base * altura;
        System.out.println("El area del rectángulo es: " + area);
        return area;
    }
    /**
     * Metodo que cambia la temperatura en °C a °F
     *@param gradosC Recibe el valor de la temperatura en °C
     *@return El valor de la temperatura en °F
     */
    public static double ConvertirCaF(double gradosC) {
        double gradosF = (gradosC*9/5)+32;
        System.out.println(gradosC + "La temperatura en °F es: " + gradosF + "°F");
        return gradosF;
    }
    /**
     * Metodo que calcula el area de un círculo pidiendo el radio y devolviendo el resultado
     *@param radio Recibe el valor del radio del círculo
     *@return El valor del área del círculo
     */
    public static double CalcularAreaCirculo(double radio) {
        double area = Math.PI*(radio*radio);
        System.out.println("El área del circulo es: " + area);
        return area;
    }
}