/**
 * Programa para buscar un numero en un vector
 * 
 * @author Ignacio Belmonte 11 dic. 2018
 */
public class BuscarNumeroEnArray {

	public static void main(String[] args) {
		int[] vectorOrdenado = { 1, 2, 3, 3, 4, 5, 6 };

		System.out.println(buscarNumero(vectorOrdenado, 6));
	}

	/**
	 * Devuelve el valor de la poscion del numero a buscar en el array
	 * 
	 * @param vectorOrdenado
	 * @param numeroBuscar
	 * @return
	 */
	static String buscarNumero(int[] vectorOrdenado, int numeroBuscar) {

		String posicionNumero = "";

		for (int i = 0; i < vectorOrdenado.length; i++) {

			if (vectorOrdenado[i] == numeroBuscar) {

				posicionNumero = String.valueOf(i);
				return posicionNumero;
			}
		}

		posicionNumero = "El numero indicado no se encuentra en la array";
		return posicionNumero;
	}
}
