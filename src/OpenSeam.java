
public class OpenSeam extends Fruit implements DurableSquirrelFood {

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
