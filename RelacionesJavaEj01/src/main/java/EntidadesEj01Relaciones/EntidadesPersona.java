
package EntidadesEj01Relaciones;


public class EntidadesPersona {
    String nombre;
    String apellido;
    Integer edad;
    Integer documento;
    EntidadesPerro perro;

    public EntidadesPersona() {
    }

    public EntidadesPersona(String nombre, String apellido, Integer edad, Integer documento, EntidadesPerro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public EntidadesPerro getPerro() {
        return perro;
    }

    public void setPerro(EntidadesPerro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "EntidadesPersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro.toString() + '}';
    }
    
}
