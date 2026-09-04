public class clase {
    private String nombre = "Arciyipi";
    private String correo;
    private String telefono;

    public clase(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void main(String[] args) {
        clase cliente1 = new clase("Amilcar Crespin", "amilcar503@correo.com", "7777-1234");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.getCorreo());
    }
}