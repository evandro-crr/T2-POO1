package competicao;

import java.util.Random;

public class Combate {

	private static Random random = new Random();
	
	
	// Retorna o ganhador de uma luta
	public static Competidor luta(Competidor competidor1, Competidor competidor2) {

		boolean turno;
		// Define quem começa atacando
		if (competidor1.getRobo().getAGL() >= competidor2.getRobo().getAGL())
			turno = true;
		else
			turno = false;

		do {

			if (turno == true) {
				if (ataque(competidor1, competidor2)) {

					competidor2.setRelatorio("| "
							+ competidor2.getRobo().getNome()
							+ ": recebeu "
							+ String.format("%.2f",
									dano(competidor1, competidor2))
							+ " pontos de dano\n");

					competidor1.setRelatorio("| "
							+ competidor2.getRobo().getNome()
							+ ": recebeu "
							+ String.format("%.2f",
									dano(competidor1, competidor2))
							+ " pontos de dano\n");

					competidor2.getRobo().perdeHP(
							dano(competidor1, competidor2));

				} else {
					competidor2.setRelatorio("| "
							+ competidor2.getRobo().getNome() + " esquivou \n");

					competidor1.setRelatorio("| "
							+ competidor2.getRobo().getNome() + " esquivou \n");
				}

				turno = false;
			} else if (turno == false) {
				if (ataque(competidor2, competidor1)) {

					competidor1.setRelatorio("| "
							+ competidor1.getRobo().getNome()
							+ ": recebeu "
							+ String.format("%.2f",
									dano(competidor2, competidor1))
							+ " pontos de dano\n");

					competidor2.setRelatorio("| "
							+ competidor1.getRobo().getNome()
							+ ": recebeu "
							+ String.format("%.2f",
									dano(competidor2, competidor1))
							+ " pontos de dano\n");

					competidor1.getRobo().perdeHP(
							dano(competidor2, competidor1));

				} else {

					competidor2.setRelatorio("| "
							+ competidor1.getRobo().getNome() + " esquivou \n");

					competidor1.setRelatorio("| "
							+ competidor1.getRobo().getNome() + " esquivou \n");

				}

				turno = true;

			}

		} while (competidor1.getRobo().getHP() > 0
				&& competidor2.getRobo().getHP() > 0);

		if (competidor1.getRobo().getHP() <= 0) {

			competidor2.setRelatorio(competidor2.getNome() + " ganhou de "
					+ competidor1.getNome() + "\n\n");

			competidor1.setRelatorio(competidor1.getRobo().getNome()
					+ " destruido\n\n");

			competidor2.getRobo().setHP(
					competidor2.getRobo().getTorso().getHP());

			Torneio.setRelatorio("-" + competidor2.getNome() + " ganhou\n\n");
			return competidor2;

		} else if (competidor2.getRobo().getHP() <= 0) {

			competidor1.setRelatorio(competidor1.getNome() + " ganhou de "
					+ competidor2.getNome() + "\n\n");

			competidor2.setRelatorio(competidor2.getRobo().getNome()
					+ " destruido\n\n");

			competidor1.getRobo().setHP(
					competidor1.getRobo().getTorso().getHP());

			Torneio.setRelatorio("-" + competidor1.getNome() + " ganhou\n\n");
			return competidor1;
		}

		return null;

	}

	// Define se robo esquiva
	private static boolean ataque(Competidor atacante, Competidor defensor) {
		return (((100 / defensor.getRobo().getAGL()) * atacante.getRobo()
				.getAGL()) / 2) <= random.nextInt(101);

	}

	// Define o dano calusado
	private static double dano(Competidor atacante, Competidor defensor) {
		return (double) atacante.getRobo().getATK()
				* ((double) 1 - ((double) defensor.getRobo().getDEF() / 100));
	}

}
