/**
 * Programa que ordena una matriz de diferentes formas
 * 
 * @author nachobelmonte 8 dic. 2018
 */
public class SecuenciasNaturales {

	public static void main(String[] args) {
		int[][] matrizA = secuenciaNaturalIntD(9);

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA.length; j++) {
				System.out.print(matrizA[i][j]);
				if (matrizA[i][j] / 10 > 0) {
					System.out.print("  ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.print("\n");
		}

	}

	/**
	 * 
	 * @param longitudMatriz
	 * @return
	 */
	static int[][] secuenciaNaturalIntA(int longitudMatriz) {

		int[][] matriz = new int[longitudMatriz][longitudMatriz];
		int numeroAlmacenar = 1;

		for (int x = 0; x < matriz.length; x++) {

			for (int y = 0; y < matriz.length; y++) {

				matriz[y][x] = numeroAlmacenar;
				numeroAlmacenar++;
			}
		}
		return matriz;
	}

	/**
	 * 
	 * @param longitudMatriz
	 * @return
	 */
	static int[][] secuenciaNaturalIntB(int longitudMatriz) {

		int[][] matriz = new int[longitudMatriz][longitudMatriz];
		int numeroAlmacenar = 1;

		int orden = 0;

		for (int x = 0; x < matriz.length; x++) {

			if (orden == 0) {

				// Mete los numeros de arriba abajo en la columna
				for (int y = 0; y < matriz.length; y++) {

					matriz[y][x] = numeroAlmacenar;
					numeroAlmacenar++;
				}
				orden--;

			} else {

				// Mete los numeros de abajo arriba en la columna
				for (int y = matriz.length - 1; y >= 0; y--) {

					matriz[y][x] = numeroAlmacenar;
					numeroAlmacenar++;
				}
				orden++;
			}
		}
		return matriz;

	}

	/**
	 * 
	 * @param longitudMatriz
	 * @return
	 */
	static int[][] secuenciaNaturalIntC(int longitudMatriz) {

		int[][] matriz = new int[longitudMatriz][longitudMatriz];
		int numeroAlmacenar = 1;

		for (int i = 0; i < matriz.length; i++) {

			int numeroRestar = -i - 1;
			int coordenadasY = 0;
			for (int j = 0; j <= i; j++) {

				matriz[matriz.length + numeroRestar][coordenadasY] = numeroAlmacenar;
				numeroRestar++;
				coordenadasY++;
				numeroAlmacenar++;
			}
		}

		int aux = 0;
		int numEjecucion2Bucle = longitudMatriz - 1;

		for (int i = 0; i < longitudMatriz - 1; i++) {

			aux++;
			int coordenadasY = aux;
			int coordenadasX = 0;

			for (int j = 0; j < numEjecucion2Bucle; j++) {

				matriz[coordenadasX][coordenadasY] = numeroAlmacenar;

				coordenadasX++;
				coordenadasY++;
				numeroAlmacenar++;
			}
			numEjecucion2Bucle--;
		}

		return matriz;
	}

	/**
	 * Ordena la mariz en espiral
	 * 
	 * @param longitudMatriz
	 * @return
	 */
	static int[][] secuenciaNaturalIntD(int longitudMatriz) {

		int[][] matriz = new int[longitudMatriz][longitudMatriz];

		int a = 0; // punto incio
		int b = longitudMatriz - 1; // punto final
		int numeroAlmacenar = 1;
		int casoEjecutar = 0;

		while (numeroAlmacenar <= longitudMatriz * longitudMatriz) {
			switch (casoEjecutar) {

			// ARRAY ARRIBA ABAJO
			case 0:
				for (int i = a; i <= b; i++) {

					matriz[i][a] = numeroAlmacenar;
					numeroAlmacenar++;
				}
				a++;
				casoEjecutar++;
				break;

			// ARRAY IZQUIERDA DERECHA
			case 1:
				for (int i = a; i <= b; i++) {

					matriz[b][i] = numeroAlmacenar;
					numeroAlmacenar++;
				}
				a--;
				b--;
				casoEjecutar++;
				break;

			// ARRAY ABAJO ARRIBA
			case 2:
				for (int i = b; i >= a; i--) {

					matriz[i][b + 1] = numeroAlmacenar;
					numeroAlmacenar++;
				}
				a++;
				casoEjecutar++;
				break;

			// ARRAY DERECHA IZQUIERDA
			case 3:
				for (int i = b; i >= a; i--) {

					matriz[a - 1][i] = numeroAlmacenar;
					numeroAlmacenar++;
				}
				casoEjecutar = 0;
				break;
			}

		}
		return matriz;
	}

}
