package controllers;

import models.Empleado;

import java.util.HashMap;
import java.util.Map;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados = new HashMap<>();

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
