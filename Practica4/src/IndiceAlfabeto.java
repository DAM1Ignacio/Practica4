/**
 * Programa para saber que posicion ocupa un caracter en el alfabeto
 * 
 * @author Ignacio Belmonte 11 dic. 2018
 */
public class IndiceAlfabeto {

	public static void main(String[] args) {
		int[] numerosLetras = indiceAfabetico("abcdefz");

		for (int i = 0; i < numerosLetras.length; i++) {
			System.out.println(numerosLetras[i]);
		}

	}

	/**
	 * Devuelve una array con la posicion de cada caracter en el alfabeto
	 * 
	 * @param cadenaCaracteresAnalizar
	 * @return
	 */
	static int[] indiceAfabetico(String cadenaCaracteresAnalizar) {

		final int NUM_CARACTERES = cadenaCaracteresAnalizar.length();

		int[] numerosLetras = new int[NUM_CARACTERES];

		for (int i = 0; i < NUM_CARACTERES; i++) {
			char caracterAnalizar = cadenaCaracteresAnalizar.charAt(i);

			numerosLetras[i] = Character.getNumericValue(caracterAnalizar) - 9;
		}

		return numerosLetras;
	}
}
