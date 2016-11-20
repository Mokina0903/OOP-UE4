/**
 * Created by i on 20/11/16.
 */
public class Test {

    public static void main(String[] args) {
        Nut nut = new Nut();
        System.out.println(nut);
        OpenSeam crackedNut = nut.crack();
        System.out.println(crackedNut);
    }
}
