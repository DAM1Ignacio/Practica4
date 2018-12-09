/**
 * Programa para calcular una submatriz con los valores maximos
 * 
 * @author nachobelmonte 9 dic. 2018
 */
public class SubmatrizMaxima {

	public static void main(String[] args) {
		int[][] matriz = { { 0, 2, 4, 9, 9, 9 }, { 7, 4, 0, 9, 9, 9 }, { 1, 9, 0, 9, 9, 9 }, { 4, 9, 9, 9, 0, 9 } };

		int[][] matriz3 = maxima3(matriz);

		for (int i = 0; i < matriz3.length; i++) {
			for (int j = 0; j < matriz3.length; j++) {
				System.out.print(matriz3[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	/**
	 * Devuelve una una submatriz de tamaño (3,3), cuyos valores suman el valor
	 * máximo dentro de la matriz recibida.
	 * 
	 * @param matriz
	 * @return
	 */
	static int[][] maxima3(int[][] matriz) {

		int[][] matrizValoresMaximos = new int[3][3];

		if (matriz.length >= 3 && matriz[0].length >= 3) {

			int sumaValoresMaximos = 0; // Se alacena el valor maximo de la suma de todos los valores de una submatriz
										// matriz 3x3

			for (int i = 0; i < matriz.length - 2; i++) {
				for (int j = 0; j < matriz[0].length - 2; j++) {

					int sumaSubmatriz3x3 = matriz[i][j] + matriz[i][j + 1] + matriz[i][j + 2] + matriz[i + 1][j]
							+ matriz[i + 1][j + 1] + matriz[i + 1][j + 2] + matriz[i + 2][j] + matriz[i + 2][j + 1]
							+ matriz[i + 2][j + 2];

					if (sumaSubmatriz3x3 > sumaValoresMaximos) {

						sumaValoresMaximos = sumaSubmatriz3x3;
						matrizValoresMaximos[0][0] = matriz[i][j];
						matrizValoresMaximos[0][1] = matriz[i][j + 1];
						matrizValoresMaximos[0][2] = matriz[i][j + 2];
						matrizValoresMaximos[1][0] = matriz[i + 1][j];
						matrizValoresMaximos[1][1] = matriz[i + 1][j + 1];
						matrizValoresMaximos[1][2] = matriz[i + 1][j + 2];
						matrizValoresMaximos[2][0] = matriz[i + 2][j];
						matrizValoresMaximos[2][1] = matriz[i + 2][j + 1];
						matrizValoresMaximos[2][2] = matriz[i + 2][j + 2];

					}
				}
			}
			
		}

		return matrizValoresMaximos;

	}
}
