


//TODO: Art des Samens bestimmt, ob Samen vergraben werden kann. 2 Verschiedene Untertypen (verwendet super.Openseam()?)??

public class OpenSeam extends Fruit implements DurableSquirrelFood {

	//for crackable() Fruits
	public OpenSeam(Fruit fruit) {
		int factor = (fruit instanceof Cone ? 2 : 1); //cracked cones contain a higher fraction of ingredients than uncracked cones
		this.carb = fruit.carb * factor;
		this.fat = fruit.fat * factor;
		this.protein = fruit.protein * factor;
		this.eatWithinDays = (int)(fruit.eatWithinDays() * factor*0.5);	//cracked nuts must be eaten earlier than uncracked nuts. eatwithindays for cones stays the same.
	}


	public OpenSeam() {
		fat = 20;
		carb = 20;
		protein = 25;
		this.eatWithinDays = 90;
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
