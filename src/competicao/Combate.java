package competicao;

import java.util.Random;

public class Combate {

	private static Random ram = new Random();

	public static Competidor luta(Competidor a, Competidor b) {

		boolean r = ram.nextBoolean();

		if (r == true) {

			Torneio.log += a.getNome() + " Ganhou\n";
			b.log += b.getNome() + " Perdeu\n";
			a.log += a.getNome() + " Ganhou\n";
			return a;
		} else {
			Torneio.log += b.getNome() + " Ganhou\n";
			b.log += b.getNome() + " Ganhou\n";
			a.log += a.getNome() + " Perdeu\n";
			return b;
		}
	}

	// Classe que cont�m as opera��es e vari�veis de cada luta
	// Inserir algoritmos para calculo do vencedor

}
