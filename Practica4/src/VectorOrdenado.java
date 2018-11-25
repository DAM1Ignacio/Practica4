/**
 * Programa que dice si un vector esta ordenado
 * 
 * @author nacho
 *
 */
public class VectorOrdenado {

	public static void main(String[] args) {

		int[] vector = { 1, 1, 2, 2, 3, 4, 4, 9 };

		System.out.println(yaOrdenadoInt(vector));
	}

	/**
	 * 
	 * @param vector
	 * @return true si esta ordenado y flase si no esta ordenado
	 */
	static boolean yaOrdenadoInt(int[] vector) {

		for (int i = 0; i < vector.length - 1; i++) {

			if (vector[i] > vector[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
