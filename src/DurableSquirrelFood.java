
public class DurableSquirrelFood implements SquirrelFood, Durable, Burryable {

    //bezieht sich auf toBeBurried
    private int eatWithinDays;

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
    public void toBeBurried() {

    }
}
