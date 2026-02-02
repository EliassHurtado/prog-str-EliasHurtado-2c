import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int decision,contadorOper=0;
        double valor1,resultado;
        int contCaF=0,contFaC=0,contKmMi=0,contMiKm=0;

        do {
            System.out.println("-----------------------------------");
            System.out.println("Bienvenido al menú de Conversiones");
            System.out.println("1= Convertir °C a °F");
            System.out.println("2= Convertir °F a °C");
            System.out.println("3= Convertir km a millas");
            System.out.println("4= Convertir millas a km");
            System.out.println("5= Salir");
            System.out.println("Escriba el número de la opción deseada:");
            decision = leer.nextInt();

            switch(decision){
                case 1:
                    System.out.println("-----------------------------------");
                    System.out.println("CONVERSIÓN °C a °F");
                    System.out.println("Ingresa la temperatura en °C a convertir");
                    valor1 = leer.nextDouble();
                    resultado = (1.8*valor1)+32;
                    System.out.println(valor1+" °C "+" = "+resultado+" °F ");
                    contadorOper++;
                    contCaF++;
                    break;

                case 2:
                    System.out.println("-----------------------------------");
                    System.out.println("CONVERSIÓN °F a °C");
                    System.out.println("Ingresa la temperatura en °F a convertir");
                    valor1 = leer.nextDouble();
                    resultado = (valor1-32)/1.8;
                    System.out.println(valor1+" °F "+" = "+resultado+" °C ");
                    contadorOper++;
                    contFaC++;
                    break;

                case 3:
                    System.out.println("-----------------------------------");
                    System.out.println("CONVERSIÓN km a millas");
                    System.out.println("Ingresa la distancia en km a convertir");
                    valor1 = leer.nextDouble();
                    resultado = valor1/1.60934;
                    System.out.println(valor1+" km "+" = "+resultado+" millas ");
                    contadorOper++;
                    contKmMi++;
                    break;


                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("CONVERSIÓN millas a km");
                    System.out.println("Ingresa la distancia en millas a convertir");
                    valor1 = leer.nextDouble();
                    resultado = valor1*1.60934;
                    System.out.println(valor1+" millas "+" = "+resultado+" km ");
                    contadorOper++;
                    contMiKm++;
                    break;

                case 5:
                    System.out.println("-----------------------------------");
                    System.out.println("¡GRACIAS POR TU VISITA!  :D");
                    break;

                default:
                    System.out.println("Opción inválida");
                    System.out.println("Intente de nuevo con una opción válida");

            }
        }
        while (decision!=5);

        System.out.println("---------------------------------------------");
        System.out.println("-----------HISTORIAL DE OPERACIONES----------");
        System.out.println("CONVERSIONES °C a °F: "+contCaF);
        System.out.println("CONVERSIONES °F a °C: "+contFaC);
        System.out.println("CONVERSIONES km a millas: "+contKmMi);
        System.out.println("CONVERSIONES millas a km: "+contMiKm);
        System.out.println("TOTAL DE OPERACIONES REALIZADAS: "+contadorOper);
        System.out.println("¡Adiós!");
    }
}
