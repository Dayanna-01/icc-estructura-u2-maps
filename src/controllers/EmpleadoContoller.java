package controllers;

import java.util.HashMap;
import java.util.Map;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller  {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO){
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp){
        empleadoDAO.add(emp);
    }

    public void eliminarEmpleado(int codigo){
        empleadoDAO.eliminar(codigo);
    }

    public void listarEmpleados(){
        empleadoDAO.listar();
    }
}