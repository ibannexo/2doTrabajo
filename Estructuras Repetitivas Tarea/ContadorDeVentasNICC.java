import java.util.Scanner;

public class ContadorDeVentasNICC{
  public static void main (String args[]){
	Scanner leer = new Scanner(System.in);
		double i;
		double menores10mil;
		double menores20mil;
		double monto;
		double n;
		double suma10mil;
		double suma20mil;
		double total;
		
		System.out.print("INGRESE LA CANTIDAD DE VENTAS: ");
		n = leer.nextInt();
		menores10mil = 0;
		menores20mil = 0;
		suma10mil = 0;
		suma20mil = 0;
		total = 0;
		for (i=1;i<=n;i++) {
			
			System.out.print("INGRESE MONTO DE VENTA: ");
			monto = leer.nextDouble();
			if (monto<10000) {
				menores10mil = menores10mil+1;
				suma10mil = suma10mil+monto;
			}
			 if (monto>=10000 && monto<=20000) {
				menores20mil = menores20mil+1;
				suma20mil = suma20mil+monto;
			}			total = total+monto;
		}
		System.out.println(" ");
		System.out.println("CANTIDAD DE VENTAS MENORES A 10.000    : "+menores10mil);
		System.out.println("IMPORTE TOTAL DE VENTAS MENORES A 10.000  :  "+suma10mil);
		System.out.println("CANTIDAD DE VENTAS ENTRE 10000 y 20.000  : "+menores20mil);
		System.out.println("IMPORTE DE VENTAS DE 10.000 y 20.000 :   ****  "+suma20mil);
		System.out.println(" ");
		System.out.println("IMPORTE TOTAL EN VENTAS  :  ***************  "+total);
	}
}

