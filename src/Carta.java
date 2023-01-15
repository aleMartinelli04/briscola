public record Carta(Valori valore, Semi seme) {
    public boolean vinceContro(Carta carta, Semi briscola, Semi tavola) {

        // se i semi sono diversi
        if (seme != carta.seme) {
            // se una delle due ha il seme briscola, vince quella
            if (seme == briscola) {
                return true;
            }

            if (carta.seme == briscola) {
                return false;
            }

            // se nessuna delle due ha il seme briscola, vince quella con il seme della tavola
            if (seme == tavola) {
                return true;
            }

            if (carta.seme == tavola) {
                return false;
            }
        }

        // se nessuna delle due ha il seme briscola e nessuna ha il seme della tavola, vince quella con il valore più alto
        return valore.getValore() > carta.valore.getValore();
    }

    public String toString() {
        return valore + " di " + seme;
    }
}
