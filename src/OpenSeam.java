


//TODO: Art des Samens bestimmt, ob Samen vergraben werden kann. 2 Verschiedene Untertypen (verwendet super.Openseam()?)??

public class OpenSeam extends Fruit implements DurableSquirrelFood {

	//gibt Art des Samens an. 0 - sonstige Samen, 1 - geoeffnete Nuesse, 2 - geoeffnete Zapfen
	int type = 0;

	//for crackable() Fruits;
    //carb, protein, fat und eatWithinDays >= 0 && < Integer.MAX_Value;
	public OpenSeam(Fruit fruit) {
		type = (fruit instanceof Cone ? 2 : 1); //cracked cones contain a higher fraction of ingredients than uncracked cones
		this.carb = fruit.carb * type;
		this.fat = fruit.fat * type;
		this.protein = fruit.protein * type;
		this.eatWithinDays = (int)(fruit.eatWithinDays() * type *0.5);	//cracked nuts must be eaten earlier than uncracked nuts. eatwithindays for cones stays the same.
	}

	//for seams
    //carb, protein, fat und eatWithinDays >= 0 && < Integer.MAX_Value;
	public OpenSeam() {
		fat = 20;
		carb = 20;
		protein = 25;
		this.eatWithinDays = 90;
	}

	@Override
	int fromMonth() {
		if (type == 0) {
			return 3;
		}
		return 0;
	}

	@Override
	int toMonth() {
		if (type == 0) {
			return 9;
		}
		return 0;
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
		if (type == 1) {
			return false;
		}
		return true;
	}

}
