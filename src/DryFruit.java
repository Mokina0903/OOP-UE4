
public class DryFruit extends Fruit implements DurableSquirrelFood {

	public DryFruit(FreshFruit f) {
		this.carb = f.carb*3;
		this.fat = f.fat*3;
		this.protein = f.protein*3;
	}

	public boolean toBeBuried() {
		return false;
	}

	public String toString() { return "Dry Fruit: " + super.toString(); }

	@Override
	public int eatWithinDays() {
		return 60;
	}

	@Override
	public double carb() {
		return carb;
	}

	@Override
	public double fat() {
		return fat;
	}

	@Override
	public double protein() {
		return protein;
	}

}
