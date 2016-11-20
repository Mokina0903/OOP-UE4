
public class Nut extends Fruit implements Crackable {

	public Nut() {
		fat = 0.3;
		carb = 0.5;
		protein = 0.2;
	}

	@Override
	public OpenSeam crack() {
		return new OpenSeam(this);

	}

	@Override
	public int eatWithinDays() {
		return 0;
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
