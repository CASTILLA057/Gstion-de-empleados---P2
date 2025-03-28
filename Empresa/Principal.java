package Empresa;

import Empleados.Desarrollador;
import Empleados.Diseñador;
import Empleados.Empresa;
import Empleados.Gerente;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(new Gerente("Santiago", 5000, "Administración", 1000));
        empresa.agregarEmpleado(new Desarrollador("Castilla", 3000, "TI", 10, 50));
        empresa.agregarEmpleado(new Diseñador("Coronel", 2800, "Diseño", 300));

        System.out.println("Lista de empleados:");
        empresa.mostrarEmpleados();

        System.out.println("Nómina total: " + empresa.calcularNominaTotal());
    }
}
