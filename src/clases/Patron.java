package clases;

public enum Patron {
    PATRON_NOMBRE("^[A-Za-záéíóúüñÁÉÍÓÚÜÑ-]+( [A-Za-záéíóúüñÁÉÍÓÚÜÑ-]+)?, [A-Za-záéíóúüñÁÉÍÓÚÜÑ-]+( [A-Za-záéíóúüñÁÉÍÓÚÜÑ-]+)?$"),
    PATRON_EMAIL("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"),
    PATRON_IP("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"),
    PATRON_TELEFONO("^[0-9]{9}$"),
    PATRON_NICK("^[a-z0-9_]+$"),
    PATRON_CONTRA("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");

    private final String pattern;

    Patron(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}