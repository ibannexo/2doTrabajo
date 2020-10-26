import java.io.*;

public class FocosDeColoresNICC {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double color;
		double focos_blancos;
		double focos_rojos;
		double focos_verdes;
		double i;
		double n;
		focos_verdes = 0;
		focos_blancos = 0;
		focos_rojos = 0;
		System.out.print("Ingrese el valor de n:");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			System.out.println("PROCESO "+i);
			System.out.println("Seleccione el valor de color.");
			System.out.println("    1.- verde");
			System.out.println("    2.- blanco");
			System.out.println("    3.- rojo");
			System.out.print("    :");
			do {
				color = Double.parseDouble(bufEntrada.readLine());

				if (color<1 || color>3) {
					System.out.print("Valor incorrecto. Ingréselo nuevamente.: ");
				}
			} while (!(color>=1 && color<=3));
			if (color==1) {
				focos_verdes = focos_verdes+1;
			}
			if (color==2) {
				focos_blancos = focos_blancos+1;
			}
			if (color==3) {
				focos_rojos = focos_rojos+1;
			}
			System.out.println("");
		}
		System.out.println("Valor de focos verdes: "+focos_verdes);
		System.out.println("Valor de focos blancos: "+focos_blancos);
		System.out.println("Valor de focos rojos: "+focos_rojos);
	}


}

