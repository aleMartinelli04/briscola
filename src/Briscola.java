import java.util.Collections;
import java.util.List;

public class Briscola implements Runnable {
    private Giocatore primo;
    private Giocatore secondo;

    private final List<Carta> mazzo;

    private final Carta briscola;

    public Briscola(Giocatore giocatore1, Giocatore giocatore2) {
        this.primo = giocatore1;
        this.secondo = giocatore2;

        mazzo = Utils.creaMazzo();

        Collections.shuffle(mazzo);

        System.out.println(mazzo);

        briscola = mazzo.get(mazzo.size() - 1);
        System.out.println("La briscola è " + briscola);

        giocatore1.addMano(mazzo.remove(0), mazzo.remove(0), mazzo.remove(0));
        giocatore2.addMano(mazzo.remove(0), mazzo.remove(0), mazzo.remove(0));
    }

    @Override
    public void run() {
        while (true) {
            Carta carta1 = primo.scegliCarta();
            Carta carta2 = secondo.scegliCarta();

            System.out.println("Carte in tavola: " + carta1 + " - " + carta2);

            if (carta1.vinceContro(carta2, briscola.seme(), carta1.seme())) {
                System.out.println("Vince la mano " + carta1 + " di " + primo.getNome());
                primo.pigliaCarte(carta1, carta2);
            } else {
                System.out.println("Vince la mano " + carta2 + " di " + secondo.getNome());
                secondo.pigliaCarte(carta1, carta2);

                Giocatore tmp = primo;
                primo = secondo;
                secondo = tmp;
            }

            if (primo.getMano().isEmpty() && secondo.getMano().isEmpty()) {
                break;
            }

            primo.addMano(mazzo.remove(0));
            secondo.addMano(mazzo.remove(0));
        }
    }
}
