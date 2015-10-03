/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
 try{
            // Abrimos el archivo
            FileInputStream fstream = new FileInputStream("datos.txt");
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fstream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            
            
            String[] datos = new String[5];
       
            while ((strLinea = buffer.readLine()) != null)   {
             
             paciente paciente = new paciente();
             
             int inicio=0;
             int numPalabras=0;
             int i =0;
             for(int n = 0; n <strLinea.length(); n++){
                    if(Character.toString(strLinea.charAt(n)).equals(",") && i<3){
                       
                        datos[i] = strLinea.substring(inicio, n);
                        inicio = n+1;
                        numPalabras=numPalabras+1;
                        i = i+1;
                        
                    }
                    
                   
                 }   
             i=0;
             datos[2]= strLinea.substring(inicio+1, strLinea.length());
             
             System.out.println(datos[0]);
             paciente.setNombre(datos[0]);
             
             System.out.println(datos[1]);
             paciente.setDescripcion(datos[1]);
             
             System.out.println(datos[2]);
             paciente.setNivel(datos[2]);


            
            }
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        
    }
}
   