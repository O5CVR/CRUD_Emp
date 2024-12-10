package modelos;

public class DTO_Empleado {
    
    private int id;
    private String nombre;
    private int edad;
    private int dpto_id;

    public DTO_Empleado(String nombre, int edad, int dpto_id){
        this.nombre = nombre;
        this.edad = edad;
        this. dpto_id = dpto_id;
    }

    public DTO_Empleado(int id, String nombre, int edad, int dpto_id){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this. dpto_id = dpto_id;
    }

    public DTO_Empleado(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public DTO_Empleado(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDpto_id() {
        return dpto_id;
    }

    public void setDpto_id(int dpto_id) {
        this.dpto_id = dpto_id;
    }

    @Override
    public String toString() {
        return "DTO_Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", dpto_id=" + dpto_id + "]";
    }

    

}

