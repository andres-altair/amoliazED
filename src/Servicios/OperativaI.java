package Servicios;

/*
 * interfaz encargada de la operativa
 * @amd 051223
 */
public interface OperativaI 
{
	/*
	 * metodo que suma lo que tenia + las ganacias 
	 * @amd 051223
	 * <return>total del añadido + el del principio</return>
	 */
	public int añadirVenta(int a);
	
	/*
	 * metodo que resta lo que tenia - las ganacias 
	 * @amd 051223
	 * <return>el del principio - total del gasto</return>
	 */
	public int añadirGastos(int a);
	
	/*
	 * metodo que muestra caunto tiene
	 * @amd 051223
	 * <return>total que tiene</return>
	 */
	public int mostrarTotal(int a);
	
}
