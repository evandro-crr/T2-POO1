package competicao;

import java.util.Random;

public class Combate {

	private static Random ram = new Random();

	public static Competidor luta(Competidor a, Competidor b) {

		boolean r = ram.nextBoolean();

		if (r == true)
			return a;
		else
			return b;
	}

	// Classe que cont�m as opera��es e vari�veis de cada luta
	// Inserir algoritmos para calculo do vencedor

}
