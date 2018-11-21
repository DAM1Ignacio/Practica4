/**
 * Comparacion de vectores tipo Char
 * 
 * @author nacho
 *
 */
public class ComparacionVectoresChar {

	public static void main(String[] args) {

		char vector1[] = { 'a', 'b', 'c', 'c' };
		char vector2[] = { 'a', 'b', 'c' };

		System.out.println(compararVectoresChar(vector1, vector2));

	}

	/**
	 * Compara que vector es mayor
	 * 
	 * @param vector1
	 * @param vector2
	 * @return 0 si son iguales 1 si es mayor el primero -1 si el menor es el
	 *         primero
	 */
	static int compararVectoresChar(char[] vector1, char[] vector2) {

		int longitudVectorMenor = vector1.length > vector2.length ? vector2.length : vector1.length;

		for (int i = 0; i < longitudVectorMenor; i++) {

			if (vector1[i] > vector2[i]) {

				return 1;
			}

			if (vector1[i] < vector2[i]) {

				return -1;
			}
		}
		if (vector1.length < vector2.length) {

			return -1;
		}
		if (vector1.length > vector2.length) {

			return 1;
		}
		return 0;
	}
}
