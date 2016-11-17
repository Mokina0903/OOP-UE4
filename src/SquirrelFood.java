/**
 * Created by X220 on 17.11.2016.
 */
public interface SquirrelFood {
    int eatWithinDays();    // olfactory test required if == 0,
                            //   uneatable if < 0
    double carb();          // fraction of carbon
    double fat();           // fraction of fat
    double protein();       // fraction of protein
}
