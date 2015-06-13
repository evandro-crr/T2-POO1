package competicao;

import java.util.Arrays;

public class Torneio {

	Competidor[] competidores;
	Competidor vencedor;

	public static String log = "";

	public Torneio(Competidor[] competidores) {
		this.competidores = competidores;

		vencedor = combates(competidores);
	}

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

	public void setCompetidores(Competidor[] competidores) {
		this.competidores = competidores;
	}

	public Competidor getVencedor() {
		return vencedor;
	}

	public Competidor combates(Competidor[] competidores) {

		if (competidores.length == 2) {

			log += competidores[0].getNome() + " vs. "
					+ competidores[1].getNome() + "\n";

			competidores[0].log += competidores[0].getNome() + " vs. "
					+ competidores[1].getNome() + "\n";

			competidores[1].log += competidores[0].getNome() + " vs. "
					+ competidores[1].getNome() + "\n";

			return Combate.luta(competidores[0], competidores[1]);

		} else if (competidores.length == 1) {

			log += competidores[0].getNome() + " pulou uma rodada\n";
			competidores[0].log += competidores[0].getNome()
					+ " pulou uma rodada\n";

			return competidores[0];
		}

		Competidor[] a = Arrays.copyOfRange(competidores, 0,
				competidores.length / 2);

		Competidor[] b = Arrays.copyOfRange(competidores,
				(competidores.length / 2), competidores.length);

		Competidor aG = combates(a);
		Competidor bG = combates(b);

		log += aG.getNome() + " vs. " + bG.getNome() + "\n";
		aG.log += aG.getNome() + " vs. " + bG.getNome() + "\n";
		bG.log += aG.getNome() + " vs. " + bG.getNome() + "\n";

		return Combate.luta(aG, bG);

	}
}
