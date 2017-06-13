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
        e1.setNombre("Juanito");
        e1.setApellidos("Fernandez");
        e1.setDireccion("Heroes de la C.");
        estudiantes.add(e1);
        OperacionArchivo.crear(estudiantes);
        
        ArrayList<Estudiante> est=new ArrayList<Estudiante>();
        Estudiante estudiante=new Estudiante();
        estudiante.setRut("22222-2");
        estudiante.setNombre("Luis");
        estudiante.setApellidos("Hernandez");
        est.add(estudiante);
        OperacionArchivo.agregar(est);
        
        
        ArrayList<Estudiante> lista=new ArrayList<>();
        lista=OperacionArchivo.leerArchivo();
        int i=0;
        for (Estudiante e : lista) {
            if(e.getRut().equals("1111-1")){
                lista.remove(i);
                System.out.println("Elemento Removido");
            }
            else{
                System.out.println(e.toString());
            }
            i=i+1;
        }
        OperacionArchivo.crear(lista);
//        for (Estudiante estudiante1 : lista) {
//            System.out.println(estudiante1.toString());
//        }
//        
//        
//        Estudiante bus=OperacionArchivo.buscar("22222-2");
//        if(bus!=null){
//            System.out.println("Estudiante existe en el Archivo, y su nombre es: "+bus.getNombre());
//        }else{
//            System.out.println("Estudiante no existe");
//        }
//        
    }
//    
//    
}
