package ui;
import variable.Variable;

public class ResetAll {
	private Variable v = new Variable();
	
	public void reset() {
		v.getimgshuffle().clear();
		v.setDefaultshuffleIndex();
		v.getResult().clear();
		v.setDefaultshufflecount();
		v.setDefaultfinalindex();
	}

}
