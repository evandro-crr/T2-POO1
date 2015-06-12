package interacao;

import javax.swing.JOptionPane;

import robo.Robo;
import competicao.Competidor;

public class UI {

	public static Competidor[] cadastrarCompetidores() {

		Competidor[] competidores = new Competidor[numeroPositivo("Numero de Competidores\na ser cadastrado")];
		String[] l1 = { "Escolher Peças", "Montar aleatorio" };
		for (int i = 0; i < competidores.length; i++) {
			String nome = JOptionPane.showInputDialog("Nome do Competidor:");
			String nomeR = JOptionPane.showInputDialog("Nome do seu Robo");
			int s1 = ops("Peças", l1);
			switch (s1) {
			case 0:
				competidores[i] = new Competidor(nome, cadastraRobo(nomeR));

				break;
			case 1:
				competidores[i] = new Competidor(nome,
						robo.Prefab.roboAleatorio(nomeR));
				break;

			}
		}

		return competidores;

	}

	public static Robo cadastraRobo(String nome) {
		return new Robo(nome, robo.Prefab.braco[ops(robo.Prefab.bracoLog,
				robo.Prefab.bracoOps)], robo.Prefab.perna[ops(
				robo.Prefab.pernaLog, robo.Prefab.pernaOps)],
				robo.Prefab.torso[ops(robo.Prefab.torsoLog,
						robo.Prefab.torsoOps)]);
	}

	public static int numeroPositivo(String string) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(string));
		if (n > 0)
			return n;
		else
			return numeroPositivo(string);
	}

	public static int ops(String string, String[] op) {
		return JOptionPane.showOptionDialog(null, string, null,
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null, op, op[0]);
	}

}
