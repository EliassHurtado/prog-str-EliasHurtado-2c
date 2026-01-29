import java.util.Scanner;
public class ActividadIfElseTarifa {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int edad;
        int tarifa = 0;
        boolean esEstudiante;
        System.out.println("Ingrese la edad del estudiante");
        edad = leer.nextInt();
        System.out.println("¿Eres estudiante? Escriba true(Verdadero) o false(Falso)");
        esEstudiante = leer.nextBoolean();
        if (edad <= 0 || edad >120) {
            System.out.println("Edad inválida");
            return;
        }
            else if(edad < 12){
                tarifa = 50;
        }
            if (edad>=12 && edad <=17){
                if (esEstudiante==true){
                    tarifa = 60;
                }
                else if (esEstudiante==false) {
                    tarifa = 80;
                }
            }
            if (edad >=18){
                if (esEstudiante==true){
                    tarifa = 90;
                }
                else if (esEstudiante==false) {
                    tarifa = 120;
                }
            }
            System.out.println("---------------------------------");
            System.out.println("Edad ingresada:"+edad);
            System.out.println("Estudiante:"+esEstudiante);
            System.out.println("Tarifa final:"+tarifa);
    }
}
