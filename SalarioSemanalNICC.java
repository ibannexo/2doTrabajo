import java.util.Scanner;
public class SalarioSemanalNICC{
	public static void main (String args[]){
		Scanner leer = new Scanner(System.in);
		//def datos
		int trabajadores=0;
		
		int i;
		
		double sueldoSemanal;
		double pagoXhora=0;
		double horasT=0;
		double salarioSemanal=0;
		double descuento=1;
		System.out.print("INGRESE CANTIDAD DE SUELDOS A CALCULAR: ");
		trabajadores = leer.nextInt();
		
		for (i=1;i<=trabajadores;i++){
			System.out.println("");
			System.out.print("HORAS TRABAJADAS DEL TRABAJADOR N° "+i+": ");
			horasT = leer.nextDouble();
			System.out.print("PAGO POR HORA DEL TRABAJADOR N° "+i+": ");
			pagoXhora = leer.nextDouble();
			sueldoSemanal=pagoXhora*horasT;

			if (sueldoSemanal>=1 || sueldoSemanal >=150) {
				descuento=(sueldoSemanal)*0.05;
				salarioSemanal=(sueldoSemanal)-descuento;
	
			}if (sueldoSemanal>150 || sueldoSemanal<=300) {
				descuento=(sueldoSemanal)*0.07;
				salarioSemanal=(sueldoSemanal)-descuento;

			}if (sueldoSemanal>300 || sueldoSemanal<=450) {
				
				descuento=(sueldoSemanal)*0.09;
				salarioSemanal=(sueldoSemanal)-descuento;
			}
			System.out.println("SALARIO SEMANAL ES:**** "+salarioSemanal);
		}System.out.println("");
		
	}
	
}