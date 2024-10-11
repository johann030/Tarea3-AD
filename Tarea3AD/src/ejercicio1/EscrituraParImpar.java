package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscrituraParImpar {

	public static void main(String[] args) {
		String escribir;
		Scanner sc = new Scanner(System.in);
		String archivoPar;
		String archivoImpar;
		int cont = 0;
		try {
			System.out.println("Escoja el fichero donde quiere escribir las lineas pares: ");
			System.out.println("FicheroLeer.txt");
			System.out.println("FicheroLeer1.txt");
			archivoPar = sc.nextLine();
			System.out.println("Escoja el fichero donde quiere escribir las lineas impares: ");
			System.out.println("FicheroLeer.txt");
			System.out.println("FicheroLeer1.txt");
			archivoImpar = sc.nextLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter(archivoPar));
				BufferedWriter bw1 = new BufferedWriter(new FileWriter(archivoImpar));
				BufferedReader br = new BufferedReader(new FileReader(archivoPar));
				BufferedReader br1 = new BufferedReader(new FileReader(archivoImpar));
				
				System.out.println("Escriba: ");
				do {
					escribir = sc.nextLine();
					if (!escribir.equalsIgnoreCase("fin")) {
						if (cont % 2 == 0) {
							bw.write(escribir);
							bw.newLine();
						} else if (cont % 2 == 1){
							bw1.write(escribir);
							bw1.newLine();
						}
					}
					cont++;
				} while (!escribir.equalsIgnoreCase("fin"));
				bw.close();
				bw1.close();
				
				System.out.println("Fichero par: ");
				while ((escribir = br.readLine()) != null) {
					System.out.println(escribir);
				}
				System.out.println("");

				System.out.println("Fichero impar: ");
				while ((escribir = br1.readLine()) != null) {
					System.out.println(escribir);
				}
				br.close();
				br1.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}