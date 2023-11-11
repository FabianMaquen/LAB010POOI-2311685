public class Medico {
    private int nCogeliatura;
    private String nombre;
    private String especialidad;

    public Medico() {

    }

    public Medico(int nCogeliatura, String nombre, String especialidad) {
        this.nCogeliatura = nCogeliatura;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public int getnCogeliatura() {
        return nCogeliatura;
    }

    public void setnCogeliatura(int nCogeliatura) {
        this.nCogeliatura = nCogeliatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}