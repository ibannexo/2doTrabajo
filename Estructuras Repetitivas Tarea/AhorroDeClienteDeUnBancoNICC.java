import java.util.Scanner;
public class AhorroDeClienteDeUnBancoNICC{
	public static void main (String args[]){
	Scanner leer = new Scanner(System.in);
		double ahorroEnero;
		double ahorroFebrero;
		double ahorroMarzo;
		double ahorroAbril;
		double ahorroMayo;
		double ahorroJunio;
		double ahorroJulio;
		double ahorroAgosto;
		double ahorroSeptiembre;
		double ahorroOctubre;
		double ahorroNoviembre;
		double ahorroDiciembre;
		double i;
		double intereses;
		double inversion_final=0;
		int n;
		double total;
		total = 0;
		System.out.print("INGRESE CUANTOS AÑOS DESEA CALCULAR: ");
		n = leer.nextInt();
		for (i=1;i<=n;i++) {
			System.out.println("ARORROS DE "+i+" AÑO");
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE ENERO: ");
			ahorroEnero  = leer.nextDouble();;
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE FEBRERO: ");
			ahorroFebrero = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE MARZO: ");
			ahorroMarzo = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE ABRIL: ");
			ahorroAbril = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE MAYO: ");
			ahorroMayo = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE JUNIO: ");
			ahorroJunio = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE JULIO: ");
			ahorroJulio = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE AGOSTO: ");
			ahorroAgosto = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE SEPTIEMBRE: ");
			ahorroSeptiembre = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE OCTUBRE: ");
			ahorroOctubre = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE NOVIEMBRE: ");
			ahorroNoviembre = leer.nextDouble();
			System.out.print("INGRESE EL MONTO INVERTIDO EN EL MES DE DICIEMBRE: ");
			ahorroDiciembre = leer.nextDouble();
			
			total = total+ahorroEnero+ahorroFebrero+ahorroMarzo+ahorroAbril+ahorroMayo+ahorroJunio+ahorroJulio+ahorroAgosto+ahorroSeptiembre+ahorroOctubre+ahorroNoviembre+ahorroDiciembre;
			intereses=(total)*0.10;
			inversion_final = total;
			total=total+intereses;
			System.out.println("");
			System.out.println("INTERES ANUAL TOTAL:  ********* "+intereses+ " S/");
			System.out.println("MONTO TOTAL INVERTIDO: ******** "+inversion_final+" S/");
			System.out.println("");
		}   
		System.out.println("IMPORTE TOTAL : *************** "+total+ " S/");
	}


}

