import java.util.*;

import java.io.*;

public class Parser{

    public static void main(String args[]){
        List<List<String>> firstList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("matriculados.csv"))) {
            String line;
            String COMMA_DELIMITER = ",";
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                firstList.add(Arrays.asList(values));
            }
        }catch(Exception e){
        }

        List<List<String>> aumentadoList = new ArrayList<>();
        Random random = new Random();
        aumentadoList.addAll(firstList);
        for (int i = 0; i < 1000; i++) {
            // Seleccionar de forma aleatoria un registro original
            List<String> registroAleatorio = firstList.get(random.nextInt(firstList.size()));

            // Duplicar el registro aleatorio y agregarlo a la lista aumentado
            List<String> duplicado = new ArrayList<>(registroAleatorio);
            aumentadoList.add(duplicado);
        }
        String outputFilePath = "aumentadoList.csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (List<String> row : aumentadoList) {
                StringBuilder line = new StringBuilder();
                for (String field : row) {
                    // Agregar cada campo a la línea, separado por comas
                    line.append(field).append(",");
                }
                // Eliminar la última coma de la línea
                line.setLength(line.length() - 1);
                // Escribir la línea en el archivo
                writer.write(line.toString());
                writer.newLine();
            }
            System.out.println("Archivo CSV exportado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al exportar el archivo CSV.");
        }
        //implementacion

    }
}
