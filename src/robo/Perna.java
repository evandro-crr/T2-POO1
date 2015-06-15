package robo;

public class Perna extends Peca {

	private int agl;

	public Perna(String nome, int def, int agl) {
		super(nome, def);
		this.agl = agl;
	}

	public int getAGL() {
		return agl;
	}

	public void setAGL(int aGL) {
		agl = aGL;
	}

}
