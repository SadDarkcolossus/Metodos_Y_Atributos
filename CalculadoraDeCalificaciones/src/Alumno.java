public class Alumno {
    private String nombre;
    private double[] calificaciones;

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }
}
