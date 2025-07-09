package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {

    public Mapa() {
    }
    public void ejemploConLinkedHashMap() {
        System.out.println();
        System.out.println("Ejemplo con LinkedHashMap");
        System.out.println("===================================");

        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Carro", 200);
        productos.put("Moto", 780);
        productos.put("Motoneta", 440);
        productos.put("Bugatti", 410);
        productos.put("Policia", 50);
        productos.put("Camion", 50);

        System.out.println("Mapa de productos:");
        for (String producto : productos.keySet()) {
            System.out.println("Producto: " + producto + ", Precio: " + productos.get(producto));
        }
        Integer precioCarro = productos.get("Carro");
        System.out.println("El precio del Carro es: " + precioCarro);
    }

    public void ejemploConHashMap() {
        System.out.println("Ejemplo con HashMap");
        System.out.println("===================================");

        Map<String, String> capitales = new HashMap<>();
        System.out.println();
        capitales.put("Ecuador", "Quito");
        capitales.put("Perú", "Lima");
        capitales.put("Colombia", "Bogotá");

        System.out.println("Mapa de capitales:");
        for (String pais : capitales.keySet()) {
            System.out.println("País: " + pais + ", Capital: " + capitales.get(pais));
        }
        String capitalEcuador = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capitalEcuador);
        System.out.println();
        // Mapa con Integer -> Empleado
        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester")); 

        System.out.println();
        System.out.println("Mapa de empleados (Integer -> Empleado):");
        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Mapa con Empleado -> Integer
        Map<Empleado, Integer> empleados2 = new HashMap<>();
        empleados2.put(new Empleado(3, "Pedro", "Tester"), 1000);
        empleados2.put(new Empleado(1, "Ana", "Dev"), 1200);
        empleados2.put(new Empleado(1, "Ana", "Dev"), 1700); 
        empleados2.put(new Empleado(1, "Ana", "Dev"), 7200); 

        System.out.println();
        System.out.println("Mapa de empleados (Empleado -> Integer):");
        for (Map.Entry<Empleado, Integer> entry : empleados2.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

    }

    public void ejemploConTreeMap() {
        System.out.println();
        System.out.println("Ejemplo con TreeMap");
        System.out.println("===================================");

        // TreeMap ordena por clave de forma natural
        Map<Integer, String> personas = new TreeMap<>();
        personas.put(1, "Dayanna");
        personas.put(2, "Cecilia");
        personas.put(3, "Alejandro");
        personas.put(4, "Paola");

        System.out.println("Mapa de personas (ordenado por código):");
        for (int codigo : personas.keySet()) {
            System.out.println("Código: " + codigo + ", Nombre: " + personas.get(codigo));
        }

        String nombre = personas.get(1);
        System.out.println("La persona con código 1 es: " + nombre);

        // TreeMap con Empleado como clave
        Map<Empleado, Integer> empleadosTree = new TreeMap<>();
        empleadosTree.put(new Empleado(3, "Pedro", "Tester"), 1000);
        empleadosTree.put(new Empleado(1, "Ana", "Dev"), 1200);
        empleadosTree.put(new Empleado(1, "Ana", "Dev"), 1700); 
        empleadosTree.put(new Empleado(1, "Ana", "Dev"), 7200); 

        System.out.println();
        System.out.println("Mapa de empleados (TreeMap - Empleado -> Integer):");
        for (Map.Entry<Empleado, Integer> entry : empleadosTree.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
