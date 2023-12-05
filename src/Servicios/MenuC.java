package Servicios;

import java.util.Scanner;

/*
 * implemetacion que implementa a a la interfaz MenuI
 * @amd 051223
 */
public class MenuC implements MenuI 
{
	Scanner sc = new Scanner(System.in);

	@Override
	public int menu() 
	{
		System.out.println("************************");
		System.out.println("0. Cerrar");
		System.out.println("1. Añadir venta");
		System.out.println("2. Añadir gasto");
		System.out.println("3. Mostrar total");
		System.out.println("************************");
		int eleccion = sc.nextInt();
		return eleccion;
	}
	
}
