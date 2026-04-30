public class Cita {
    Paciente paciente;
    Doctor doctor;
    String fecha;
    String hora;
    String motivo;

    public Cita(Paciente paciente, Doctor doctor, String fecha, String hora, String motivo) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        }

        public void detalles_cita() {
            System.out.println("CITA: " + fecha + " a las " + hora);
            System.out.println("Paciente: " + paciente.nombre + " | Doctor: " + doctor.nombre);
            System.out.println("Motivo: " + motivo);
        }

        public void cambiar_fecha_hora(String nueva_fecha, String nueva_hora) {
            this.fecha = nueva_fecha;
            this.hora = nueva_hora;
        }
    }
