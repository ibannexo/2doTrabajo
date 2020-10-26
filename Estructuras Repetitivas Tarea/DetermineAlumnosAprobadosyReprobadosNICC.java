import java.util.Scanner;
public class DetermineAlumnosAprobadosyReprobadosNICC{
	public static void main (String args[]){
		Scanner leer = new Scanner(System.in);
		//def datos
		int cantNotas=0;
		double nota=0;
		int i;
		int aprobados=0;
		int reprobados=0;

		System.out.print("INGRESE CANTIDAD DE NOTAS A CALCULAR: ");
		cantNotas = leer.nextInt();
		
		for (i=1;i<=cantNotas;i++){
			
			System.out.print("INGRESE NOTA  : "+i+": ");
			nota = leer.nextInt();

			if (nota>=13 && nota <=20) {
				aprobados=aprobados+1;
				
			}else if (nota<13) {
				
				reprobados=reprobados+1;
			}else{
				System.out.println("ERROR NOTA INCORRECTA");
			}
		}System.out.println("");
		System.out.println("ALUMNOS APROBADOS: **** "+aprobados);
		 System.out.println("ALUMNOS REPROBADOS:**** "+reprobados);

	}
	
}
	