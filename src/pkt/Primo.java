package pkt;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		saludar();
		primo();
	}

	public static void saludar() {

		System.out.println("Buenos tardes Ceinmark, soy Germ�n Santos");
	}
	
	public static void primo() {
		Scanner ent = new Scanner(System.in);

        System.out.print("Ingrese un n�mero entero positivo: ");
        int numero = ent.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un n�mero primo.");
        } else {
            System.out.println(numero + " no es un n�mero primo.");
        }

        System.out.println("Divisores de " + numero + ":");
        mostrarDivisores(numero);

        ent.close();
    }

    // Funci�n para verificar si un n�mero es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Funci�n para mostrar los divisores de un n�mero
    public static void mostrarDivisores(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}