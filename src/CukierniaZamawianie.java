/**
 * Created by *Beert on 21.05.2017.
 */
public class CukierniaZamawianie extends tortStore {

    public static void main(String[] args) {
        tortStore tortStore = new tortStore();
        Dostawa Dostawa = new Dostawa();

        Tort torcik = tortStore.zamówTort("czekoladowy","mały");
        Dostawa wyborDostawy = Dostawa.dostawa("Odbiór osobisty");

    }

}