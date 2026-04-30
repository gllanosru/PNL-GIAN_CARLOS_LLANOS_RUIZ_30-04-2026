public class Doctor extends Persona {
    String especialidad;
    String numero_de_licencia;
    String listaPacientes;

    public Doctor(String nombre, int edad, String genero, String identificacion, String especialidad, String licencia) {
        super(nombre, edad, genero, identificacion);
        this.especialidad = especialidad;
        this.numero_de_licencia = licencia;
        this.listaPacientes = "";
        }

        public void agregar_paciente(Paciente paciente) {
            this.listaPacientes += paciente.nombre + ", ";
        }

        public void mostrar_pacientes() {
            System.out.println("Pacientes del Dr. " + nombre + ": " + listaPacientes);
        }
    }