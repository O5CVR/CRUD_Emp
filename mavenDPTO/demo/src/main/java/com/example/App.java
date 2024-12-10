package com.example;

import modelos.*;

public class App 
{
    public static void main( String[] args )
    {
        DAO_Empleado d = new DAO_Empleado();

        
        for (DTO_Empleado e : d.getAllDsc()) {
            System.out.println(e.toString());
            
        }
    }
}
