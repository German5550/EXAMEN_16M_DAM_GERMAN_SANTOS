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
		int primo=0;
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce un n�mero para averiguar si es primo o no");
		primo=ent.nextInt();
	}

}
