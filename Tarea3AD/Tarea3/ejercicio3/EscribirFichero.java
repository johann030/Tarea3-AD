package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {

	public static void main(String[] args) {
		String escribir;
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("LecturaTexto.txt"));
			BufferedReader br = new BufferedReader(new FileReader("LecturaTexto.txt"));
			System.out.println("Empiece a escribir: ");
			do {
				escribir = sc.nextLine();
				if(!escribir.equalsIgnoreCase("salir")) {
					bw.write(escribir);
					bw.newLine();
				}
			}while(!escribir.equalsIgnoreCase("salir"));
			bw.close();
			
			System.out.println("Todo lo que ha escrito: ");
			while((escribir = br.readLine()) != null) {
				System.out.println(escribir);
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}