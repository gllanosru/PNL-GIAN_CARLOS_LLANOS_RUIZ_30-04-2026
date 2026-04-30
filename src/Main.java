public class Main {
    public static void main(String[] args) {

        Doctor doc = new Doctor("Gian Carlos", 23, "M", "D001", "General", "L123");
        Paciente pac = new Paciente("Juan Perez", 25, "M", "R001");

        pac.agregar_historial("Gripe", "Tomar descanso");
        doc.agregar_paciente(pac);

        Cita cita = new Cita(pac, doc, "20/05/2024", "10:00", "Chequeo");


        pac.mostrar_informacion();
        pac.mostrar_historial();
        doc.mostrar_pacientes();
        cita.detalles_cita();

    }
}