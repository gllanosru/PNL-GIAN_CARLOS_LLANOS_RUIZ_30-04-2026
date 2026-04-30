public class Paciente extends Persona {
    String historial_medico;

    public Paciente(String nombre, int edad, String genero, String identificación){
        super(nombre, edad, genero, identificación);
        this.historial_medico = "";
        }

        public void agregar_historial(String motivo, String detalle){
            this.historial_medico += "-" + motivo + "-" + detalle;
            System.out.println("//El historial medico//"+ "- " + motivo + ": " + detalle );
        }
        public void mostrar_historial(){
            System.out.println("Historial de " + nombre + "/n" + historial_medico);
        }
    }

