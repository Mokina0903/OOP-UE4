
public class OpenSeam extends Fruit implements DurableSquirrelFood {

	private int seams;

	public OpenSeam(Fruit fruit) {
		if (fruit instanceof Cone) {
			this.carb = fruit.carb * 2;
			this.fat = fruit.fat * 2;
			this.protein = fruit.protein * 2;
			this.eatWithinDays = (fruit).eatWithinDays();

		} else if (fruit instanceof Nut) {
			this.carb = fruit.carb;
			this.fat = fruit.fat;
			this.protein = fruit.protein;
			this.eatWithinDays = (int) ((fruit).eatWithinDays() * 0.6);
		}
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
