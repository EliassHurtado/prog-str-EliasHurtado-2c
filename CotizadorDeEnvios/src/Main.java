import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShippingCalculator calculator = new ShippingCalculator();
        InputValidator validator=new InputValidator();

        double peso = validator.leerDoubleEnRango(sc,"Ingrese el peso (0.1 a 50.0 kg): ");
        int distancia = validator.leerIntEnDistancia(sc, "Ingrese la distancia (1 a 2000 km): ");
        int servicio = validator.leerIntEnServicio(sc, "Seleccione el tipo de servicio (1-Estándar, 2-Express): ",1,2);
        boolean remota = validator.leerBoolean(sc, "¿Es Zona Remota? (true=verdadero/false=falso): ");

        double subtotal = calculator.calcularSubtotal(peso, distancia,servicio, remota);
        double iva = calculator.calcularIVA(subtotal);
        double total = calculator.calcularTotal(subtotal, iva);

        validator.imprimirTicket(servicio, peso, distancia, remota, subtotal, iva, total);
    }

}
