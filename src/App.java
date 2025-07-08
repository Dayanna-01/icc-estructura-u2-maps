import controllers.Mapa;

public class App {
    public static void main(String[] args) {
        // Ejecuta el ejemplo de uso de HashMap, LinkedHashMap y TreeMap
        runMapExample();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjercicios();
    }

    private static void runMapExample() {
        System.out.println("====== EJEMPLOS DE MAPAS ======");
        System.out.println(" Dayanna Chacha");
        System.out.println("No compila actualizado el programa");
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjercicios() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
