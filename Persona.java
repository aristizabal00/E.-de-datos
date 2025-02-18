import java.util.Arrays;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos para obtener el nombre y la edad
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Sobrescribimos el método compareTo para ordenar por nombre
    @Override
    public int compareTo(Persona otraPersona) {
        // Ordenar por nombre
        return this.nombre.compareTo(otraPersona.getNombre());
    }

    // Sobrescribir el método toString para mostrar la persona
    @Override
    public String toString() {
        return "Persona(nombre=" + nombre + ", edad=" + edad + ")";
    }

    // Método principal (main) para ejecutar el programa
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Carlos", 25),
            new Persona("Luia", 30),
            new Persona("ANA", 22),
            new Persona("Julia", 28),
            new Persona("Pedro", 35),
            new Persona("Marta", 27),
            new Persona("Sofia", 24),
            new Persona("David", 40),
            new Persona("Lucía", 29),
            new Persona("David", 26)
        };

        // Ordenar las personas por nombre usando el método compareTo de Comparable
        Arrays.sort(personas);

        // Imprimir el arreglo de personas ordenado por nombre
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
