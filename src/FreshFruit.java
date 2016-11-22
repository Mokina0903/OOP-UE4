
public class FreshFruit extends Fruit implements PerishableSquirrelFood {

	//carb, protein und fat >= 0 && < Integer.MAX_Value;
	public FreshFruit() { this.protein = 8; this.carb = 15; this.fat = 5; }

	public String toString() { return "Fresh Fruit: " + super.toString() + ", from " + fromMonth() + " to " + toMonth(); }


	@Override
	public int eatWithinDays() {
		return 5;
	}

	@Override
	int fromMonth() {
		return 3;
	}

	@Override
	int toMonth() {
		return 7;
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

	//dry hat keinen Effekt auf bereits getrocknete Früchte
	public DryFruit dry() {
		return new DryFruit(this);
	}

}
