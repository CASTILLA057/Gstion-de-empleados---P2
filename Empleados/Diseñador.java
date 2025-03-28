package Empleados;

public class Diseñador extends Empleado {
    private double incentivoCreativo;

    public Diseñador(String nombre, double salario, String departamento, double incentivoCreativo) {
        super(nombre, salario, departamento);
        this.incentivoCreativo = incentivoCreativo;
    }

    @Override
    public double calcularSalario() {
        return salario + incentivoCreativo;
    }
}
