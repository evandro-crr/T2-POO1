package interacao;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import robo.Robo;
import competicao.Competidor;
import competicao.Torneio;

public class UI {

	public static Competidor[] cadastrarCompetidores() {

		Competidor[] competidores = new Competidor[numeroDeCompetidores("Numero de Competidores\na ser cadastrado")];

		String[] l1 = { "Escolher Peças", "Montar aleatorio" };

		for (int i = 0; i < competidores.length; i++) {

			String nome = JOptionPane.showInputDialog("Nome do Competidor:");
			String nomeDoRobo = JOptionPane.showInputDialog("Nome do seu Robo");

			int s1 = opcoes("Peças", l1);

			switch (s1) {
			case 0:
				competidores[i] = new Competidor(nome, cadastraRobo(nomeDoRobo));
				break;

			case 1:
				competidores[i] = new Competidor(nome,
						robo.Prefab.pecasAleatorias(nomeDoRobo));
				break;
			}
		}

		return competidores;

	}

	public static Robo cadastraRobo(String nome) {
		return new Robo(nome, robo.Prefab.braco[opcoes(
				robo.Prefab.bracoRelatorio, robo.Prefab.bracoOps)],
				robo.Prefab.perna[opcoes(robo.Prefab.pernaRelatorio,
						robo.Prefab.pernaOps)], robo.Prefab.torso[opcoes(
						robo.Prefab.torsoRelatorio, robo.Prefab.torsoOps)]);
	}

	public static boolean relatorios(boolean continuar, Torneio torneio) {
		String[] l1 = { "Relatorio Geral", "Relatorio Individual", "Sair" };

		int s1 = opcoes("Relatorio: " + torneio.getVencedor().getNome()
				+ " Venceu o torneio", l1);

		switch (s1) {
		case 0:
			JOptionPane.showMessageDialog(null, scroll(Torneio.getRelatorio()));
			break;

		case 1:
			JOptionPane.showMessageDialog(
					null,
					scroll(torneio.getCompetidores()[opcoes("Competidor",
							torneio.getNomes())].getRelatorio()));
			break;

		case 2:
			continuar = false;
			break;
		}

		return continuar;

	}

	public static int numeroDeCompetidores(String string) {
		int n = Integer.parseInt(JOptionPane.showInputDialog(string));

		if (n > 1)
			return n;
		else
			return numeroDeCompetidores(string);
	}

	// Cria scroll para os relatorios
	private static JScrollPane scroll(String string) {
		JTextArea area = new JTextArea(string);
		area.setRows(30);
		area.setColumns(30);
		area.setEditable(false);

		return new JScrollPane(area);

	}

	// Cria janela com os botoes do relatorio
	public static int opcoes(String string, String[] ops) {
		return JOptionPane.showOptionDialog(null, string, null,
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE,
				null, ops, ops[0]);
	}

}
