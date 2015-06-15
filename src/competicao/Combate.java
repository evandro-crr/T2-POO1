package competicao;

import java.util.Random;

public class Combate {

	private static Random ram = new Random();

	public static Competidor luta(Competidor a, Competidor b) {

		boolean turno;
		if (a.getRobo().getAGL() >= b.getRobo().getAGL())
			turno = true;
		else
			turno = false;

		do {

			if (turno == true) {
				if (esquiva(a, b)) {
					b.log += "| " + b.getRobo().getNome() + ": recebeu "
							+ dano(a, b) + " pontos de dano\n";
					a.log += "| " + b.getRobo().getNome() + ": recebeu "
							+ dano(a, b) + " pontos de dano\n";
					b.getRobo().perdeHP(dano(a, b));
				} else {
					b.log += "| "+b.getRobo().getNome() + " esquivou \n";
					a.log += "| "+b.getRobo().getNome() + " esquivou \n";
				}

				turno = false;
			} else if (turno == false) {
				if (esquiva(b, a)) {
					a.log += "| " + a.getRobo().getNome() + ": recebeu "
							+ dano(b, a) + " pontos de dano\n";
					b.log += "| " + a.getRobo().getNome() + ": recebeu "
							+ dano(b, a) + " pontos de dano\n";
					b.getRobo().perdeHP(dano(b, a));
				} else {
					b.log += "| "+a.getRobo().getNome() + " esquivou \n";
					a.log += "| "+a.getRobo().getNome() + " esquivou \n";
				}
				turno = true;
			}

		} while (a.getRobo().getHP() > 0 && b.getRobo().getHP() > 0);

		if (a.getRobo().getHP() <= 0) {
			b.log += b.getNome() + " ganhou de " + a.getNome() + "\n";
			a.log += a.getNome() + ": robo destruido\n";
			b.getRobo().setHP(b.getRobo().getTorso().getHP());
			return b;

		} else {
			a.log += a.getNome() + " ganhou de " + b.getNome() + "\n";
			b.log += b.getNome() + ": robo destruido\n";
			a.getRobo().setHP(a.getRobo().getTorso().getHP());
			return a;
		}

	}

	private static boolean esquiva(Competidor ataque, Competidor defesa) {
		return (((100 / defesa.getRobo().getAGL()) * ataque.getRobo().getAGL()) / 2) > ram
				.nextInt(101);
	}

	private static double dano(Competidor ataque, Competidor defesa) {
		return ataque.getRobo().getATK()
				* (1 - (defesa.getRobo().getDEF() / 100));
	}

}
