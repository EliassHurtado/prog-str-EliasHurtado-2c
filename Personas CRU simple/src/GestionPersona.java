public class GestionPersona {
    private Persona[] personas = new Persona[20];
    private int contador = 0;

    public boolean agregarPersona(int id, String nombre) {
        if (contador >= 20) {
            System.out.println("Error: No hay mas espacio en el arreglo.");
            return false;
        }
        // Validar ID repetido
        for (int i = 0; i < contador; i++) {
            if (personas[i].id == id) {
                System.out.println("Error: El ID ya existe.");
                return false;
            }
        }
        personas[contador] = new Persona(id, nombre);
        contador++;
        return true;
    }

    public void buscarPersona(int id) {
        for (int i = 0; i < contador; i++) {
            if (personas[i].id == id && personas[i].activa) {
                System.out.println("Resultado: ID " + personas[i].id + " - Nombre: " + personas[i].nombre);
                return;
            }
        }
        System.out.println("Persona no encontrada o esta inactiva.");
    }

    public void bajaLogica(int id) {
        for (int i = 0; i < contador; i++) {
            if (personas[i].id == id) {
                personas[i].activa = false;
                System.out.println("Se dio de baja correctamente.");
                return;
            }
        }
        System.out.println("No se encontro el ID.");
    }

    public void listarActivas() {
        System.out.println("--- LISTA DE PERSONAS ACTIVAS ---");
        for (int i = 0; i < contador; i++) {
            if (personas[i].activa) {
                System.out.println("ID: " + personas[i].id + " | Nombre: " + personas[i].nombre);
            }
        }
    }

    public void actualizarNombre(int id, String nuevoNombre) {
        for (int i = 0; i < contador; i++) {
            if (personas[i].id == id && personas[i].activa) {
                personas[i].nombre = nuevoNombre;
                System.out.println("Nombre actualizado con exito.");
                return;
            }
        }
        System.out.println("No se puede actualizar (ID no existe o esta inactivo).");
    }
}