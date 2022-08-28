package ejemplouno;

public class variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracionde variables
		float areaLateral;
		float Pbase, h, n, l;
		double anguloCentral, apotema, Abase, areaTotal, volumen;
		//Datos de entrada
		h = 20;
		n = 5;
		l = 8.f;
		//Procesamiento de datos
		Pbase = n *l;
		areaLateral = Pbase * h;
		
		anguloCentral = 360/n;
		apotema = l/(2*Math.tan(anguloCentral/2));
		Abase = (Pbase * apotema)/2;
		areaTotal = areaLateral + 2*Abase;
		
		volumen = Abase * h;
		//Datos de salida
		
		System.out.println("1. La Altura del prisma es: " + h);
		System.out.println("2. La longitud de los lados del prima son: " + l);
		System.out.println("3. El perimetro de la base del prisma es: " + Pbase);
		System.out.println("4. El Area Lateral del prisma es: " + areaLateral);
		System.out.println("5. El Angulo Central del prisma es: " + anguloCentral);
		System.out.println("6. El Apotema del prisma es: " + String.format("%.2f", apotema));
		System.out.println("7. El Area de la Base del prisma es: " + String.format("%.2f", Abase));
		System.out.println("8. El Area Total del prisma es: " + String.format("%.2f", areaTotal));
		System.out.println("9. El Volumen del prisma es: " + String.format("%.2f", volumen));
		
		
	}

}
