package Empleados;

public class Desarrollador extends Empleado {
    private int horasExtras;
    private double pagoPorHoraExtra;

    public Desarrollador(String nombre, double salario, String departamento, int horasExtras, double pagoPorHoraExtra) {
        super(nombre, salario, departamento);
        this.horasExtras = horasExtras;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salario + (horasExtras * pagoPorHoraExtra);
    }
}
