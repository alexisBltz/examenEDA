import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NewList<T> {
    private SomeNode<T> head;
    private SomeNode<T> tail;
    private int size;

    public void add(SomeNode<T> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void remove(SomeNode<T> node) {
        if (head == node) {
            head = node.getNext();
            if (head == null) {
                tail = null;
            }
        } else {
            SomeNode<T> current = head;
            while (current != null && current.getNext() != node) {
                current = current.getNext();
            }
            if (current != null) {
                current.setNext(node.getNext());
                if (current.getNext() == null) {
                    tail = current;
                }
            }
        }
        size--;
    }
    public void importFromCSV(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String COMMA_DELIMITER = ",";

            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                String nombre = values[0];
                String apellidoPaterno = values[1];
                String dni = values[2];
                String email = values[3];
                String birth = values[4];

                Asistente asistente = new Asistente(nombre, apellidoPaterno, dni, email, birth);
                SomeNode node = new SomeNode(asistente);
                add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sort() {
        List<Asistente> asistenteList = new ArrayList<>();

        SomeNode current = head;
        while (current != null) {
            if (current.getData() instanceof Asistente) {
                Asistente asistente = (Asistente) current.getData();
                asistenteList.add(asistente);
            }
            current = current.getNext();
        }

        Collections.sort(asistenteList, Comparator.comparing(Asistente::getApellidoPaterno));

        // Reinicializar la lista
        clear();

        // Volver a agregar los nodos ordenados
        for (Asistente asistente : asistenteList) {
            SomeNode node = new SomeNode(asistente);
            add(node);
        }
    }


    public int size() {
        return size;
    }

    public SomeNode<T> getHead() {
        return head;
    }
}