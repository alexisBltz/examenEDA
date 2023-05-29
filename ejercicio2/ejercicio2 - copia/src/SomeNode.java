public class SomeNode<T> {
    private T data;
    private SomeNode<T> next;

    public SomeNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SomeNode<T> getNext() {
        return next;
    }

    public void setNext(SomeNode<T> next) {
        this.next = next;
    }

    public void displayProperties() {
        if (data instanceof Person) {
            Person person = (Person) data;
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