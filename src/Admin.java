import java.util.ArrayList;

// Abstracción (capacidad de crear una clase con propiedades y métodos)
// Clase que maneja múltiples instancias de Ave
class Admin {
    private ArrayList<Ave> aves;

    // Constructor
    public Admin() {
        aves = new ArrayList<>();
    }

    // Método para añadir una ave al ArrayList
    public void agregarAve(Ave ave) {
        aves.add(ave);
    }

    // Método para mostrar información de todas las aves
    public void mostrarAves() {
        for (Ave ave : aves) {
            ave.mostrarInfo();
        }
    }
}
