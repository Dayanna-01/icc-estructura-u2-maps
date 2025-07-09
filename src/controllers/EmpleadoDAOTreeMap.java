package controllers;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        this.empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
    }

    @Override
    public void remove(int id) {
        empleados.remove(id);
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado emp : empleados.values()) {
                System.out.println(emp);
            }
        }
    }
}
