/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Estudiante;

/**
 *
 * @author David
 */
public class OperacionArchivo {
    
    public static void crear(ArrayList<Estudiante> lista) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("C:\\Users\\David\\Desktop\\estudiantes.txt");
            BufferedWriter bw =new BufferedWriter(fw);
            for (Estudiante e : lista) {
                bw.write(e.getRut()+"-"+
                        e.getNombre()+"-"+
                        e.getApellidos());
            }
            bw.close();
            System.out.println("Archivo Creado!");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }finally{
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
    }
}
