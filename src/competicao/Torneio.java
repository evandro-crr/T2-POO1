package competicao;

import java.util.Arrays;

public class Torneio {

	Competidor[] competidores;

	public Torneio(Competidor[] competidores) {
		this.competidores = competidores;
	}

	Competidor vencedor;

	public Competidor[] getCompetidores() {
		return competidores;
	}

	public void setCompetidores(Competidor[] competidores) {
		this.competidores = competidores;
	}

	public Competidor getVencedor() {
		return vencedor;
	}

	public void setVencedor() {
		this.vencedor = combates(competidores);
	}

	public Competidor combates(Competidor[] competidores) {

		if (competidores.length == 2) {
			System.out.println(competidores[0].getNome() + " vs. "
					+ competidores[1].getNome());
			return Combate.luta(competidores[0], competidores[1]);
		} else if (competidores.length == 1) {
			System.out.println(competidores[0].getNome() + " pulou uma rodada");
			return competidores[0];
		}

		Competidor[] a = Arrays.copyOfRange(competidores, 0,
				competidores.length / 2);

		Competidor[] b = Arrays.copyOfRange(competidores,
				(competidores.length / 2), competidores.length);

		Competidor aG = combates(a);
		Competidor bG = combates(b);

		System.out.println(aG.getNome() + " vs. " + bG.getNome());
		return Combate.luta(aG, bG);

	}

}
