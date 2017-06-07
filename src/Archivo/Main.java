/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.util.ArrayList;
import modelo.Estudiante;

/**
 *
 * @author David
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes=new ArrayList<Estudiante>();
        Estudiante e1=new Estudiante();
        e1.setRut("1111-1");
        e1.setNombre("Pepito");
        e1.setApellidos("fghj");
        e1.setDireccion("Heroes de la C.");
        estudiantes.add(e1);
        OperacionArchivo.crear(estudiantes);
        
    }
    
    
}
