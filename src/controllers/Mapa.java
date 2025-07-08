package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {

    public Mapa() {
    }

    public void ejemploConHashMap() {
        System.out.println("\n--- HashMap con capitales ---");
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");

        System.out.println("Paises disponibles: " + capitales.keySet());
        for (String pais : capitales.keySet()) {
            System.out.println("País: " + pais + ", Capital: " + capitales.get(pais));
        }

        // Ejemplo de acceso directo
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capital);
        System.out.println("----------------");

        // HashMap con objetos Empleado
        System.out.println("\n--- HashMap con Empleados (clave: ID) ---");
        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñador"));

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        System.out.println("----------------");

        // HashMap con objeto Empleado como clave
        System.out.println("\n--- HashMap con Empleado como clave ---");
        Map<Empleado, Integer> empleadosDos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(2, "Ana", "Dev"); 
        Empleado emp4 = new Empleado(2, "Ana", "Dev"); 

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500); 
        empleadosDos.put(emp4, 2000); 

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()) {
        System.out.println(entry.getKey() + " --> $" + entry.getValue());
    }
    }

    public void ejemploConLinkedHashMap() {
        System.out.println("\n--- LinkedHashMap con productos ---");
        LinkedHashMap<String, Double> productos = new LinkedHashMap<>();
        productos.put("Manzana", 0.75);
        productos.put("Pan", 1.50);
        productos.put("Leche", 2.10);
        productos.put("Queso", 3.25);
        productos.put("Huevo", 0.10);

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ", Precio: $" + entry.getValue());
        }
    }

    public void ejemploConTreeMap() {
        System.out.println("\n--- TreeMap con personas ordenadas por ID ---");
        TreeMap<Integer, String> personas = new TreeMap<>();
        personas.put(103, "Laura");
        personas.put(101, "Carlos");
        personas.put(105, "Ana");
        personas.put(102, "Miguel");
        personas.put(104, "Beatriz");

        for (Map.Entry<Integer, String> entry : personas.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }

        // Acceso directo
        int idBuscado = 102;
        if (personas.containsKey(idBuscado)) {
            System.out.println("\nPersona con ID " + idBuscado + ": " + personas.get(idBuscado));
        }
    }
}
