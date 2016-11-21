


public class Test {

    /*
    Aufgabe 4
    Arbeitsaufteilung:
    - Struktur, Klassen, Beziehungen, Typen, Methoden und Variablen anlegen: ganze Gruppe
    - Sonstiges:
    Isabel:
    Monika:
    Samuel:

    */

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
