import java.io.*;

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
                SomeNode node = new SomeNode(values);
                add(node);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int size() {
        return size;
    }

    public SomeNode<T> getHead() {
        return head;
    }
}