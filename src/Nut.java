
public class Nut extends Fruit implements Crackable, DurableSquirrelFood {

	public Nut() {
		fat = 20;
		carb = 10;
		protein = 20;
	}

	@Override
	public OpenSeam crack() {
		return new OpenSeam(this);

	}

	public String toString() { return "Nut: " + super.toString(); }

	@Override
	public int eatWithinDays() {
		return 90;
	}

	@Override
	public double carb() {
		return 0;
	}

	@Override
	public double fat() {
		return 0;
	}

	@Override
	public double protein() {
		return 0;
	}

	@Override
	public boolean toBeBuried() {
		return true;
	}
}
