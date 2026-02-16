public class GestorAlumnos {
    private Alumno[] alumnos = new Alumno[25];
    private int contador = 0;

    public boolean agregarAlumno(int id, String nombre, double promedio) {
        if (contador < alumnos.length && buscarIndice(id) == -1) {
            alumnos[contador++] = new Alumno(id, nombre, promedio);
            return true;
        }
        return false;
    }

    public int buscarIndice(int id) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].getId() == id) return i;
        }
        return -1;
    }

    public Alumno getAlumno(int index) {
        if (index >= 0 && index < contador) return alumnos[index];
        return null;
    }

    public void listarActivos() {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].isActivo()) System.out.println(alumnos[i]);
        }
    }

    public void mostrarReportes() {
        int activos = 0, excelentes = 0;
        double suma = 0;
        Alumno mayor = null, menor = null;

        for (int i = 0; i < contador; i++) {
            Alumno a = alumnos[i];
            if (a.isActivo()) {
                activos++;
                suma += a.getPromedio();
                if (a.getPromedio() >= 8.0) excelentes++;
                if (mayor == null || a.getPromedio() > mayor.getPromedio()) mayor = a;
                if (menor == null || a.getPromedio() < menor.getPromedio()) menor = a;
            }
        }

        if (activos == 0) {
            System.out.println("No hay datos para reportes.");
            return;
        }

        System.out.println("--- RESULTADOS ---");
        System.out.println("Promedio General: " + (suma / activos));
        System.out.println("Mejor: " + mayor);
        System.out.println("Peor: " + menor);
        System.out.println("Alumnos >= 8.0: " + excelentes);
    }
}