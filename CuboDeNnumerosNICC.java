import java.util.Scanner;
public class CuboDeNnumerosNICC{
	public static void main (String args[]){
		Scanner leer = new Scanner(System.in);

		int numero=0;
		int resultado=0;
		int cantNum;
		int operacion;
		int i;

		System.out.print("INGRESE CANTIDAD DE NUMEROS: ");
		cantNum = leer.nextInt();

		for (i=1;i<=cantNum;i++){
			System.out.print("INGRESE NUMERO: ");
			numero = leer.nextInt();
			if (numero>=0) {
				operacion=numero*numero*numero;
				resultado=operacion;
				
			}else{
				System.out.println("ERROR");
			}
			System.out.println("El cubo de "+numero+": "+resultado);

		}


	}
		
}
