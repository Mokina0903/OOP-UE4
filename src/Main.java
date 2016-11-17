//Interface Vegetarian?
//wie Schnittstellen zwischen Cone und OpenSeamen bzw. Nut und OpenSeamen implementieren?
//OpenSeamen aus Cone und Nuts haben unterschiedliche Eigenschaften...

public class Main {

    public static void main(String[] args) {

        //Fruit cherry = new FreshFruit(); // Funktioniert nicht
        FreshFruit cherry = new FreshFruit();

        System.out.println(cherry.getClass());

        cherry = cherry.dry();

        System.out.println(cherry.getClass());

    }


}
