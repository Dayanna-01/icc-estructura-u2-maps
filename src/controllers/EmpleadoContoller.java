package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados = new HashMap<>();

    public void agregarEmpleado(Empleado emp) {
        empleados.put(emp.getId(), emp);
    }

    public Empleado buscarEmpleado(int id) {
        return empleados.get(id);
    }

    public void listarEmpleados() {
        for (Empleado e : empleados.values()) {
            System.out.println(e);
        }
    }
}