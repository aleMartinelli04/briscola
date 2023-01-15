import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Carta> creaMazzo() {
        List<Carta> mazzo = new ArrayList<>();

        for (Semi seme : Semi.values()) {
            for (Valori valore : Valori.values()) {
                mazzo.add(new Carta(valore, seme));
            }
        }

        return mazzo;
    }
}
