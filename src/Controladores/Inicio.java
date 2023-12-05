package Controladores;
import java.util.Scanner;
import Servicios.MenuC;
import Servicios.MenuI;
import Servicios.OperativaC;
import Servicios.OperativaI;

/*
 * clase principal
 * @amd 051223
 */
public class Inicio {

	/*
	 * metodo pricipal
	 * @amd 051223
	 */
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("¿cuanto tienes?  (tipo int)");// mi programa pedira cuanto tiene al principio del dia 
		int a = sc.nextInt() ; 
		MenuI mi = new MenuC();
		OperativaI oi = new OperativaC();
		boolean abrir = false;
		int eleccion;
		while(!abrir) 
		{
			eleccion = mi.menu();
			switch(eleccion) 
			{
			case 0 :
				System.out.println("cerrado");
				abrir =true;
				break;
			case 1 :
				System.out.println(" Añadir venta");
				a = oi.añadirVenta(a);
				break;
			case 2 :
				System.out.println(" Añadir gasto");
				a = oi.añadirGastos(a);
				break;
			case 3 :
				System.out.println(" total");
				oi.mostrarTotal(a);
				break;
				
			default : 
				System.out.println("no existe esta opcion");
				break;
			}
		}
	}
}
