import java.util.Scanner;
public class ContarMonedasBilletesNICC{
	public static void main (String args[]){
	Scanner leer = new Scanner(System.in);

		int monedasDe_Un_Sol;
		int monedasDe_Dos_soles;
		int monedasDe_Cinco_Soles;
		int canMoneUnSol;
		int canMoneDosSoles;
		int canMoneCincoSoles;
		int valorTolalMonedas;

		int billeteDiesSoles;
		int billeteDeVeinte;
		int billeteDeCincuenta;
		int billetesDeCien;
		int billetesDeDosCientos;
   		int canBilleteDiesSoles;
		int canBilleteDeVeinte;
		int caBilleteDeCincuenta;
		int canBilletesDeCien;
		int canBilletesDeDosCientos;
		int valorTolalBilletes;
		int valorMyB;
		int n;

		System.out.print("CUANTAS VECES DESEA CONTAR MONEDAS Y BILLETES?: ");
		n = leer.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print("CUANTAS MONEDAS DE UN SOL HAY? : ");
			monedasDe_Un_Sol  = leer.nextInt();
			System.out.print("CUANTAS MONEDAS DE DOS SOLES HAY? : ");
			monedasDe_Dos_soles  = leer.nextInt();
			System.out.print("CUANTAS MONEDAS DE CINCO SOLES HAY? : ");
			monedasDe_Cinco_Soles  = leer.nextInt();
			canMoneUnSol=monedasDe_Un_Sol*1;
			canMoneDosSoles=monedasDe_Dos_soles*2;
			canMoneCincoSoles=monedasDe_Cinco_Soles*5;

			valorTolalMonedas=canMoneUnSol+canMoneDosSoles+canMoneCincoSoles;
			System.out.print("CUANTOS BILLETES DE 10 SOLES HAY? : ");
			billeteDiesSoles  = leer.nextInt();
			System.out.print("CUANTOS BILLETES DE 20 SOLES HAY? : ");
			billeteDeVeinte  = leer.nextInt();
			System.out.print("CUANTOS BILLETES DE 50 SOLES HAY? : ");
			billeteDeCincuenta  = leer.nextInt();
			System.out.print("CUANTOS BILLETES DE 100 SOLES HAY? : ");
			billetesDeCien  = leer.nextInt();
			System.out.print("CUANTOS BILLETES DE 200 SOLES HAY? : ");
			billetesDeDosCientos  = leer.nextInt();

			canBilleteDiesSoles=billeteDiesSoles*10;
			canBilleteDeVeinte=billeteDeVeinte*20;
			caBilleteDeCincuenta=billeteDeCincuenta*50;
			canBilletesDeCien=billetesDeCien*100;
			canBilletesDeDosCientos=billetesDeDosCientos*200;
			
			valorTolalBilletes=canBilleteDiesSoles+canBilleteDeVeinte+caBilleteDeCincuenta+canBilletesDeCien+canBilletesDeDosCientos;
			valorMyB=valorTolalBilletes+valorTolalMonedas;
			System.out.println("******************      MONEDAS     ********************");
			System.out.println("HAY ************** "+canMoneUnSol+" SOLES EN MONEDAS DE UN SOL");
			System.out.println("HAY ************** "+canMoneDosSoles+ " SOLES EN MONEDAS DE DOS SOLES");
			System.out.println("HAY ************** "+canMoneCincoSoles+" SOLES EN MONEDAS DE CINCO SOLES");
			System.out.println("IMPORTE TOTAL: *** ");
			System.out.println("EN MONEDAS: ****** "+valorTolalMonedas+" S/");
			System.out.println(" ");
			System.out.println("******************      BILLETES    ********************");
			System.out.println("HAY ************** "+canBilleteDiesSoles+" SOLES EN BILLETES DE 10 SOLES");
			System.out.println("HAY ************** "+canBilleteDeVeinte+ " SOLES EN BILLETES DE 20 SOLES");
			System.out.println("HAY ************** "+caBilleteDeCincuenta+" SOLES EN BILLETES DE 50 SOLES");
			System.out.println("HAY ************** "+canBilletesDeCien+ " SOLES EN BILLETES DE 100 SOLES");
			System.out.println("HAY ************** "+canBilletesDeDosCientos+" SOLES EN BILLETES DE 200 SOLES");
			System.out.println("IMPORTE TOTAL: *** ");
			System.out.println("EN BILLETES: ****** "+valorTolalBilletes+" S/");
			System.out.println(" ");
			System.out.println("IMPORTE TOTAL: ******** ");
			System.out.println("BILLETES Y MONEDAS: *** "+valorMyB+" S/");

			
		}
		
	}
}