/**
 * Created by i on 20/11/16.
 */
public class Test {

    public static void main(String[] args) {
        Nut nut = new Nut();
        System.out.println(nut);
        OpenSeam crackedNut = nut.crack();
        System.out.println(crackedNut);

        FreshFruit freshFruit = new FreshFruit();
        System.out.println(freshFruit);
        DryFruit dryFruit = freshFruit.dry();
        System.out.println(dryFruit);
        Cone cone = new Cone();
        System.out.println(cone);
        System.out.println(cone.crack());

    }
}
