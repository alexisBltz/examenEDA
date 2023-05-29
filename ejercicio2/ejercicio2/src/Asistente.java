public class Asistente {
    private String nombre;
    private String apellidoPaterno;
    private String dni;
    private String email;
    private String birth;

    public Asistente(String nombre, String apellidoPaterno, String dni, String email, String birth) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.dni = dni;
        this.email = email;
        this.birth = birth;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getBirth() {
        return birth;
    }

}

