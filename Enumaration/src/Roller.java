public enum Roller {
    ADMINISTRATOR("Admin"),
    MODERATOR("Moderator"),
    MEMBER("Üye");

    private final String rolAdi;

    Roller(String rolAdi) {
        this.rolAdi = rolAdi;
    }

    public String getRolAdi() {
        return rolAdi;
    }
}
