import java.util.Scanner;

public class CalcularPrecioPorNCantidadDeProductosNICC{
  public static void main (String args[]){
	Scanner leer = new Scanner(System.in);
		
		double precio=0;
		double descuento=0;
		int n;
		double totalApagar;
		
		System.out.print("INGRESE LA CANTIDAD DE ARTICULOS: ");
		n = leer.nextInt();
		System.out.print("INGRESE EL COSTO DEL ARTICULO: ");
		precio = leer.nextInt();
		System.out.println("");
		
		if (precio>=200) {
			
			precio=precio*n;
			descuento=(precio)*0.15;
			totalApagar =precio-descuento;
			System.out.println("IMPORTE:  *****************  "+precio+" $");
			System.out.println("DESCUENTO 15%: ************  "+descuento+" $");
			System.out.println("IMPORTE TOTAL: ************  "+totalApagar+" $");
			
		}else if(precio>=100 && precio<200){
			
			precio=precio*n;
			descuento=(precio)*0.12;
			totalApagar =precio-descuento;
			System.out.println("IMPORTE:  *****************  " +precio+" $");
			System.out.println("DESCUENTO 12%: ************  "+descuento+" $");
			System.out.println("IMPORTE TOTAL: ************  "+totalApagar+" $");
			
			

		} else{
			precio=precio*n;
			descuento=(precio)*0.10;
			totalApagar =precio-descuento;
			System.out.println("IMPORTE:  *****************   "+precio+" $");
			System.out.println("DESCUENTO 10%: ************   "+descuento+" $");
			System.out.println("IMPORTE TOTAL: ************   "+totalApagar+" $");
		}
	}
}
