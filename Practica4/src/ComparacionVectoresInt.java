/**
 * Programa de comparacion de vectores
 * 
 * @author nacho
 *
 */
public class ComparacionVectoresInt {

	public static void main(String[] args) {

		int[] vector1 = new int[3];
		int[] vector2 = new int[3];

		vector1[1] = -1;

		System.out.print(vectoresIntIguales(vector1, vector2));
	}

	/**
	 * Compara si dos vectores son iguales
	 * 
	 * @param vector1
	 * @param vector2
	 * @return boolean
	 */
	static boolean vectoresIntIguales(int[] vector1, int[] vector2) {

		if (vector1.length != vector2.length) {

			return false;
		}

		for (int i = 0; i < vector1.length; i++) {

			if (vector1[i] != vector2[i]) {

				return false;
			}
		}
		return true;
	}

}
