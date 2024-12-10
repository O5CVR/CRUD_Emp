package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO_Empleado {

    private ArrayList<DTO_Empleado> listaEmpleados;
    private DTO_Empleado emp;
    private Connection conexion;

    public DAO_Empleado() {
        conexion = Conexion.getConexion("empleados");
    }

    //GETALL
    public ArrayList<DTO_Empleado> getAll() {
        try {
            PreparedStatement query = conexion.prepareStatement("SELECT * FROM empleados");
            ResultSet resultado = query.executeQuery();

            this.listaEmpleados = new ArrayList<DTO_Empleado>();

            while(resultado.next()){
                DTO_Empleado emp = new DTO_Empleado(resultado.getInt("id"), resultado.getString("nombre"), resultado.getInt("edad"), resultado.getInt("dpto_id"));

                this.listaEmpleados.add(emp);
            }

        } catch (SQLException e) {
            // 
            e.printStackTrace();
        }

        return this.listaEmpleados;
    }

    //GETALL ASC

    public ArrayList<DTO_Empleado> getAllAsc() {
        try {
            PreparedStatement query = conexion.prepareStatement("SELECT * FROM empleados WHERE id ORDER BY id ASC");
            ResultSet resultado = query.executeQuery();

            this.listaEmpleados = new ArrayList<DTO_Empleado>();

            while(resultado.next()){
                DTO_Empleado emp = new DTO_Empleado(resultado.getInt("id"), resultado.getString("nombre"), resultado.getInt("edad"), resultado.getInt("dpto_id"));

                this.listaEmpleados.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return this.listaEmpleados;
    }

    //GETALL DESC

    public ArrayList<DTO_Empleado> getAllDsc() {
        try {
            PreparedStatement query = conexion.prepareStatement("SELECT * FROM empleados ORDER BY id DESC");
            ResultSet resultado = query.executeQuery();

            this.listaEmpleados = new ArrayList<DTO_Empleado>();

            while(resultado.next()){
                DTO_Empleado emp = new DTO_Empleado(resultado.getInt("id"), resultado.getString("nombre"), resultado.getInt("edad"), resultado.getInt("dpto_id"));

                this.listaEmpleados.add(emp);
            }

        } catch (SQLException e) { 
            e.printStackTrace();
        }

        return this.listaEmpleados;
    }

    //GET EMPLEADO BY ID
    public DTO_Empleado getEmpleadoByID() {
        try {
            PreparedStatement query = conexion.prepareStatement("SELECT * FROM empleados WHERE id=?");
            ResultSet resultado = query.executeQuery();


            while(resultado.next()){
                emp = new DTO_Empleado(resultado.getInt("id"), resultado.getString("nombre"), resultado.getInt("edad"), resultado.getInt("dpto_id"));
            }


        } catch (SQLException e) { 
            e.printStackTrace();
        }

        return this.emp;

    }

    //INSERT

    //UPDATE

    //DELETE FOR ID

    //DELETE FOR AGE
    
    //GET ALL EMPLEADOS POR DEPARTAMENTO
}
