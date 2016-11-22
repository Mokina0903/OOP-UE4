
public abstract class Fruit implements VegetarianSquirrelFood {

	protected double carb;
	protected double fat;
	protected double protein;
	protected int eatWithinDays;

	//fromMonth und toMonth zwischen 1 und 12, 0 wenn Frucht in der Form nicht in der Natur auffindbar (zB.: DryFruit)
	protected int fromMonth;
	protected int toMonth;

	int fromMonth() {
		return fromMonth;
	}

	int toMonth() {
		return toMonth;
	}


        public String toString() { return "carb: " + carb + "%, fat: " + fat + "%, protein: " + protein + "%, eat within " + eatWithinDays() + " days";}

}
