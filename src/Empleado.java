public class Empleado {
    // Atributos o campos comunes
    private String idEmpleado;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String departamento;
    private double salario;

    // Constructor completo
    public Empleado(String idEmpleado, String nombre, String apellido, String correoElectronico, String departamento, double salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = "Edenilson";
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Métodos Getter y Setter
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0.0) { // Validación de ejemplo: no se permiten salarios negativos
            this.salario = salario;
        }
    }

    // Método para mostrar la información del empleado
    @Override
    public String toString() {
        return "Empleado [" +
                "ID: '" + idEmpleado + '\'' +
                ", Nombre: '" + nombre + " " + apellido + '\'' +
                ", Correo: '" + correoElectronico + '\'' +
                ", Departamento: '" + departamento + '\'' +
                ", Salario: " + salario +
                ']';
    }
}