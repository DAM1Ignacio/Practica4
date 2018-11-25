/**
 * Programa para averiguar el valor mas frecuente de un vector
 * 
 * @author nacho
 *
 */
public class ValorMasRepetido {

	public static void main(String[] args) {

		int[] vector = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };

		System.out.println(masFrecuente(vector));
	}

	/**
	 * 
	 * @param vector
	 * @return el valor mas frecuente en el vector
	 */
	static int masFrecuente(int[] vector) {

		int[] repeticionDelValor = new int[vector.length];

		for (int i = 0; i < vector.length; i++) {

			for (int j = 0; j < vector.length; j++) {

				if (vector[i] == vector[j]) {

					repeticionDelValor[i]++;
				}
			}
		}
		int numeroMayor = 0;
		int posicionDelValorMasRepetido = 0;

		for (int i = 0; i < repeticionDelValor.length; i++) {

			if (repeticionDelValor[i] > numeroMayor) {

				numeroMayor = repeticionDelValor[i];
				posicionDelValorMasRepetido = i;
			}
		}

		return vector[posicionDelValorMasRepetido];
	}

}
