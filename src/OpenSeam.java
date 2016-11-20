
public class OpenSeam extends Fruit implements DurableSquirrelFood {

	public OpenSeam(Fruit fruit) {
		this.carb = fruit.carb*4;
		this.fat = fruit.carb*3;
		this.protein = fruit.protein*3;
	}

	@Override
	public int eatWithinDays() {
		return 0;
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

	@Override
	public boolean toBeBuried() {
		return true;
	}

}
