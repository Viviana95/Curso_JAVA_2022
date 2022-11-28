package planet;

public class ShowPLANETS {

	public static void main(String[] args) {		
		
		for (Planet pla : Planet.values()) {
			System.out.println(pla.toString() + " masa: " + pla.getMasa() + " radio: " + pla.getRadio());
		}

	}

}
