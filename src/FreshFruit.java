
public class FreshFruit extends Fruit implements PerishableSquirrelFood {

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

	public DryFruit dry() {
		DryFruit dried = new DryFruit(this);
		return dried;
	}

}
