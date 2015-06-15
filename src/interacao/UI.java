package interacao;

import javax.swing.JOptionPane;

import robo.Robo;
import competicao.Competidor;
import competicao.Torneio;

public class UI {

	public static Competidor[] cadastrarCompetidores() {

		Competidor[] competidores = new Competidor[numeroPositivo("Numero de Competidores\na ser cadastrado")];
		String[] l1 = { "Escolher Peças", "Montar aleatorio" };
		for (int i = 0; i < competidores.length; i++) {
			String nome = JOptionPane.showInputDialog("Nome do Competidor:");
			String nomeR = JOptionPane.showInputDialog("Nome do seu Robo");
			int s1 = opcoes("Peças", l1);
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
		return new Robo(nome, robo.Prefab.braco[opcoes(robo.Prefab.bracoLog,
				robo.Prefab.bracoOps)], robo.Prefab.perna[opcoes(
				robo.Prefab.pernaLog, robo.Prefab.pernaOps)],
				robo.Prefab.torso[opcoes(robo.Prefab.torsoLog,
						robo.Prefab.torsoOps)]);
	}

	public static boolean menu(boolean continuar, Torneio torneio) {
		String[] l1 = { "Relatorio Geral", "Relatorio Individual", "Sair" };
		int n1 = opcoes("Relatorio: " + torneio.getVencedor().getNome()
				+ " Venceu o torneio", l1);
		switch (n1) {
		case 0:
			JOptionPane.showMessageDialog(null, Torneio.log);
			break;
		case 1:
			JOptionPane.showMessageDialog(
					null,
					torneio.getCompetidores()[opcoes("Competidor",
							torneio.getNomes())].log);
			break;
		case 2:
			continuar = false;
			break;
		}
		return continuar;
	}

	public static int numeroPositivo(String string) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(string));
		if (n > 1)
			return n;
		else
			return numeroPositivo(string);
	}

	public static int opcoes(String string, String[] op) {
		return JOptionPane.showOptionDialog(null, string, null,
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null, op, op[0]);
	}

}
