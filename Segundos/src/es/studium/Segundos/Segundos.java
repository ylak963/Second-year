package es.studium.Segundos;

import java.util.Scanner;

public class Segundos {

	public static void main(String[] args) {
		int edad, segundos;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique su edad en años:");
		edad=teclado.nextInt();
		segundos=FuncionSeg(edad);
		System.out.println("Su edad en segundos es de:"+segundos);
		ProcedimientoSeg(edad);
		teclado.close();
	}
	//Función
	private static int FuncionSeg(int a) {
		int s;
		s=a*31536000;
		return s;
	}
	//Procedicimiento
	public static void ProcedimientoSeg(int a) 
	{
		int s;
		s=a*315360000;
		System.out.println("Su edad en segundos es:"+s);
	}
	

}
