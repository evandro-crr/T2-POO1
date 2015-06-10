package competicao;

public class Combate {
	Robot winner;
	
	
	Combate(Robot r1, Robot r2){
		if (r1.strength > r2.strength) {
			winner = r1;
		} else {
			winner = r2;
		}
	}
	
	Robo fight() {
		return winner;
	}
}
