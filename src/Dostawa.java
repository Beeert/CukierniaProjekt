/**
 * Created by Beert on 30.05.2017.
 */
public class Dostawa {

    public Dostawa dostawa(String type){
        if (type.equals("Dostawa")) {
            System.out.println("Koszt dostawy to 10zł w granicach miasta, 15 w granicach województwa.");
        } else if (type.equals("Odbiór osobisty")) {
            System.out.println("Przy odbiorze osobistym dostawa 0zł.");
        }
        return null;
    }
}
