public class SomeNode<T> {
    private Asistente data;
    private T data1;
    private SomeNode<T> next;

    public SomeNode(T data) {
        this.data = (Asistente) data;
        this.next = null;
    }
    public SomeNode(Asistente data) {
        this.data = data;
        this.next = null;
    }
    public T getData() {
        return data1;
    }

    public void setData(T data) {
        this.data1 = data;
    }

    public SomeNode<T> getNext() {
        return next;
    }

    public void setNext(SomeNode<T> next) {
        this.next = next;
    }

    public void displayProperties() {
        if (data1 instanceof Person) {
            Person person = (Person) data1;
            System.out.println("Name: " + person.getName());
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Year: " + student.year);
                System.out.println("CUI: " + student.cui);
                System.out.println("School: " + student.school);
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Experience: " + teacher.experience);
                System.out.println("Academic: " + teacher.academic);
            }
        }
    }
}