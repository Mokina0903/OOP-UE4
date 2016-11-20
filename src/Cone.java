
public class Cone extends Fruit implements Crackable {

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
	public OpenSeam crack() {
		return new OpenSeam(this);

	}

	@Override
	public boolean toBeBuried() {
		return true;
	}

}
