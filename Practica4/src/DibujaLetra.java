/**
 * Programa para dibujar letras en tamaño 7x7
 * 
 * @author nacho
 *
 */
public class DibujaLetra {

	public static void main(String[] args) {

		String[] letran = bannerLetra('N');

		String[] letraa = bannerLetra('A');
		String[] letrac = bannerLetra('C');
		String[] letrah = bannerLetra('H');
		String[] letrao = bannerLetra('O');
		for (int i = 0; i < 7; i++) {
			System.out.println(letran[i] +" "+letraa[i]+" "+ letrac[i]+" "+letrah[i]+" "+letrao[i]);
		}
	}

	/**
	 * 
	 * @param letra
	 * @return devuelve un dibujo de la letra en 7x7
	 */
	static String[] bannerLetra(char letra) {

		String[] a = { "AAAAAAA", "A     A", "A     A", "AAAAAAA", "A     A", "A     A", "A     A" };
		String[] b = { "BBBBBB ", "B     B", "B     B", "BBBBBB ", "B     B", "B     B", "BBBBBB " };
		String[] c = { "CCCCCCC", "C      ", "C      ", "C      ", "C      ", "C      ", "CCCCCCC" };
		String[] d = { "DDDD   ", "D   DD ", "D    DD", "D     D", "D    DD", "D   DD ", "DDDD   " };
		String[] e = { "EEEEEEE", "E      ", "E      ", "EEEEEEE", "E      ", "E      ", "EEEEEEE" };
		String[] f = { "FFFFFFF", "F      ", "F      ", "FFFFFFF", "F      ", "F      ", "F      " };
		String[] g = { "GGGGGGG", "G      ", "G      ", "G  GGGG", "G     G", "G     G", "GGGGGGG" };
		String[] h = { "H     H", "H     H", "H     H", "HHHHHHH", "H     H", "H     H", "H     H" };
		String[] i = { "IIIIIII", "   I   ", "   I   ", "   I   ", "   I   ", "   I   ", "IIIIIII" };
		String[] j = { "JJJJJJJ", "   J   ", "   J   ", "   J   ", "   J   ", "   J   ", "JJJJ   " };
		String[] k = { "K     K", "K    K ", "K  K   ", "K K    ", "K   K  ", "K     K", "K     K" };
		String[] l = { "L      ", "L      ", "L      ", "L      ", "L      ", "L      ", "LLLLLLL" };
		String[] m = { "M     M", "MM   MM", "M M M M", "M  M  M", "M     M", "M     M", "M     M" };
		String[] n = { "N     N", "NN    N", "N N   N", "N  N  N", "N   N N", "N    NN", "N     N" };
		String[] o = { "OOOOOOO", "O     O", "O     O", "O     O", "O     O", "O     O", "OOOOOOO" };
		String[] p = { "PPPPPPP", "P     P", "P     P", "PPPPPPP", "P      ", "P      ", "P      " };
		String[] q = { " QQQQQ ", "Q     Q", "Q     Q", "Q     Q", "Q    Q ", "Q   QQ ", " QQQ  Q" };
		String[] r = { "RRRRRRR", "R     R", "R     R", "RRRRRRR", "R R    ", "R   R  ", "R     R" };
		String[] s = { " SSSSSS", "S      ", "S      ", " SSSSS ", "      S", "      S", "SSSSSS " };
		String[] t = { "TTTTTTT", "   T   ", "   T   ", "   T   ", "   T   ", "   T   ", "   T   " };
		String[] u = { "U     U", "U     U", "U     U", "U     U", "U     U", "U     U", "UUUUUUU" };
		String[] v = { "V     V", "V     V", "V     V", "V     V", " V   V ", "  V V  ", "   V   " };
		String[] w = { "W     W", "W     W", "W     W", "W  W  W", "W  W  W", " W W W ", "  WWW  " };
		String[] x = { "X     X", " X   X ", "  X X  ", "   X   ", "  X X  ", " X   X ", "X     X" };
		String[] y = { "Y     Y", " Y   Y ", "  Y Y  ", "   Y   ", "   Y   ", "   Y   ", "   Y   " };
		String[] z = { "ZZZZZZZ", " Z     ", "  Z    ", "   Z   ", "    Z  ", "     Z ", "ZZZZZZZ" };

		String[] noCoinciden = { "Error" };

		if (letra == 'A')
			return a;
		if (letra == 'B')
			return b;
		if (letra == 'C')
			return c;
		if (letra == 'D')
			return d;
		if (letra == 'E')
			return e;
		if (letra == 'F')
			return f;
		if (letra == 'G')
			return g;
		if (letra == 'H')
			return h;
		if (letra == 'I')
			return i;
		if (letra == 'J')
			return j;
		if (letra == 'K')
			return k;
		if (letra == 'l')
			return l;
		if (letra == 'M')
			return m;
		if (letra == 'N')
			return n;
		if (letra == 'O')
			return o;
		if (letra == 'P')
			return p;
		if (letra == 'Q')
			return q;
		if (letra == 'R')
			return r;
		if (letra == 'S')
			return s;
		if (letra == 'T')
			return t;
		if (letra == 'U')
			return u;
		if (letra == 'V')
			return v;
		if (letra == 'W')
			return w;
		if (letra == 'X')
			return x;
		if (letra == 'Y')
			return y;
		if (letra == 'Z')
			return z;

		return noCoinciden;
	}
}
