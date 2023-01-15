public class Main {
    public static void main(String[] args) {
        Giocatore giocatore1 = new Giocatore("Alice");
        Giocatore giocatore2 = new Giocatore("Bob");

        Briscola briscola = new Briscola(giocatore1, giocatore2);

        briscola.run();

        int punti1 = giocatore1.calcolaPunti();
        int punti2 = giocatore2.calcolaPunti();

        System.out.println(giocatore1.getNome() + " ha totalizzato " + punti1 + " punti");
        System.out.println(giocatore2.getNome() + " ha totalizzato " + punti2 + " punti");

        if (punti1 > punti2) {
            System.out.println(giocatore1.getNome() + " ha vinto!");
        } else if (punti2 > punti1) {
            System.out.println(giocatore2.getNome() + " ha vinto!");
        } else {
            System.out.println("Pareggio!");
        }
    }
}