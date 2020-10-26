import java.io.*;

import java.io.BufferedReader;

public class PedidoDeHamburguesasNICC {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cargo;
		double costo;
		double forma_de_pago;
		double i;
		double n;
		double pago;
		double tipo_de_hamburguesa;
		pago = 0;
		System.out.print("Ingrese La Cantidad de Hamburgur¿esas a comprar:");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			System.out.println("Hamburguesa numero: "+i);
			System.out.println("Seleccione el valor de tipo de hamburguesa.");
			System.out.println("1 = (S) sencilla");
			System.out.println("2 = (D) doble");
			System.out.println("3 = (T) triples");
			System.out.println("    :");
			do {
				tipo_de_hamburguesa = Double.parseDouble(bufEntrada.readLine());
				if (tipo_de_hamburguesa<1 || tipo_de_hamburguesa>3) {
					System.out.print("Valor incorrecto. Ingréselo nuevamente.: ");
				}
			} while (!(tipo_de_hamburguesa>=1 && tipo_de_hamburguesa<=3));
			costo = 0;
			if (tipo_de_hamburguesa==1) {
				costo = 20;
			}
			if (tipo_de_hamburguesa==2) {
				costo = 25;
			}
			if (tipo_de_hamburguesa==3) {
				costo = 28;
			}
			System.out.println("Seleccione el valor de forma de pago.");
			System.out.println("    1 = Efectivo");
			System.out.println("    2 = Tarjeta");
			System.out.print("    :");
			do {
				forma_de_pago = Double.parseDouble(bufEntrada.readLine());
				if (forma_de_pago<1 || forma_de_pago>2) {
					System.out.print("Valor incorrecto. Ingréselo nuevamente.: ");
				}
			} while (!(forma_de_pago>=1 && forma_de_pago<=2));
			if (forma_de_pago==1) {
				cargo = 0;
			} else {
				cargo = costo*0.05;
			}
			pago = pago+costo+cargo;

			System.out.println("CARGO POR TARGETA: $  *****"+cargo);
			System.out.println("COSTO DEL PEDIDO: $  ******" +costo);
			System.out.println("");
		}
		System.out.println("IMPORTE : $    ************"+pago);
		
	}


}

