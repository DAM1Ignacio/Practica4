/**
 * Programa que busca en un vector un valor y imprime la posicion en el vector
 * que ocupa dicho valor
 * 
 * @author nacho
 *
 */
public class BusquedaEnVector {

	public static void main(String[] args) {

		int[] vector = { 3, 2, 3, 4, 7, 2, 4 };

		System.out.println(buscarInt(vector, 7));
	}

	/**
	 * 
	 * @param vector
	 * @param valorBuscado
	 * @return la posicion del valor en el vector
	 */
	static String buscarInt(int[] vector, int valorBuscado) {

		for (int i = 0; i < vector.length; i++) {

			if (vector[i] == valorBuscado) {

				return String.valueOf(i);
			}
		}
		return "El numero indicado no se encuentra en el vector";
	}

}
