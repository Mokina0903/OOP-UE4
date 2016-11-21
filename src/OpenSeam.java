
public class OpenSeam extends Fruit implements DurableSquirrelFood {

	private int seams;

	public OpenSeam(Fruit fruit) {
		int factor = (fruit instanceof Cone ? 2 : 1);
			this.carb = fruit.carb * factor;
			this.fat = fruit.fat * factor;
			this.protein = fruit.protein * factor;
			this.eatWithinDays = (fruit).eatWithinDays();

			this.eatWithinDays = (int) ((fruit).eatWithinDays() * (factor/2));
	}

	public String toString() { return "Open Seam: " + super.toString(); }

	@Override
	public int eatWithinDays() {
		return this.eatWithinDays;
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
