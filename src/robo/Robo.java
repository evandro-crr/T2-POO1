package robo;

public class Robo {

	private Braco braco;
	private Perna perna;
	private Torso torso;

	private String nome;
	private double hp;

	public Robo(String nome, Braco braco, Perna perna, Torso torso) {
		this.nome = nome;
		this.braco = braco;
		this.perna = perna;
		this.torso = torso;
		hp = torso.getHP();
	}

	public String getNome() {
		return nome;
	}

	public int getATK() {
		return braco.getATK();
	}

	public int getDEF() {
		return braco.getDEF() + perna.getDEF() + torso.getDEF();
	}

	public int getAGL() {
		return perna.getAGL();
	}

	public void perdeHP(double dano) {
		hp -= dano;
	}

	public Braco getBraco() {
		return braco;
	}

	public Perna getPerna() {
		return perna;
	}

	public Torso getTorso() {
		return torso;
	}

	public double getHP() {
		return hp;
	}

	public void setHP(double hp) {
		this.hp = hp;
	}

}
