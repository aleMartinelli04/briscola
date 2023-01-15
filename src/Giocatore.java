import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Giocatore {
    private static final Scanner scanner = new Scanner(System.in);
    private final String nome;
    private final List<Carta> carte;
    private final List<Carta> mano;

    public Giocatore(String nome) {
        this.nome = nome;
        this.carte = new ArrayList<>();
        this.mano = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addMano(Carta... carte) {
        Collections.addAll(mano, carte);
    }

    public List<Carta> getMano() {
        return mano;
    }

    public Carta scegliCarta() {
        System.out.println(nome + ", scegli una carta:");
        for (int i = 0; i < mano.size(); i++) {
            System.out.println((i + 1) + ") " + mano.get(i));
        }

        String input = scanner.nextLine();

        Carta carta;

        try {
            int scelta = Integer.parseInt(input);

            if (scelta < 1 || scelta > mano.size()) {
                throw new IllegalArgumentException("Scelta non valida");
            }

            carta = mano.remove(scelta - 1);

            System.out.println(nome + " ha scelto " + carta);

        } catch (Exception e) {
            carta = scegliCarta();
        }

        return carta;
    }

    public void pigliaCarte(Carta... carte) {
        Collections.addAll(this.carte, carte);
    }

    public int calcolaPunti() {
        return carte.stream()
                .mapToInt(carta -> carta.valore().getPunti())
                .sum();
    }
}
