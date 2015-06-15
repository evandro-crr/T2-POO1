package robo;

public class Braco extends Peca {

	private int atk;

	public Braco(String nome, int dEF, int aTK) {
		super(nome, dEF);
		atk = aTK;
	}

	public int getATK() {
		return atk;
	}

	public void setATK(int atk) {
		this.atk = atk;
	}

}
