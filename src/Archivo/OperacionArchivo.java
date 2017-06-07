/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
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
                bw.write(e.getRut()+","+
                        e.getNombre()+","+
                        e.getApellidos()+"\n");
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
    
    public static ArrayList leerArchivo(){
        File f=new File("C:\\Users\\David\\Desktop\\estudiantes.txt");
        ArrayList<Estudiante> estudiantes=new ArrayList<>();
        Scanner scanner;
        try {
            scanner=new Scanner(f);
            while(scanner.hasNextLine()){
                String linea=scanner.nextLine();
                Scanner delimitador=new Scanner(linea);
                delimitador.useDelimiter("\\s*,\\s*");
                Estudiante e=new Estudiante();
                e.setRut(delimitador.next());
                e.setNombre(delimitador.next());
                e.setApellidos(delimitador.next());
                estudiantes.add(e);
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Existe un error al leer el archivo "+ex.toString());
        }
        return estudiantes;
    }
    
    public static void agregar(ArrayList<Estudiante> lista){
        FileWriter fw=null;
        try {
            fw=new FileWriter("C:\\Users\\David\\Desktop\\estudiantes.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            for (Estudiante e : lista) {
                bw.write(e.getRut()+","+
                        e.getNombre()+","+
                        e.getApellidos()+"\n");
            }
            bw.close();
            System.out.println("Fue agregado el estudiante");
        } catch (IOException ex) {
            System.out.println("Error al agregar"+ex.toString());
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
