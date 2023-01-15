public enum Valori {
    ASSO(10, 11),
    DUE(1, 0),
    TRE(9, 10),
    QUATTRO(2, 0),
    CINQUE(3, 0),
    SEI(4, 0),
    SETTE(5, 0),
    FANTE(6, 2),
    CAVALLO(7, 3),
    RE(8, 4);

    private final int valore;
    private final int punti;

    Valori(int valore, int punti) {
        this.valore = valore;
        this.punti = punti;
    }

    public int getValore() {
        return valore;
    }

    public int getPunti() {
        return punti;
    }

    public String toString() {
        return switch (this) {
            case ASSO -> "Asso";
            case DUE -> "Due";
            case TRE -> "Tre";
            case QUATTRO -> "Quattro";
            case CINQUE -> "Cinque";
            case SEI -> "Sei";
            case SETTE -> "Sette";
            case FANTE -> "Fante";
            case CAVALLO -> "Cavallo";
            case RE -> "Re";
        };
    }
}
