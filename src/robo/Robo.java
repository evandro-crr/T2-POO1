package robo;

public class Robo {

	private Braco braco;
	private Perna perna;
	private Torso torso;

	public Robo(Braco braco, Perna perna, Torso torso) {
		super();
		this.braco = braco;
		this.perna = perna;
		this.torso = torso;
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

	public int getHP() {
		return torso.getHP();
	}

	public Braco getBraco() {
		return braco;
	}

	public void setBraco(Braco braco) {
		this.braco = braco;
	}

	public Perna getPerna() {
		return perna;
	}

	public void setPerna(Perna perna) {
		this.perna = perna;
	}

	public Torso getTorso() {
		return torso;
	}

	public void setTorso(Torso torso) {
		this.torso = torso;
	}

}
