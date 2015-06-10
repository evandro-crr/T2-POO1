package robo;

public class Robo {

	private Braco braco;
	private Perna perna;
	private Torso torso;

	private String nome;
	private double HP;

	public Robo(String nome, Braco braco, Perna perna, Torso torso) {
		this.nome = nome;
		this.braco = braco;
		this.perna = perna;
		this.torso = torso;
		HP = torso.getHP();
	}

	// Métodos Robô
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		HP -= dano;
	}

	// Métodos Braço
	public Braco getBraco() {
		return braco;
	}

	public void setBraco(Braco braco) {
		this.braco = braco;
	}

	// Métodos Perna
	public Perna getPerna() {
		return perna;
	}

	public void setPerna(Perna perna) {
		this.perna = perna;
	}

	// Métodos Torso
	public Torso getTorso() {
		return torso;
	}

	public void setTorso(Torso torso) {
		this.torso = torso;
	}

	public double getHP() {
		return HP;
	}

	public void setHP(double hP) {
		HP = hP;
	}
}
