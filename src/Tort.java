/**
 * Created by Beert on 21.05.2017.
 */
public abstract class Tort {

    String nazwa;
    String krem;
    String biszkopt;
    String unikatowySkładnik;

    void przygotuj() {
        System.out.println("Przygotowujemy " + nazwa);
        System.out.println("Kładziemy " + biszkopt);
        System.out.println("Dodajemy " + krem);
        System.out.println("Dodajemy " + unikatowySkładnik);
    }

    void pakuj() {
        System.out.println("Pakujemy tort do pudełka...");
    }

    public String getNazwa() {
        return nazwa;
    }
}
