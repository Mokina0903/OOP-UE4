


public class Test {

    /*
    Aufgabe 4
    Arbeitsaufteilung:
    - Struktur, Klassen, Beziehungen, Typen, Methoden und Variablen anlegen: ganze Gruppe
    - Sonstiges:
    Isabel: toString(), Konstruktoren, crack(), dry(), Inhaltsstoffe
    Monika:
    Samuel:

    Keine Untertypbeziehungen zwischen:
        Cone, Nut und OpenSeam:
        Die drei Klassen stehen auf einer Ebene. Nut bzw. Cone koennen durch die Methode crack() in die Klasse
        OpenSeam "ueberfuehrt" werden. Es ist keine Untertypbeziehung vorhanden, da diese keine Methoden voneinander
        erben, welche nicht bereits von Fruit vererbt werden.

        FreshFruit und DryFruit:
        Auch hier sind die Klassen auf einer Ebene anzusehen. Es besteht keine Untertypbeziehung da ein FreshFruit
        keine DryFruit ist oder umgekehrt. Es soll nur eine Freshfruit in eine Dryfruit ueberfuehrt werden.

        Cone, Nut, OpenSeam, FreshFruit und DryFruit sind die Blaetter, wuerde man die Beziehungen in einem Baumdiagramm
        festhalten.

    */

    public static void main(String[] args) {
        Nut nut = new Nut();
        System.out.println(nut.fromMonth() + " - " + nut.toMonth);
        System.out.println(nut);
        System.out.println("Buried? " + nut.toBeBuried());
        OpenSeam crackedNut = nut.crack();
        System.out.println(crackedNut.fromMonth() + " - " + crackedNut.toMonth);
        System.out.println("Buried? " + crackedNut.toBeBuried());
        System.out.println(crackedNut);
        FreshFruit freshFruit = new FreshFruit();
        System.out.println(freshFruit);
        DryFruit dryFruit = freshFruit.dry();
        System.out.println(dryFruit);
        Cone cone = new Cone();
        System.out.println(cone);
        System.out.println("seams: " + cone.seams());
        System.out.println(cone.crack());
        System.out.println("seams: " + cone.seams());

    }
}
