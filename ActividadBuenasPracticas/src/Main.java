import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num = sc.nextInt();
        int sumafinal=suma(num);
        System.out.println(mensaje()+":"+sumafinal);

    }
    public static int suma(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            contador +=i;
        }
            return contador;
    }

    public static String mensaje(){
        return"La suma final es";
    }
}