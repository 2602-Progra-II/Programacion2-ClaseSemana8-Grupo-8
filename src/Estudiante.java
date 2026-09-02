
public class Estudiante {
    // Atributos o campos comunes
    private String idEstudiante;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String carrera;
    private double promedioAcumulado;

    // Constructor completo
    public Estudiante(String idEstudiante, String nombre, String apellido, String correoElectronico, String carrera, double promedioAcumulado) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.carrera = carrera;
        this.promedioAcumulado = promedioAcumulado;
    }

    // Métodos Getter y Setter
    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(double promedioAcumulado) {
        if (promedioAcumulado >= 0.0 && promedioAcumulado <= 10.0) { // Validación de ejemplo
            this.promedioAcumulado = promedioAcumulado;
        }
    }

    // Método para mostrar la información del estudiante
    @Override
    public String toString() {
        return "Estudiante [" +
                "ID: '" + idEstudiante + '\'' +
                ", Nombre: '" + nombre + " " + apellido + '\'' +
                ", Correo: '" + correoElectronico + '\'' +
                ", Carrera: '" + carrera + '\'' +
                ", Promedio: " + promedioAcumulado +
                ']';
    }
}
