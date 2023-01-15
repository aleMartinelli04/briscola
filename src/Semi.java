public enum Semi {
    SPADE,
    BASTONI,
    ORI,
    COPPE;

    public String toString() {
        return switch (this) {
            case SPADE -> "Spade";
            case BASTONI -> "Bastoni";
            case ORI -> "Ori";
            case COPPE -> "Coppe";
        };
    }
}
