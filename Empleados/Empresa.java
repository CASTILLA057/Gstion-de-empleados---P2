package Empleados;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public double calcularNominaTotal() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }
}
