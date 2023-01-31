public class Main {

    public static void main(String args[]) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        // Creo un objeto de la clase "Cliente" que tiene como propiedades el nombre, la edad, el telefono y el credito, le doy valor y lo muestro por pantalla:
        cliente.nombre = "Luis";
        cliente.edad = 52;
        cliente.telf = 698541235;
        cliente.credito = 10000;
        System.out.println("Hola! Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi número es " + cliente.telf
                + ". Mi crédito disponible es $" + cliente.credito + " euros.");

        // Hago lo mismo con la clase "Trabajador", hereda de "Persona" con la variable "salario" que solo le pertenece a esta clase:
        trabajador.nombre = "Jose";
        trabajador.edad = 55;
        trabajador.telf = 658987412;
        trabajador.salario = 15000;
        System.out.println("Hola. Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi número de celular es " + trabajador.telf
                + ". Mi salario es de $" + trabajador.salario + " euros.");
    }
}

// Creo clase "Persona" y sus tres variables:
class Persona {
    String nombre;
    int edad;
    int telf;
}

// Creo nueva clase "Cliente" que hereda sus atributos de la superclase "Persona". Esta nueva clase tiene la variable "credito" solo para ella:
class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}

