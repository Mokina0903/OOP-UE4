
public abstract class Fruit implements VegetarianSquirrelFood {

	protected double carb;
	protected double fat;
	protected double protein;
	protected int eatWithinDays;

        public String toString() { return "carb: " + carb + "%, fat: " + fat + "%, protein: " + protein + "%, eat within " + eatWithinDays() + " days";}

}
