import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorAlumnos sistema = new GestorAlumnos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Alta");
            System.out.println("2. Buscar");
            System.out.println("3. Actualizar");
            System.out.println("4. Baja");
            System.out.println("5. Listar");
            System.out.println("6. Reportes");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID > 0: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nom = sc.nextLine();

                    System.out.print("Promedio (0-10): ");
                    double prom = sc.nextDouble();
                    sc.nextLine();

                    if (id > 0 && !nom.trim().isEmpty() && prom >= 0 && prom <= 10) {
                        if (sistema.agregarAlumno(id, nom, prom))
                            System.out.println("Resgistrado con Éxito.");
                        else System.out.println("Error: ID repetido o sin espacio.");
                    } else {
                        System.out.println("Datos inválidos (Nombre vacío o valores fuera de rango).");
                    }
                    break;

                case 2:
                    System.out.print("ID a buscar: ");
                    int idB = sc.nextInt();
                    sc.nextLine();
                    int idxB = sistema.buscarIndice(idB);
                    if (idxB != -1 && sistema.getAlumno(idxB).isActivo())
                        System.out.println(sistema.getAlumno(idxB));
                    else System.out.println("No encontrado o inactivo.");
                    break;

                case 3:
                    System.out.print("ID a actualizar: ");
                    int idA = sc.nextInt();
                    sc.nextLine();
                    int idxA = sistema.buscarIndice(idA);
                    if (idxA != -1 && sistema.getAlumno(idxA).isActivo()) {
                        System.out.print("Nuevo promedio: ");
                        double np = sc.nextDouble();
                        sc.nextLine();
                        if (np >= 0 && np <= 10) {
                            sistema.getAlumno(idxA).setPromedio(np);
                            System.out.println("Actualizado.");
                        }
                    } else System.out.println("Alumno no encontrado.");
                    break;

                case 4:
                    System.out.print("ID para baja lógica: ");
                    int idD = sc.nextInt();
                    sc.nextLine();
                    int idxD = sistema.buscarIndice(idD);
                    if (idxD != -1) {
                        sistema.getAlumno(idxD).setActivo(false);
                        System.out.println("Baja realizada.");
                    }
                    break;

                case 5: sistema.listarActivos(); break;
                case 6: sistema.mostrarReportes(); break;
            }
        } while (opcion != 0);
    }
}