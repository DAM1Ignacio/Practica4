/**
 * Programa para comprobar si una secuencia se encuentra dentro de un vector
 * 
 * @author nacho
 *
 */
public class BusquedaSecuenciasVector {

	public static void main(String[] args) {

		int[] vector = { 4, 3, 1, 4, 1, 1, 1,2,2,2 };
		int[] secuencia = { 2,2,2 };
		System.out.println(buscarSecuenciaInt(vector, secuencia));
	}

	/**
	 * Comprueba si existe una secuencia en un vector y si existe devuelve la
	 * posicion del inicio de la secuencia en el vector
	 * 
	 * @param vector
	 * @param secuencia
	 * @return inicio de la secuencia en el vector
	 */
	static String buscarSecuenciaInt(int[] vector, int[] secuencia) {

		for (int i = 0; i < vector.length -secuencia.length +1 ; i++) {

			int[] vectorComprobar = new int[secuencia.length];
			int aux = i;

			for (int j = 0; j < secuencia.length ; j++) {

				//System.out.println(aux);
				vectorComprobar[j] = vector[aux];
				aux++;
			}

			if (comprobarVectoresIguales(vectorComprobar, secuencia)) {
				return String.valueOf(i);
			}
		}
		return "No coinciden";
	}

	/**
	 * 
	 * @param vector
	 * @param vector2
	 * @return true si los dos vectores son iguales
	 */
	static boolean comprobarVectoresIguales(int[] vector, int[] vector2) {

		for (int i = 0; i < vector2.length; i++) {

			if (vector[i] != vector2[i]) {

				return false;
			}
		}
		return true;
	}

}
