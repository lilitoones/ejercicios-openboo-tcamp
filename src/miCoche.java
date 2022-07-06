// Crear una clase coche
// Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene
// Una función que incremente el número de puertas que tiene el coche
// Crear un objeto miCoche en el main y añadirle una puerta
// Mostrar el número de puertas que tiene el objeto

//inicio segundo ejercicio introducción a la programación

public class miCoche {
    private int numeroPuertas;

    public miCoche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;

    }

    public void addPuertas(int numeroPuertas) {
        this.numeroPuertas += numeroPuertas;
    }

    public void printInfo() {
        System.out.println("Puertas:" + numeroPuertas);
    }

    public static void main(String[] args) {
        miCoche coche = new miCoche(2);
        coche.addPuertas(2);
        coche.printInfo();
    }
}

//fin segundo ejercicio introducción a la programación
//