
// Abstracción (capacidad de crear una clase con propiedades y métodos)
class Ave {

    // Encapsulamiento (Por hacer uso de private )
    private String nombre;
    private double peso;
    private double envergaduraAlas;

    // Constructor
    // Polimorfismo (Es que un mismo método ejecute diferentes tareas)

    public Ave(String nombre, double peso, double envergaduraAlas) {
        this.nombre = nombre;
        this.peso = peso;
        this.envergaduraAlas = envergaduraAlas;
    }

    public Ave(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.envergaduraAlas = 1.0; // Valor por defecto
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEnvergaduraAlas(double envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    // Métodos adicionales
    public void volar() {
        System.out.println(nombre + " está volando con una envergadura de " + envergaduraAlas + " metros.");
    }

    public void cantar() {
        System.out.println(nombre + " está cantando.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Peso: " + peso + " kg, Envergadura de alas: " + envergaduraAlas + " metros.");
    }

    public boolean esAveGrande() {
        return envergaduraAlas > 2.0;
    }
}

