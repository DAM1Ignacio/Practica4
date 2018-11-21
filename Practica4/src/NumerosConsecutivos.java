/**
 * Comprueba cuantos valores consecutibos tiene un vector
 * 
 * @author nacho
 *
 */
public class NumerosConsecutivos {

	public static void main(String[] args) {

		int vector[] = { 1, 3, 2, 1, 5, 5, 5, 2, 2, 5, 1 };

		System.out.println(maximoIntConsecutivos(vector));
	}

	/**
	 * Devuelve el maximo de valores consecutivos
	 * 
	 * @param vector
	 * @return
	 */
	static int maximoIntConsecutivos(int[] vector) {

		int valoresConsecutivos = 1;

		for (int i = 0; i < vector.length - 1; i++) {

			if (vector[i] == vector[i + 1]) {

				valoresConsecutivos++;
			}
		}

		return valoresConsecutivos;

	}
}
