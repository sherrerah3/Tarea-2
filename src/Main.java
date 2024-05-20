public class Main {
    public static void main(String[] args) {

        //La herencia es la capacidad de crear clases y objetos en base a otras clases
        Ave ave1 = new Ave("Águila", 5.0, 2.3);
        Ave ave2 = new Ave("Colibrí", 0.5, 0.11);
        Ave ave3 = new Ave("Pato", 1.2, 0.75);
        Ave ave4 = new Ave("Búho", 2.1, 1.4);
        Ave ave5 = new Ave("Pingüino", 25.0);

        Admin manejador = new Admin();
        manejador.agregarAve(ave1);
        manejador.agregarAve(ave2);
        manejador.agregarAve(ave3);
        manejador.agregarAve(ave4);
        manejador.agregarAve(ave5);

        manejador.mostrarAves();

        ave1.volar();
        ave2.cantar();

        System.out.println("\nTamaño de las aves:\n");
        System.out.println(ave1.getNombre() + " es un ave grande? " + (ave1.esAveGrande() ? "Sí" : "No"));
        System.out.println(ave2.getNombre() + " es un ave grande? " + (ave2.esAveGrande() ? "No" : "Sí"));
    }
}