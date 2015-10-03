//Sergio de Leon 14312
//Manolo Capilla 131350
//Programa de atención de emergencias que usa la implementación proporcionada
//por el Java Collection Framework
package hdt8;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;


public class main{
       
    public static void main(String[] args) {
		//PriorityQueue
        Queue<paciente> CustumPriorityQueue = new PriorityQueue();
        int numPacientes=0; // Variable para guardar el numero de pacientes atendidos
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
             CustumPriorityQueue.add(new paciente(datos[0],datos[1],datos[2]));
             numPacientes++;     
            }
            entrada.close();
        }
        catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        // Se crea una variable paciente para imprimir la lista de los pacientes
        paciente  ficha;  
	for(int i=0; i<numPacientes; i++){
		ficha = CustumPriorityQueue.poll();
		System.out.println(ficha.getNombre()+","+ficha.getDescripcion()+", "+ficha.getNivel());
	}

        
    }
    

   
}
