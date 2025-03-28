package Empleados;

class Empleado {

    protected String nombre;
    protected double salario;
    protected String departamento;

    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public double calcularSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Departamento: " + departamento + ", Salario: " + calcularSalario();
    }
}