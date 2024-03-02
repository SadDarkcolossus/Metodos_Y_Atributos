public class CalculadoraDeCalificaciones {
    public double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados(Alumno alumno) {
        double promedio = calcularPromedio(alumno.getCalificaciones());
        char calificacion = obtenerCalificacion(promedio);

        System.out.println("Nombre del estudiante: " + alumno.getNombre());
        for (int i = 0; i < alumno.getCalificaciones().length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + alumno.getCalificaciones()[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
