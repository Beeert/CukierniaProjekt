/**
 * Created by Beert on 20.05.2017.
 */
public class tortFactory {

    public Tort stwórzTort(String rodzaj, String wielkość) {
        Tort tort = null;

        if (rodzaj.equals("czekoladowy")) {
            tort = new tortCzekoladowy();
            if (wielkość.equals("mały")) {
                System.out.println("Do zapłaty 20zł.");
            }else if (wielkość.equals("średni")) {
                System.out.println("Do zapłaty 25zł.");
            }else if (wielkość.equals("duży")) {
                System.out.println("Do zapłaty 30zł.");
            }
        }else if (rodzaj.equals("kawowy")) {
            tort = new tortKawowy();
            if (wielkość.equals("mały")) {
                System.out.println("Do zapłaty 22zł.");
            }else if (wielkość.equals("średni")) {
                System.out.println("Do zapłaty 27zł.");
            }else if (wielkość.equals("duży")) {
                System.out.println("Do zapłaty 32zł.");
            }
        }else if (rodzaj.equals("truskawkowy")) {
            tort = new tortTruskawkowy();
            if (wielkość.equals("mały")) {
                System.out.println("Do zapłaty 25zł.");
            }else if (wielkość.equals("średni")) {
                System.out.println("Do zapłaty 30zł.");
            }else if (wielkość.equals("duży")) {
                System.out.println("Do zapłaty 35zł.");
            }
        }
        return tort;
    }
}
