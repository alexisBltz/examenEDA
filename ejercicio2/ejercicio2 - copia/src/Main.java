import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de NewList
        NewList<String[]> newList = new NewList<>();

        // Nombre del archivo CSV a importar
        String fileName = "aumentadoList.csv";

        // Importar el archivo CSV a la lista
        newList.importFromCSV(fileName);

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
       
    }
}
