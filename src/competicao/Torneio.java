package competicao;

import java.util.Arrays;

public class Torneio {

	Competidor[] competidores;
	Competidor vencedor;

	private static String relatorio = "";

	public Torneio(Competidor[] competidores) {
		this.competidores = competidores;

		vencedor = combates(competidores);
	}

	// Nomes para IU.opcoes
	public String[] getNomes() {
		String[] nomes = new String[competidores.length];

		for (int i = 0; i < competidores.length; i++) {
			nomes[i] = competidores[i].getNome();
		}

		return nomes;
	}

	public Competidor[] getCompetidores() {
		return competidores;
	}

	public Competidor getVencedor() {
		return vencedor;
	}

	public static String getRelatorio() {
		return relatorio;
	}

	public static void setRelatorio(String relatorio) {
		Torneio.relatorio += relatorio;
	}

	// Realiza todos os combates
	public Competidor combates(Competidor[] competidores) {

		if (competidores.length == 2) {

			relatorio += competidores[0].getNome() + " vs. "
					+ competidores[1].getNome() + "\n";

			competidores[0].setRelatorio(competidores[0].getNome() + " vs. "
					+ competidores[1].getNome() + "\n"
					+ competidores[0].getRobo().getNome() + " vs. "
					+ competidores[1].getRobo().getNome() + "\n");
			;

			competidores[1].setRelatorio(competidores[0].getNome() + " vs. "
					+ competidores[1].getNome() + "\n"
					+ competidores[0].getRobo().getNome() + " vs. "
					+ competidores[1].getRobo().getNome() + "\n");
			;

			// Realiza luta
			return Combate.luta(competidores[0], competidores[1]);

		} else if (competidores.length == 1) {

			relatorio += competidores[0].getNome() + " pulou uma rodada\n\n";

			competidores[0].setRelatorio(competidores[0].getNome()
					+ " pulou uma rodada\n\n");

			// Não ha com quem lutar, pula uma rodada
			return competidores[0];
		}

		Competidor[] competidoresDireita = Arrays.copyOfRange(competidores, 0,
				competidores.length / 2);

		Competidor[] competidoresEsquerda = Arrays.copyOfRange(competidores,
				(competidores.length / 2), competidores.length);

		Competidor ganhadorDaDireita = combates(competidoresDireita);
		Competidor ganhadorDaEsquerda = combates(competidoresEsquerda);

		relatorio += ganhadorDaDireita.getNome() + " vs. "
				+ ganhadorDaEsquerda.getNome() + "\n";

		ganhadorDaDireita.setRelatorio(ganhadorDaDireita.getNome() + " vs. "
				+ ganhadorDaEsquerda.getNome() + "\n"
				+ ganhadorDaDireita.getRobo().getNome() + " vs. "
				+ ganhadorDaEsquerda.getRobo().getNome() + "\n");

		ganhadorDaEsquerda.setRelatorio(ganhadorDaDireita.getNome() + " vs. "
				+ ganhadorDaEsquerda.getNome() + "\n"
				+ ganhadorDaDireita.getRobo().getNome() + " vs. "
				+ ganhadorDaEsquerda.getRobo().getNome() + "\n");

		// Realiza a luta entre os semifinalistas
		return Combate.luta(ganhadorDaDireita, ganhadorDaEsquerda);

	}
}
