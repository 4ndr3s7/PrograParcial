public class punto3_6 {

    public static void asignarHoras(int[] horasDisponibles, int horasRequeridas) {
        int totalHorasAsignadas = 0;

        for (int i = 0; i < horasDisponibles.length; i++) {

            int horasAsignadas = Math.min(40, Math.min(horasDisponibles[i], horasRequeridas - totalHorasAsignadas));

            System.out.println("Empleado " + (i + 1) + ": " + horasAsignadas + " horas");
            totalHorasAsignadas += horasAsignadas;

            if (totalHorasAsignadas >= horasRequeridas) {
                break;
            }
        }


        if (totalHorasAsignadas < horasRequeridas) {
            System.out.println("No se pudieron asignar todas las horas requeridas.");
        } else {
            System.out.println("Horas asignadas correctamente.");
        }
    }

    public static void main(String[] args) {

        int[] horasDisponibles = {20, 35, 25, 50};
        int horasRequeridas = 100;

        asignarHoras(horasDisponibles, horasRequeridas);
    }
}
