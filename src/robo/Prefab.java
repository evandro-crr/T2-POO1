package robo;

import java.util.Random;

public class Prefab {

	private static Random ran = new Random();

	public static Braco[] braco = { new Braco("Braço padrão", 20, 20),
			new Braco("Braço forte", 15, 25),
			new Braco("Braço resistente", 25, 15) };
	public static Perna[] perna = { new Perna("Perna padrão", 20, 20),
			new Perna("Perna agil", 15, 25), new Perna("Perna forte", 25, 15) };
	public static Torso[] torso = { new Torso("Torso padrão", 20, 50),
			new Torso("Torso grande", 10, 80),
			new Torso("Torso resistente", 30, 40) };

	public static String bracoLog = braco[0].getNome() + "\nDEF: "
			+ braco[0].getDEF() + "\nATK: " + braco[0].getATK() + "\n\n"
			+ braco[1].getNome() + "\nDEF: " + braco[1].getDEF() + "\nATK: "
			+ braco[1].getATK() + "\n\n" + braco[2].getNome() + "\nDEF: "
			+ braco[2].getDEF() + "\nATK: " + braco[2].getATK() + "\n\n";
	public static String pernaLog = perna[0].getNome() + "\nDEF: "
			+ perna[0].getDEF() + "\nAGL: " + perna[0].getAGL() + "\n\n"
			+ perna[1].getNome() + "\nDEF: " + perna[1].getDEF() + "\nAGL: "
			+ perna[1].getAGL() + "\n\n" + perna[2].getNome() + "\nDEF: "
			+ perna[2].getDEF() + "\nAGL: " + perna[2].getAGL() + "\n\n";
	public static String torsoLog = torso[0].getNome() + "\nDEF: "
			+ torso[0].getDEF() + "\nHP: " + torso[0].getHP() + "\n\n"
			+ torso[1].getNome() + "\nDEF: " + torso[1].getDEF() + "\nHP: "
			+ torso[1].getHP() + "\n\n" + torso[2].getNome() + "\nDEF: "
			+ torso[2].getDEF() + "\nHP: " + torso[2].getHP() + "\n\n";
	public static String[] bracoOps = { braco[0].getNome(), braco[1].getNome(),
			braco[2].getNome() };
	public static String[] pernaOps = { perna[0].getNome(), perna[1].getNome(),
			perna[2].getNome() };
	public static String[] torsoOps = { torso[0].getNome(), torso[1].getNome(),
			torso[2].getNome() };

	public static Robo roboAleatorio(String nome) {
		return new Robo(nome, braco[ran.nextInt(3)], perna[ran.nextInt(3)],
				torso[ran.nextInt(3)]);
	}
}
