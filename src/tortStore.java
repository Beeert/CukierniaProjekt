/**
 * Created by Beert on 20.05.2017.
 */
public class tortStore extends tortFactory {

    public Tort zamówTort(String rodzaj, String wielkość) {
        Tort tort;

        tort = stwórzTort(rodzaj, wielkość);
        tort.przygotuj();
        tort.pakuj();

        return tort;
    }
}
