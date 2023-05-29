import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de NewList
        //NewList<String[]> newList = new NewList<>();

        // Nombre del archivo CSV a importar
        //String fileName = "aumentadoList.csv";

        // Importar el archivo CSV a la lista
        //newList.importFromCSV(fileName);

        // Recorrer la lista e imprimir los datos
        /*
        SomeNode<String[]> current = newList.getHead();
        while (current != null) {
            String[] rowData = current.getData();
            for (String value : rowData) {
                System.out.print(value + " ");
            }
            System.out.println();
            current = current.getNext();
        }
        */
        // Ordenar la lista por apellido paterno
        //newList.sort();
        // Crear una instancia de NewList<Asistente>
        NewList<Asistente> newList = new NewList<>();

        // Nombre del archivo CSV a importar
        String fileName = "aumentadoList.csv";

        // Importar el archivo CSV a la lista
        newList.importFromCSV(fileName);

        // Ordenar la lista por apellido paterno
        newList.sort();

        // Recorrer la lista e imprimir los datos ordenados
        SomeNode<Asistente> current = newList.getHead();
        while (current != null) {
            Asistente asistente = current.getData();
            System.out.println("Nombre: " + asistente.getNombre());
            System.out.println("Apellido Paterno: " + asistente.getApellidoPaterno());
            System.out.println("DNI: " + asistente.getDni());
            System.out.println("Email: " + asistente.getEmail());
            System.out.println("Fecha de Nacimiento: " + asistente.getBirth());
            System.out.println();
            current = current.getNext();
        }
    }


}

