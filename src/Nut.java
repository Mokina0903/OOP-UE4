
public class Nut extends Fruit implements Crackable, DurableSquirrelFood {

	//carb, protein und fat >= 0 && < Integer.MAX_Value;
	public Nut() {
		fat = 20;
		carb = 10;
		protein = 20;
		fromMonth = 7;
		toMonth = 11;
	}

	@Override
	public OpenSeam crack() {
		return new OpenSeam(this);

	}

	public String toString() { return "Nut: " + super.toString() + ", from " + fromMonth() + " to " + toMonth(); }

	@Override
	public int eatWithinDays() {
		return 90;
	}

	@Override
	public double carb() {
		return this.carb;
	}

	@Override
	public double fat() {
		return this.fat;
	}

	@Override
	public double protein() {
		return this.protein;
	}

	@Override
	public boolean toBeBuried() {
		return true;
	}
}
