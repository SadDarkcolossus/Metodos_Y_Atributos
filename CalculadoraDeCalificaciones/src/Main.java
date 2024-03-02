//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] calificaciones = {85.5, 90.0, 78.0, 92.0, 88.0};
        Alumno alumno = new Alumno("Jean", calificaciones);
        CalculadoraDeCalificaciones calculadora = new CalculadoraDeCalificaciones();
        calculadora.imprimirResultados(alumno);

    }
}