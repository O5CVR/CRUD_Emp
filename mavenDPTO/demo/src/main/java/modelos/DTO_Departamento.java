package modelos;

import java.util.ArrayList;

public class DTO_Departamento {

    private int id;
    private String nombre;
    private ArrayList<DTO_Empleado> listaEmpleados;


    public DTO_Departamento(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        listaEmpleados = new ArrayList<DTO_Empleado>();
    }

    public DTO_Departamento(String nombre){
        this.nombre = nombre;
        listaEmpleados = new ArrayList<DTO_Empleado>();
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

    public ArrayList<DTO_Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setEmpleadoLista(DTO_Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }
    
    public void showListaEmpleados(){
        for (DTO_Empleado dto_Empleado : listaEmpleados) {
            System.out.println("Empleado: " + dto_Empleado.getNombre());
            System.out.println(dto_Empleado.getId());
            System.out.println(dto_Empleado.getEdad());
            System.out.println("------------------------");
           
        }
    }
}
