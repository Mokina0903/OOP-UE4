
//weglassen und Squirrelfood einzeln implementieren?
public class Food implements SquirrelFood {
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
}