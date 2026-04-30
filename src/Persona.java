public class Persona {
    String nombre;
    int edad;
    String genero;
    String identificación;

    //Cree un constructor:
    public Persona (String nombre, int edad, String genero, String identificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificación = identificacion;

    }
    public void mostrar_informacion(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("Identifiacición: " + identificación);
    }

}
