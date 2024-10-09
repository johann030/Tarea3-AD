package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Crea un programa que solicita 3 ficheros de texto (2 de lectura y 1 de escritura),
//		y escriba en el fichero de escritura el contenido
//		de los ficheros de texto de forma alternativa (1 línea de cada fichero). 
//		El contenido final debe ser el de ambos ficheros de lectura entremezcladas las líneas.

		// los ficheros ya existen y se va escribiendo en un tercer fichero intercalando
		// cada linea
		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter("EscrituraConjunta.txt"));
			BufferedReader br = new BufferedReader(new FileReader("LecturaTexto.txt"));
			BufferedReader br1 = new BufferedReader(new FileReader("LecturaTexto1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("EscrituraConjunta.txt"));

			String escribirTodo;
	
			String escribir1 = br.readLine();
			String escribir2 = br1.readLine();
			do {
				
				if (escribir1 != null) {
	                 bw.write(escribir1);
	                 bw.newLine();
	             }
				//TODO
	             // Escribir la línea del segundo archivo si no es null
	             if (escribir2 != null) {
	                 bw.write(escribir2);
	                 bw.newLine();
	             }
			}while ((escribir1 = br.readLine()) != null || (escribir2 = br1.readLine()) != null);
			
			{
	             // Escribir la línea del primer archivo si no es null
	             
	         }

			bw.close();

			br.close();
			br1.close();

			System.out.println("Contenido final del fichero");
			while ((escribirTodo = br2.readLine()) != null) {
				System.out.println(escribirTodo);
			}

			br2.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
