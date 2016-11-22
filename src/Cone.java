
public class Cone extends Fruit implements Crackable {

	private int seams;

	//carb, protein, fat und seams >= 0 && < Integer.MAX_Value;
	public Cone() { this.carb = 15; this.protein = 10; this.fat = 3; this.seams = 10; }


	@Override
	public int eatWithinDays() {
		return 30;
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

	//einzelne Samen werden auf dem Zapfen geholt
	//seams, protein und fat >= 0 && < Integer.MAX_Value;
	@Override
	public OpenSeam crack() {
		this.seams--;
		this.protein*=0.9;
		this.fat*=0.9;
		return new OpenSeam(this);
	}

	public String toString() { return "Cone: " + super.toString() + ", from " + fromMonth() + " to " + toMonth(); }

	@Override
	public boolean toBeBuried() {
		return false;
	}

	public int seams() {
		return this.seams;

	}

	@Override
	int fromMonth() {
		return 11;
	}

	@Override
	int toMonth() {
		return 1;
	}
}
