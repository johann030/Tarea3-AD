package ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraLectura {

	public static void main(String[] args) {
		String escribirTodo;
		String escribir;
		int cont = 0;

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("EscrituraConjunta.txt"));
			BufferedReader br = new BufferedReader(new FileReader("LecturaTexto.txt"));
			BufferedReader br1 = new BufferedReader(new FileReader("LecturaTexto1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("EscrituraConjunta.txt"));
			do {
				if ((escribir = br.readLine()) != null || (escribir = br1.readLine()) != null) {
					if (cont % 2 == 0) {
//						escribir = br.readLine();
						bw.write(escribir);
						bw.newLine();
					} else if (cont % 2 == 0) {
//						escribir = br1.readLine();
						bw.write(escribir);
						bw.newLine();
					}
				}
				cont++;
			} while ((escribir = br.readLine()) != null || (escribir = br1.readLine()) != null);

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
