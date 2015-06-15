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

	// M�todos Rob�
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
		hp -= dano;
	}

	// M�todos Bra�o
	public Braco getBraco() {
		return braco;
	}

	public void setBraco(Braco braco) {
		this.braco = braco;
	}

	// M�todos Perna
	public Perna getPerna() {
		return perna;
	}

	public void setPerna(Perna perna) {
		this.perna = perna;
	}

	// M�todos Torso
	public Torso getTorso() {
		return torso;
	}

	public void setTorso(Torso torso) {
		this.torso = torso;
	}

	public double getHP() {
		return hp;
	}

	public void setHP(double hP) {
		hp = hP;
	}
}
