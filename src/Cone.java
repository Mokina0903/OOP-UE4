
public class Cone extends Fruit implements Crackable {
	private int seams;


	public Cone() { this.carb = 15; this.protein = 10; this.fat = 3; this.seams = 10; }


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
	public OpenSeam crack() {
		this.seams--;
		this.protein*=0.9;
		this.fat*=0.9;
		return new OpenSeam(this);
	}

	public String toString() { return "Cone: " + super.toString(); }

	@Override
	public boolean toBeBuried() {
		return true;
	}

	public int seams() {
		return this.seams;

	}
}
