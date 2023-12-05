package Servicios;

import java.util.Scanner;

/*
 * implemetacion que implementa a a la interfaz OperativaUI
 * @amd 051223
 */
public class OperativaC implements OperativaI 
{
	Scanner sc = new Scanner(System.in);

	@Override
	public int añadirVenta(int a) 
	{
		System.out.println("cuanto es la nueva venta");
		int i = sc.nextInt();
		a = a + i;
		System.out.println("Tienes: " + a );
		return a;
	}

	@Override
	public int añadirGastos(int a) 
	{
		System.out.println("cuanto es el nuevo gasto");
		int i = sc.nextInt();
		a = a-i;
		if(a<0) 
		{
			System.out.println("Tienes: " + a + " ,desbes dinero" );
		}
		else if (a==0) 
		{
			System.out.println("Tienes: " + a + " ,estas en 0" );
		}
		else 
		{System.out.println("Tienes: " + a  );}
		
		return a;
	}

	@Override
	public int mostrarTotal(int a) 
	{
		if(a<0) 
		{
			System.out.println("Tienes: " + a + " .Vamos muy mal");
		}
		else if (a==0) 
		{
			System.out.println("Tienes: " + a + " .Vamos mal" );
		}
		else 
		{System.out.println("Tienes: " + a  );}
		
		return a;
	}
	
	
	
	

}
