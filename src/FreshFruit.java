
public class FreshFruit extends Fruit implements PerishableSquirrelFood {

	public FreshFruit() { this.protein = 8; this.carb = 15; this.fat = 5; }

	public String toString() { return "Fresh Fruit: " + super.toString(); }


	@Override
	public int eatWithinDays() {
		return 5;
	}

	@Override
	public double carb() {
		return 30;
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
		return new DryFruit(this);
	}

}
