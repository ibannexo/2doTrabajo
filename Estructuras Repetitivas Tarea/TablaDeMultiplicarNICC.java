import java.util.Scanner;
public class TablaDeMultiplicarNICC{
	public static void main (String args[]){
		Scanner leer = new Scanner(System.in);

		int numMultiplicar;
		int i;
		int mulHasta;
		int resultado;

		System.out.print("INGRESE LA TABLA DE QUE NUMERO DESEA MULTIPLICAR: ");
		numMultiplicar = leer.nextInt();
		System.out.print("INGRESE HASTA QUE RANGO DESEA IMPRIMIR LA TABLA: ");
		mulHasta = leer.nextInt();
		System.out.println("");
		System.out.println("TABLA DE MULTIPLICAR DEL NUMERO "+numMultiplicar);

		for (i=1;i<=mulHasta;i++){
			resultado=numMultiplicar*i;
			System.out.println(numMultiplicar+" x "+i+" = "+resultado);
		}

	}
		
} 